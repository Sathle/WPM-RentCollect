import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { LoginComponent } from './components/login/login.component';
import { HomeComponent } from './components/home/home.component';
import { TenantComponent } from './components/tenant/tenant.component';
import { UnitComponent } from './components/unit/unit.component';

/*
ROUTES!
Routing is the mechanism used to navigate between views or pages of your
Angular app. Much like a browser manages displaying different plages based
on links clicked, the Angular Router is used to manage such navigation
in your application. It is a module, RouterModule, that defines a service
and special directives and components for use
*/
export const routes: Routes = [
    { path: '', redirectTo: '/login', pathMatch: 'full'},
    { path: 'logout', component: LoginComponent},
    { path: 'login', component: LoginComponent },
    { path: 'home', component: HomeComponent},
    { path: 'tenant', component: TenantComponent},
    { path: 'unit', component: UnitComponent}
];

@NgModule({
    imports: [RouterModule.forRoot(routes)],
    exports: [RouterModule]
})
export class AppRoutingModule {}
