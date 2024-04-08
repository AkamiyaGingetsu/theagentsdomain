import { TestBed } from '@angular/core/testing';
import { HttpClientTestingModule, HttpTestingController } from '@angular/common/http/testing';

import { IKeyword } from '../keyword.model';
import { sampleWithRequiredData, sampleWithNewData, sampleWithPartialData, sampleWithFullData } from '../keyword.test-samples';

import { KeywordService } from './keyword.service';

const requireRestSample: IKeyword = {
  ...sampleWithRequiredData,
};

describe('Keyword Service', () => {
  let service: KeywordService;
  let httpMock: HttpTestingController;
  let expectedResult: IKeyword | IKeyword[] | boolean | null;

  beforeEach(() => {
    TestBed.configureTestingModule({
      imports: [HttpClientTestingModule],
    });
    expectedResult = null;
    service = TestBed.inject(KeywordService);
    httpMock = TestBed.inject(HttpTestingController);
  });

  describe('Service methods', () => {
    it('should find an element', () => {
      const returnedFromService = { ...requireRestSample };
      const expected = { ...sampleWithRequiredData };

      service.find(123).subscribe(resp => (expectedResult = resp.body));

      const req = httpMock.expectOne({ method: 'GET' });
      req.flush(returnedFromService);
      expect(expectedResult).toMatchObject(expected);
    });

    it('should create a Keyword', () => {
      const keyword = { ...sampleWithNewData };
      const returnedFromService = { ...requireRestSample };
      const expected = { ...sampleWithRequiredData };

      service.create(keyword).subscribe(resp => (expectedResult = resp.body));

      const req = httpMock.expectOne({ method: 'POST' });
      req.flush(returnedFromService);
      expect(expectedResult).toMatchObject(expected);
    });

    it('should update a Keyword', () => {
      const keyword = { ...sampleWithRequiredData };
      const returnedFromService = { ...requireRestSample };
      const expected = { ...sampleWithRequiredData };

      service.update(keyword).subscribe(resp => (expectedResult = resp.body));

      const req = httpMock.expectOne({ method: 'PUT' });
      req.flush(returnedFromService);
      expect(expectedResult).toMatchObject(expected);
    });

    it('should partial update a Keyword', () => {
      const patchObject = { ...sampleWithPartialData };
      const returnedFromService = { ...requireRestSample };
      const expected = { ...sampleWithRequiredData };

      service.partialUpdate(patchObject).subscribe(resp => (expectedResult = resp.body));

      const req = httpMock.expectOne({ method: 'PATCH' });
      req.flush(returnedFromService);
      expect(expectedResult).toMatchObject(expected);
    });

    it('should return a list of Keyword', () => {
      const returnedFromService = { ...requireRestSample };

      const expected = { ...sampleWithRequiredData };

      service.query().subscribe(resp => (expectedResult = resp.body));

      const req = httpMock.expectOne({ method: 'GET' });
      req.flush([returnedFromService]);
      httpMock.verify();
      expect(expectedResult).toMatchObject([expected]);
    });

    it('should delete a Keyword', () => {
      const expected = true;

      service.delete(123).subscribe(resp => (expectedResult = resp.ok));

      const req = httpMock.expectOne({ method: 'DELETE' });
      req.flush({ status: 200 });
      expect(expectedResult).toBe(expected);
    });

    describe('addKeywordToCollectionIfMissing', () => {
      it('should add a Keyword to an empty array', () => {
        const keyword: IKeyword = sampleWithRequiredData;
        expectedResult = service.addKeywordToCollectionIfMissing([], keyword);
        expect(expectedResult).toHaveLength(1);
        expect(expectedResult).toContain(keyword);
      });

      it('should not add a Keyword to an array that contains it', () => {
        const keyword: IKeyword = sampleWithRequiredData;
        const keywordCollection: IKeyword[] = [
          {
            ...keyword,
          },
          sampleWithPartialData,
        ];
        expectedResult = service.addKeywordToCollectionIfMissing(keywordCollection, keyword);
        expect(expectedResult).toHaveLength(2);
      });

      it("should add a Keyword to an array that doesn't contain it", () => {
        const keyword: IKeyword = sampleWithRequiredData;
        const keywordCollection: IKeyword[] = [sampleWithPartialData];
        expectedResult = service.addKeywordToCollectionIfMissing(keywordCollection, keyword);
        expect(expectedResult).toHaveLength(2);
        expect(expectedResult).toContain(keyword);
      });

      it('should add only unique Keyword to an array', () => {
        const keywordArray: IKeyword[] = [sampleWithRequiredData, sampleWithPartialData, sampleWithFullData];
        const keywordCollection: IKeyword[] = [sampleWithRequiredData];
        expectedResult = service.addKeywordToCollectionIfMissing(keywordCollection, ...keywordArray);
        expect(expectedResult).toHaveLength(3);
      });

      it('should accept varargs', () => {
        const keyword: IKeyword = sampleWithRequiredData;
        const keyword2: IKeyword = sampleWithPartialData;
        expectedResult = service.addKeywordToCollectionIfMissing([], keyword, keyword2);
        expect(expectedResult).toHaveLength(2);
        expect(expectedResult).toContain(keyword);
        expect(expectedResult).toContain(keyword2);
      });

      it('should accept null and undefined values', () => {
        const keyword: IKeyword = sampleWithRequiredData;
        expectedResult = service.addKeywordToCollectionIfMissing([], null, keyword, undefined);
        expect(expectedResult).toHaveLength(1);
        expect(expectedResult).toContain(keyword);
      });

      it('should return initial array if no Keyword is added', () => {
        const keywordCollection: IKeyword[] = [sampleWithRequiredData];
        expectedResult = service.addKeywordToCollectionIfMissing(keywordCollection, undefined, null);
        expect(expectedResult).toEqual(keywordCollection);
      });
    });

    describe('compareKeyword', () => {
      it('Should return true if both entities are null', () => {
        const entity1 = null;
        const entity2 = null;

        const compareResult = service.compareKeyword(entity1, entity2);

        expect(compareResult).toEqual(true);
      });

      it('Should return false if one entity is null', () => {
        const entity1 = { id: 123 };
        const entity2 = null;

        const compareResult1 = service.compareKeyword(entity1, entity2);
        const compareResult2 = service.compareKeyword(entity2, entity1);

        expect(compareResult1).toEqual(false);
        expect(compareResult2).toEqual(false);
      });

      it('Should return false if primaryKey differs', () => {
        const entity1 = { id: 123 };
        const entity2 = { id: 456 };

        const compareResult1 = service.compareKeyword(entity1, entity2);
        const compareResult2 = service.compareKeyword(entity2, entity1);

        expect(compareResult1).toEqual(false);
        expect(compareResult2).toEqual(false);
      });

      it('Should return false if primaryKey matches', () => {
        const entity1 = { id: 123 };
        const entity2 = { id: 123 };

        const compareResult1 = service.compareKeyword(entity1, entity2);
        const compareResult2 = service.compareKeyword(entity2, entity1);

        expect(compareResult1).toEqual(true);
        expect(compareResult2).toEqual(true);
      });
    });
  });

  afterEach(() => {
    httpMock.verify();
  });
});
