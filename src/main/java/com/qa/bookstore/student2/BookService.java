package com.qa.bookstore.student2;

import java.util.HashMap;
import java.util.Map;


public class BookService {

	private static final int INITIAL_COUNT = 1;
	private Map<Integer, Book> bookMap;
	private int id;

	public BookService() {
		this.bookMap = new HashMap<Integer, Book>();
		this.id = INITIAL_COUNT;
		addToMap();
	}

	public void addBook(Book book) {
		bookMap.put(id, book);
		id++;
	}
	
	public Map<Integer, Book> getAllBooks(){
		return bookMap;
	}

	public String removeBook(int bookNumber) {
		if (bookMap.containsKey(bookNumber)) {
			bookMap.remove(bookNumber);
			return "You have succesfully removed the book ";
		}
		return "No book found with given id";
	}

	public Map<Integer, Book> getBookMap() {
		return bookMap;
	}

	public void updateBook(int positionInMap, Book newBook) {
		bookMap.put(positionInMap, newBook);
	}

	public long howManyBooksByAuthor(String author) {
		return bookMap.values().stream().filter(eachBook -> eachBook.getAuthor().equals(author)).count();
		}
	
	private void addToMap()
	{
		Book aBook = new Book("a", "v", "v", "a");
		Book bBook = new Book("a", "v", "v", "a");
		bookMap.put(1, aBook);
		bookMap.put(2, bBook);
				
				
	}

}
