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
//import { GooglePlacesDirective } from './directives/google-places.directive';
import { GooglePlaceModule } from "ngx-google-places-autocomplete";
/// <reference types="@types/googlemaps" />

@NgModule({
  declarations: [
    AppComponent,
    TenantComponent,
    LoginComponent,
    HomeComponent,
    NavbarComponent,
    UnitComponent
    //GooglePlacesDirective
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule,
    ReactiveFormsModule,
    GooglePlaceModule

  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
