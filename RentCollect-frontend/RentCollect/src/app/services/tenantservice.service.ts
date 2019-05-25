import { Injectable } from '@angular/core';
import { Tenant } from '../models/tenant.model';
import { HttpClient } from '@angular/common/http';
import { retry, catchError } from 'rxjs/operators';
import { Observable, throwError } from 'rxjs';


@Injectable({
  providedIn: 'root'
})
export class TenantService {

  constructor(private http: HttpClient) { }

  tenant: Tenant;
  tenants: Tenant[];

  getTenants(): Observable<Tenant[]> {
    return this.http.get<Tenant[]> ('http://localhost:8400/RentCollect/getTenants')
      .pipe(
        retry(3),
        catchError(this.handleError)
      );
  }

  saveTenant (tenant:Tenant): Observable<Tenant> {
    console.log("In TenantService...")
    console.log(tenant);
    return this.http.put<Tenant> ('http://localhost:8400/RentCollect/saveTenant', tenant) 
      .pipe(
        catchError(this.handleError)
      );
  }

  handleError(error){
    let errorMessage = '';
    if (error.error instanceof ErrorEvent) {
      // client-side error
      errorMessage = `Error: ${error.error.message}`;
    } else {
      // server-side error
      errorMessage = `Error Code: ${error.status}\nMessage: ${error.message}`;
    }
    window.alert(errorMessage);
    return throwError(errorMessage);
  } 
}
