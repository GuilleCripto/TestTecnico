import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Tutorial } from '../models/tutorial.model';
import { Figura } from '../models/figura.model';
import {ResponseService} from '../class/response';

const baseUrl = 'https://test-tecnico.herokuapp.com/api/';

@Injectable({
  providedIn: 'root'
})
export class TutorialService {

  constructor(private http: HttpClient) { }

  /*async getAll(): Promise<Array<Tutorial>> {
    const route = `getall`;
    const response = await this.http.get<ResponseService>(baseUrl).toPromise();
    return response.data;
  }*/

  getFigurasResumen(): Observable<Figura> {
    const route = `getFigurasResumen`;
    return this.http.get<Figura>(`${baseUrl}${route}`);
  }

  getAll(): Observable<Figura> {
    const route = `getAll`;
    return this.http.get<Figura>(`${baseUrl}${route}`);
  }

  get(id: any): Observable<Tutorial> {
    return this.http.get(`${baseUrl}/${id}`);
  }

  create(data: any): Observable<any> {
    const route = `post`;
    return this.http.post(`${baseUrl}${route}`, data);
  }

  update(id: any, data: any): Observable<any> {
    return this.http.put(`${baseUrl}/${id}`, data);
  }

  delete(id: any): Observable<any> {
    return this.http.delete(`${baseUrl}/${id}`);
  }

  deleteAll(): Observable<any> {
    return this.http.delete(baseUrl);
  }

  findByTitle(title: any): Observable<Figura> {
    return this.http.get<Figura>(`${baseUrl}?title=${title}`);
  }
}
