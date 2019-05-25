import { Component, OnInit } from '@angular/core';
import { TenantService } from 'src/app/services/tenantservice.service';
import { Tenant } from 'src/app/models/tenant.model';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { delay } from 'rxjs/operators';

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


  constructor(private tServ: TenantService,) {}

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
    this.tenant.address = this.address;
    console.log("Address: " + this.address)
    this.tenant.state = this.state;
    console.log(this.tenant);
    this.tServ.saveTenant(this.tenant)
      .subscribe(
        data => {
          console.log("Tenant Add Request Sent");
        }, err => {
          console.log("Error in addTenant()");
        })
    delay(6000);
    location.reload();
  }
}
