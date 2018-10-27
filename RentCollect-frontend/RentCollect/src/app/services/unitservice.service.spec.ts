import { TestBed, inject } from '@angular/core/testing';

import { UnitserviceService } from './unitservice.service';

describe('UnitserviceService', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [UnitserviceService]
    });
  });

  it('should be created', inject([UnitserviceService], (service: UnitserviceService) => {
    expect(service).toBeTruthy();
  }));
});
