import { TestBed, inject } from '@angular/core/testing';

import { TenantserviceService } from './tenantservice.service';

describe('TenantserviceService', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [TenantserviceService]
    });
  });

  it('should be created', inject([TenantserviceService], (service: TenantserviceService) => {
    expect(service).toBeTruthy();
  }));
});
