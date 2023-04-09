import { Component } from '@angular/core';
import { UtenteApiService } from './utente-api.service';
import { IUtente } from './utente.interface';

@Component({
  selector: 'app-utente',
  templateUrl: './utente.component.html',
  styleUrls: ['./utente.component.scss']
})
export class UtenteComponent {


   utenteList: IUtente [] = [];

   constructor(private utenteApiService: UtenteApiService) {}


   ngOnInit() {
      this.utenteApiService.getUserList().subscribe(
        (result) => {
          this.utenteList = result;
        }
      )
   }

}
