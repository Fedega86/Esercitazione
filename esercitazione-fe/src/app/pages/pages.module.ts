import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { LayoutModule } from '../layout/layout.module';
import { PagesComponent } from './pages.component';
import { PagesRoutingModule } from './pages-routing.module';
import {  HomeComponent} from './home/home.component';
import { NotFoundComponent } from './not-found/not-found.component';
import { RouterModule } from '@angular/router';
import { BzButtonModule, BzCardModule, BzIconModule, BzLinkModule } from 'fascinating';
import { UtenteComponent } from './utente/utente.component'



@NgModule({
  declarations: [PagesComponent, HomeComponent, NotFoundComponent, UtenteComponent ],
  imports: [
    CommonModule,
    LayoutModule,
    PagesRoutingModule,
    RouterModule,
    BzCardModule,
    BzIconModule,
    BzLinkModule,
    BzButtonModule
  ],
  exports:[PagesComponent]
})
export class PagesModule { }
