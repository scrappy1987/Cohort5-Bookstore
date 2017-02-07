package bookstore;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Map.Entry;


import java.lang.reflect.Type;
import java.util.*;
import com.google.gson.*;
import com.google.gson.reflect.TypeToken;

public class Service {

/**
* Book info format: Author, Title, Publisher, PublishDate
**/
	private Map<Integer,Book> bookStore = new HashMap<Integer, Book>();
	private int id;
	Scanner scan = new Scanner(System.in);
	
	// Book template for adding
		public static Book createBook(String author, String title, String publisher, String publishDate) {
			return new Book(author,title,publisher,publishDate);
			
		}
	
	
	// Add book to MAP
		public void addBook (Book book) {
			id++;				
			bookStore.put(id,book);
			
		}
	
	// Remove book (by ID number) from MAP
		public void removeBookID(int id) {
			
		}
	
	// See all books in inventory
		public void viewAll() {
			Set<Entry<Integer, Book>> hashSet = bookStore.entrySet();
			for (Entry<?, ?> entry:hashSet) {
				System.out.println("id: " + entry.getKey() + " | " +
						" Details - " + entry.getValue().toString());
			}
		}
		
		public void purge() {
			bookStore.clear();
		}
		
		public void userInputBook() {
			System.out.println("Enter author of book: ");
			String auth = scan.nextLine();
			System.out.println("Enter book title: ");
			String ti = scan.nextLine();
			System.out.println("Enter book publisher: ");
			String pub = scan.nextLine();
			System.out.println("Enter publish date: ");
			String date = scan.nextLine();
			Book newBook = Service.createBook(auth,ti,pub,date);
			addBook(newBook);
		}
		
		public void userDeleteBook() {
			System.out.println("Input book ID to delete");
			int id = scan.nextInt();
			if (bookStore.containsKey(id)) {
				bookStore.remove(id);
				} else {
					System.out.println("ID not found in list");
				}
			System.out.println("------------------------------------------------------------"
					+ "------------------------------------------------------------------"
					+ "-----------\nBook removed - ID:" + id); // add details
		}
		
		// convert MAP to JSON string
		public void mapToJson() {
		Gson gson = new Gson();
		String json = gson.toJson(bookStore);
		System.out.println("JSON: " + json);
		}
		
}
