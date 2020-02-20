import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { map } from 'rxjs/operators';
import { Book } from '../common/book';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class BookService {

  private baseUrl = 'http://localhost:8079/api/v1/books';

  constructor(private httpClient: HttpClient) { }

  getBooks(): Observable<Book[]> {
    return this.httpClient.get<GetJSONResponseBooks>(this.baseUrl).pipe(
      map(response => response._embedded.books)
    );
  }
}

// This interface will unwrap the book array from the JSON response.
interface GetJSONResponseBooks {
  _embedded: {
    books: Book[];
  };
}
