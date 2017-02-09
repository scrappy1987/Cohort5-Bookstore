package com.qa.bookstore.student26;

import java.util.HashMap;
import java.util.Map;

public class BookService {

	private static final int INITIAL_COUNT = 1;
	private Map<Integer, Book> bookMap;
	private int id;

	public BookService() {
		this.bookMap = new HashMap<Integer, Book>();
		this.id = INITIAL_COUNT;
	}

	public void addBook(Book book) {
		bookMap.put(id, book);
		id++;
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

	public int howManyBooksByAuthor(String author) {
		int count = 0;
		for (Book aBook : bookMap.values()) {
			if(aBook.getAuthor().equals("Stephen King")) {
				count++;
			}
		}
		return count;
	}

}
