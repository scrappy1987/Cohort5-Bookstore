package com.qa.bookstore.student2;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("bookstore/rs")
public class BookStore extends Application {

	private static String convertBooksToJson(BookService bookService) {
		BookMapToJSONConverter converter = new BookMapToJSONConverter();
		return converter.convertMapToJson(bookService.getBookMap());
	}

	private static Book createBook(String author, String title, String genre, String yearPublished) {
		return new Book(author, title, genre, yearPublished);
	}

}
