package com.qa.bookstore.trainer;

public class BookStore {

	public static void main(String[] args) {
		System.out.println("About to create the bookstore application");
		System.out.println("Step 1 - creating book");
		Book it = createBook("Stephen King", "It", "Horror", "1985");
		System.out.println("Step 2 - creating the book service");
		BookService bookService = new BookService();
		System.out.println("Step 3 - add the book to the map");
		bookService.addBook(it);
		String jsonBookString = convertBooksToJson(bookService);
		System.out.println("Step 4 - This is the map converted to JSON " + jsonBookString);
		System.out.println("Step 5 - remove the entry from the map");
		String bookMessage = bookService.removeBook(2);
		System.out.println("Step 6 - the book removed message = " + bookMessage);
	}

	private static String convertBooksToJson(BookService bookService) {
		BookMapToJSONConverter converter = new BookMapToJSONConverter();
		return converter.convertMapToJson(bookService.getBookMap());
	}

	private static Book createBook(String author, String title, String genre, String yearPublished) {
		return new Book(author, title, genre, yearPublished);
	}

}
