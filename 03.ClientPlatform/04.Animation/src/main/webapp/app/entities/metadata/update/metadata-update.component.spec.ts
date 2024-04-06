import { ComponentFixture, TestBed } from '@angular/core/testing';
import { HttpResponse } from '@angular/common/http';
import { HttpClientTestingModule } from '@angular/common/http/testing';
import { FormBuilder } from '@angular/forms';
import { ActivatedRoute } from '@angular/router';
import { RouterTestingModule } from '@angular/router/testing';
import { of, Subject, from } from 'rxjs';

import { MetadataService } from '../service/metadata.service';
import { IMetadata } from '../metadata.model';
import { MetadataFormService } from './metadata-form.service';

import { MetadataUpdateComponent } from './metadata-update.component';

describe('Metadata Management Update Component', () => {
  let comp: MetadataUpdateComponent;
  let fixture: ComponentFixture<MetadataUpdateComponent>;
  let activatedRoute: ActivatedRoute;
  let metadataFormService: MetadataFormService;
  let metadataService: MetadataService;

  beforeEach(() => {
    TestBed.configureTestingModule({
      imports: [HttpClientTestingModule, RouterTestingModule.withRoutes([]), MetadataUpdateComponent],
      providers: [
        FormBuilder,
        {
          provide: ActivatedRoute,
          useValue: {
            params: from([{}]),
          },
        },
      ],
    })
      .overrideTemplate(MetadataUpdateComponent, '')
      .compileComponents();

    fixture = TestBed.createComponent(MetadataUpdateComponent);
    activatedRoute = TestBed.inject(ActivatedRoute);
    metadataFormService = TestBed.inject(MetadataFormService);
    metadataService = TestBed.inject(MetadataService);

    comp = fixture.componentInstance;
  });

  describe('ngOnInit', () => {
    it('Should update editForm', () => {
      const metadata: IMetadata = { id: 456 };

      activatedRoute.data = of({ metadata });
      comp.ngOnInit();

      expect(comp.metadata).toEqual(metadata);
    });
  });

  describe('save', () => {
    it('Should call update service on save for existing entity', () => {
      // GIVEN
      const saveSubject = new Subject<HttpResponse<IMetadata>>();
      const metadata = { id: 123 };
      jest.spyOn(metadataFormService, 'getMetadata').mockReturnValue(metadata);
      jest.spyOn(metadataService, 'update').mockReturnValue(saveSubject);
      jest.spyOn(comp, 'previousState');
      activatedRoute.data = of({ metadata });
      comp.ngOnInit();

      // WHEN
      comp.save();
      expect(comp.isSaving).toEqual(true);
      saveSubject.next(new HttpResponse({ body: metadata }));
      saveSubject.complete();

      // THEN
      expect(metadataFormService.getMetadata).toHaveBeenCalled();
      expect(comp.previousState).toHaveBeenCalled();
      expect(metadataService.update).toHaveBeenCalledWith(expect.objectContaining(metadata));
      expect(comp.isSaving).toEqual(false);
    });

    it('Should call create service on save for new entity', () => {
      // GIVEN
      const saveSubject = new Subject<HttpResponse<IMetadata>>();
      const metadata = { id: 123 };
      jest.spyOn(metadataFormService, 'getMetadata').mockReturnValue({ id: null });
      jest.spyOn(metadataService, 'create').mockReturnValue(saveSubject);
      jest.spyOn(comp, 'previousState');
      activatedRoute.data = of({ metadata: null });
      comp.ngOnInit();

      // WHEN
      comp.save();
      expect(comp.isSaving).toEqual(true);
      saveSubject.next(new HttpResponse({ body: metadata }));
      saveSubject.complete();

      // THEN
      expect(metadataFormService.getMetadata).toHaveBeenCalled();
      expect(metadataService.create).toHaveBeenCalled();
      expect(comp.isSaving).toEqual(false);
      expect(comp.previousState).toHaveBeenCalled();
    });

    it('Should set isSaving to false on error', () => {
      // GIVEN
      const saveSubject = new Subject<HttpResponse<IMetadata>>();
      const metadata = { id: 123 };
      jest.spyOn(metadataService, 'update').mockReturnValue(saveSubject);
      jest.spyOn(comp, 'previousState');
      activatedRoute.data = of({ metadata });
      comp.ngOnInit();

      // WHEN
      comp.save();
      expect(comp.isSaving).toEqual(true);
      saveSubject.error('This is an error!');

      // THEN
      expect(metadataService.update).toHaveBeenCalled();
      expect(comp.isSaving).toEqual(false);
      expect(comp.previousState).not.toHaveBeenCalled();
    });
  });
});
