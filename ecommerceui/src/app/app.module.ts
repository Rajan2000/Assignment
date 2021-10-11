import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LoginmoduleComponent } from './loginmodule/loginmodule.component';
import { RegistrationmoduleComponent } from './registrationmodule/registrationmodule.component';
import { PaymentComponent } from './payment/payment.component';
import { ShoppingorderstatusComponent } from './shoppingorderstatus/shoppingorderstatus.component';
import { ShoppingcartComponent } from './shoppingcart/shoppingcart.component';



@NgModule({
  declarations: [
    AppComponent,
    LoginmoduleComponent,
    RegistrationmoduleComponent,
    PaymentComponent,
    ShoppingorderstatusComponent,
    ShoppingcartComponent,
    
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }