import { Component, OnInit } from '@angular/core';
import { TenantserviceService } from 'src/app/services/tenantservice.service';
import { Tenant } from 'src/app/models/tenant.model';

@Component({
  selector: 'app-tenant',
  templateUrl: './tenant.component.html',
  styleUrls: ['./tenant.component.css']
})
export class TenantComponent implements OnInit {

  tenants: Tenant[] = [];
  tenant: Tenant;

  firstname: string;
  lastname: string;

  constructor(private tServ: TenantserviceService,) {}

  ngOnInit() {
    this.tServ.getTenants().subscribe(
      data => {
        this.tenants = data;
        console.log (this.tenants);
        
      } 
    )
  }

  addTenant() {
    this.tenant.firstName = this.firstname;
    console.log(this.firstname)
  }

}
