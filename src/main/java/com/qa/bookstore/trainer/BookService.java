package com.qa.bookstore.trainer;

import java.util.HashMap;
import java.util.Map;

import com.google.gson.Gson;

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

	public void listGenresInMap() {
		for (Book eachBook : bookMap.values()) {
			System.out.println("This is the value of genre " + eachBook.getGenre());
		}
	}

	public String convertMapToJson() {
		Gson gson = new Gson();
		return gson.toJson(bookMap);
	}
}
