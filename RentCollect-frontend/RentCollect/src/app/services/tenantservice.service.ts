import { Injectable } from '@angular/core';
import { Tenant } from '../models/tenant.model';
import { HttpClient } from '@angular/common/http';



@Injectable({
  providedIn: 'root'
})
export class TenantserviceService {

  constructor(private http: HttpClient) { }

  tenant: Tenant;
  tenants: Tenant[];

  public getTenants() {
    return this.http.get<Tenant[]> ('http://localhost:8400/RentCollect/getTenants');
  }

  public saveTenant() {
    return this.http.get<Tenant[]> ('http://localhost:8400/RentCollect/saveTenant');
  }
}
