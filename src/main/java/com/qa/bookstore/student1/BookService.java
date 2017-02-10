package com.qa.bookstore.student1;

import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.Consumes;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/books")
@Produces(
		{MediaType.APPLICATION_JSON})
@Consumes(
		{MediaType.APPLICATION_JSON})

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

	public long howManyBooksByAuthor(String author) {
		return bookMap.values().stream().filter(eachBook -> eachBook.getAuthor().equals(author)).count();
	}
	
	public Map<Integer, Book> getAllBooks(){
		return bookMap;
	}
	
	public void addNewBook(Book book){
		
	}

}
