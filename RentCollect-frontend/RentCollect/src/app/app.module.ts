import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';

import { AppComponent } from './app.component';
import { TenantComponent } from './components/tenant/tenant.component';
import { LoginComponent } from './components/login/login.component';
import { HomeComponent } from './components/home/home.component';
import { AppRoutingModule } from './app-routing.module';
import { NavbarComponent } from './components/navbar/navbar.component';
import { UnitComponent } from './components/unit/unit.component';
// import { GooglePlacesDirective } from './directives/google-places.directive';
import { GooglePlaceModule } from "ngx-google-places-autocomplete";
import { AgmCoreModule } from '@agm/core';
import { LeaseComponent } from './components/lease/lease.component';
// import { AccordianModule } from 'primeng/accordian';
// import { MenuItem } from 'primeng/apZVXi';
/// <reference types="@types/googlemaps" />

@NgModule({
  declarations: [
    AppComponent,
    TenantComponent,
    LoginComponent,
    HomeComponent,
    NavbarComponent,
    UnitComponent,
    LeaseComponent
    // GooglePlacesDirective
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule,
    ReactiveFormsModule,
    GooglePlaceModule
    // AgmCoreModule.forRoot({
    //   apiKey: AIzaSyBFcG77N7PrzrBuj52yJK6YEHUj4itShAU,
    //   libraries: ["places"]
    // })

  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
