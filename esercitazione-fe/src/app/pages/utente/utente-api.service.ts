import { HttpClient } from "@angular/common/http";
import { Injectable } from "@angular/core";
import { Observable } from "rxjs";
import { IUtente } from "./utente.interface";

@Injectable({providedIn:'root'})
export class UtenteApiService {

    private baseUrl = "http://localhost:8081";
    constructor(private http: HttpClient){}



    getUserList(): Observable<IUtente[]>{
        return this.http.get<IUtente[]>(this.baseUrl + '/utente');
    }

}