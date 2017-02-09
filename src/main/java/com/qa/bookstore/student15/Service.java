package com.qa.bookstore.student15;

import com.google.gson.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Service {
	Map<String, Book> bookMap = new HashMap<>();
	Scanner sc = new Scanner(System.in);

	public void addBookManual() {
		Book book = createBookManual();

		System.out.println("Enter key to refer to this book");
		String key = sc.nextLine();

		bookMap.put(key, book);
	}

	public void addBookAuto(String key, Book book) {
		bookMap.put(key, book);
	}

	public void removeBookByKey(String keyTitle) {
		bookMap.remove(keyTitle);
	}

	public void listKeys(Map<String, Book> bookMap) {
		for (Map.Entry<String, Book> map : bookMap.entrySet()) {
			String key = map.getKey();
			System.out.println(key);
		}
	}

	public Book createBookManual() {
		System.out.println("Enter Title");
		String title = sc.nextLine();
		System.out.println("Enter Author");
		String author = sc.nextLine();
		System.out.println("Enter ISBN");
		String isbn = sc.nextLine();
		System.out.println("Enter Genre");
		String genre = sc.nextLine();
		Book book = new Book(title, author, isbn, genre);
		return book;
	}
	
	public String bookToJson(Book book){
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		JsonParser jp = new JsonParser();
		JsonElement je = jp.parse(gson.toJson(book));
		String bookJsonString = gson.toJson(je);
		return bookJsonString;
	}
	
	public String mapToJson(Map<String,Book> map){
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		JsonParser jp = new JsonParser();
		JsonElement je = jp.parse(gson.toJson(map));
		String mapJsonString = gson.toJson(je);
		return mapJsonString;
	}
	
	

 	public void updateBook(String keyToUpdate, int option, String newValue,  Map<String, Book> bookMap) {
		Book b =  bookMap.get(keyToUpdate);

		switch (option) {
			case 1: {
				b.setTitle(newValue);
				break;
			}
			case 2: {
				b.setAuthor(newValue);
				break;
			}
			case 3:{
				b.setIsbn(newValue);
				break;
			}
			case 4:{
				b.setGenre(newValue);
				break;
			}
		}
		
		
	}

}
