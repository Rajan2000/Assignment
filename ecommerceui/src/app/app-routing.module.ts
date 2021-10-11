import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { LoginmoduleComponent } from './loginmodule/loginmodule.component';
import { PaymentComponent } from './payment/payment.component';
import { RegistrationmoduleComponent } from './registrationmodule/registrationmodule.component';
import { ShoppingorderstatusComponent } from './shoppingorderstatus/shoppingorderstatus.component';

const routes: Routes = [
  {path:'login',component:LoginmoduleComponent},
  {path:'registration',component:RegistrationmoduleComponent},
  {path:'payment',component:PaymentComponent},
  {path:'shoppingorderstatus',component:ShoppingorderstatusComponent}];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }