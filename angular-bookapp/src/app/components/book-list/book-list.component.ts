import { Component, OnInit } from '@angular/core';
import { Book } from 'src/app/common/book';
import { BookService } from 'src/app/services/book.service';

@Component({
  selector: 'app-book-list',
  templateUrl: './book-list.component.html',
  styleUrls: ['./book-list.component.css']
})
export class BookListComponent implements OnInit {

  books: Book[];

  constructor(private bookService: BookService) { }

  /* books: Book[] = [
    {
          sku: 'Text-100',
          name: 'C Programming Language',
          description: 'Learn C Programming Language',
          unitPrice: 500,
          imageUrl: 'assets/images/books/text-100.png',
          active: true,
          unitsInStock: 100,
          createdOn: new Date(),
          updatedOn: null,
    },
    {
          sku: 'Text-105',
          name: 'Python Programming Language',
          description: 'Learn Python Programming Language',
          unitPrice: 800,
          imageUrl: 'assets/images/books/text-105.png',
          active: true,
          unitsInStock: 150,
          createdOn: new Date(),
          updatedOn: null,
    },
    {
          sku: 'Text-110',
          name: 'Java8 Programming Language',
          description: 'Learn Java8 Programming Language',
          unitPrice: 400,
          imageUrl: 'assets/images/books/text-110.png',
          active: true,
          unitsInStock: 250,
          createdOn: new Date(),
          updatedOn: null,
    }
      ]; */

  ngOnInit() {
    this.listBooks();
  }

  listBooks() {
    this.bookService.getBooks().subscribe(
      // Assign the data to array of books
      data => this.books = data
       /* data => {
         console.log(data);
        } */
    );
  }

}
