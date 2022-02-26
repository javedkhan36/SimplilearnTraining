import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { ProductsComponent } from './products/products.component';
import { ProductComponent } from './products/product/product.component';
import { CockpitComponent } from './products/cockpit/cockpit.component';
import { FormsModule } from '@angular/forms';
import { NumbersComponent } from './numbers/numbers.component';
import { AccountsComponent } from './accounts/accounts.component';
import { AccountComponent } from './accounts/account/account.component';
import { NewAccountComponent } from './accounts/new-account/new-account.component';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { UsersComponent } from './users/users.component';
import { BlogpostsComponent } from './blogposts/blogposts.component';
import { HttpClientModule } from '@angular/common/http';

const appRoutes: Routes = [
  { path: '', component: HomeComponent },
  { path: 'products', component: ProductsComponent },
  { path: 'accounts', component: AccountsComponent },
  { path: 'numbers', component: NumbersComponent },
  { path: 'users', component: UsersComponent },
  { path: 'blogposts', component: BlogpostsComponent },
];

@NgModule({
  declarations: [
    AppComponent,
    ProductsComponent,
    ProductComponent,
    CockpitComponent,
    NumbersComponent,
    AccountsComponent,
    AccountComponent,
    NewAccountComponent,
    HomeComponent,
    UsersComponent,
    BlogpostsComponent
  ],
  imports: [
    BrowserModule , FormsModule, 
    RouterModule.forRoot(appRoutes),
    HttpClientModule],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
