import { TestBed } from '@angular/core/testing';

import { sampleWithRequiredData, sampleWithNewData } from '../keyword.test-samples';

import { KeywordFormService } from './keyword-form.service';

describe('Keyword Form Service', () => {
  let service: KeywordFormService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(KeywordFormService);
  });

  describe('Service methods', () => {
    describe('createKeywordFormGroup', () => {
      it('should create a new form with FormControl', () => {
        const formGroup = service.createKeywordFormGroup();

        expect(formGroup.controls).toEqual(
          expect.objectContaining({
            id: expect.any(Object),
            word: expect.any(Object),
          }),
        );
      });

      it('passing IKeyword should create a new form with FormGroup', () => {
        const formGroup = service.createKeywordFormGroup(sampleWithRequiredData);

        expect(formGroup.controls).toEqual(
          expect.objectContaining({
            id: expect.any(Object),
            word: expect.any(Object),
          }),
        );
      });
    });

    describe('getKeyword', () => {
      it('should return NewKeyword for default Keyword initial value', () => {
        const formGroup = service.createKeywordFormGroup(sampleWithNewData);

        const keyword = service.getKeyword(formGroup) as any;

        expect(keyword).toMatchObject(sampleWithNewData);
      });

      it('should return NewKeyword for empty Keyword initial value', () => {
        const formGroup = service.createKeywordFormGroup();

        const keyword = service.getKeyword(formGroup) as any;

        expect(keyword).toMatchObject({});
      });

      it('should return IKeyword', () => {
        const formGroup = service.createKeywordFormGroup(sampleWithRequiredData);

        const keyword = service.getKeyword(formGroup) as any;

        expect(keyword).toMatchObject(sampleWithRequiredData);
      });
    });

    describe('resetForm', () => {
      it('passing IKeyword should not enable id FormControl', () => {
        const formGroup = service.createKeywordFormGroup();
        expect(formGroup.controls.id.disabled).toBe(true);

        service.resetForm(formGroup, sampleWithRequiredData);

        expect(formGroup.controls.id.disabled).toBe(true);
      });

      it('passing NewKeyword should disable id FormControl', () => {
        const formGroup = service.createKeywordFormGroup(sampleWithRequiredData);
        expect(formGroup.controls.id.disabled).toBe(true);

        service.resetForm(formGroup, { id: null });

        expect(formGroup.controls.id.disabled).toBe(true);
      });
    });
  });
});
