import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs/internal/Observable';
import { environment } from 'src/environments/environment';
import { Persona } from 'C:/Users/oscar/Desktop/ANDRES/ARGENTINA PROGRAMA/PORTFOLIO/Portfolio_Andres_Acuna/Portfolio_Andres_Acuna/FRONTEND/src/app/model/persona'
@Injectable({
  providedIn: 'root'
})
export class HeaderService {
  private apiServerUrl=environment.apiBaseUrl;

  constructor(private http: HttpClient) { }


  public getUser():Observable<Persona> {
    return this.http.get<Persona>(`${this.apiServerUrl}/Persona/id/1`);
  }

  public updateUsuario(usuario:Persona):Observable<Persona> {
    return this.http.put<Persona>(`${this.apiServerUrl}/persona/update`, Persona);
  }
}
