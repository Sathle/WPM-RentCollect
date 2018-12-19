import { Component, OnInit } from '@angular/core';
import { TenantserviceService } from 'src/app/services/tenantservice.service';
import { Tenant } from 'src/app/models/tenant.model';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-tenant',
  templateUrl: './tenant.component.html',
  styleUrls: ['./tenant.component.css']
})
export class TenantComponent implements OnInit {

  //used to output all tenants
  tenants: Tenant[] = [];
  //used to hold a singular tenant object
  tenant: Tenant = new Tenant();

  firstName: string;
  lastName: string;
  ssn: string;
  address: string;
  state: string;


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
    console.log("Adding Tenant...")
    this.tenant.firstName = this.firstName;
    console.log("First Name: " + this.tenant.firstName);
    this.tenant.lastName =  this.lastName;
    console.log("Last Name: " + this.tenant.lastName);
    this.tenant.ssn = this.ssn;
    console.log("SSN: " + this.tenant.ssn);
    

    // this.tenant.firstName =  "Mipl";
    // console.log(this.tenant.firstName)
    // this.tenant.firstName = this.firstName;
    // this.tenant.lastName = this.lastName;
    // this.tenant.ssn = this.ssn;
    // this.tenant.address = this.address;
    // console.log(this.tenant.firstName);
  }

}
