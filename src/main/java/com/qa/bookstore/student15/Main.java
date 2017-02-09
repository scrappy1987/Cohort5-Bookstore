package com.qa.bookstore.student15;

public class Main {

	public static void main(String[] args) {
		
		Service serv = new Service();
		
		
		Book testBook = new Book("The Lord of the Rings","J.R.R. Tolkien", "1234567", "Fantasy");
		serv.addBookAuto("LOTR", testBook);
		
		Book testBook2 = new Book("Harry Potter and The Chamber of Secretions","J.K Rowling", "1234568", "MAGIC");
		serv.addBookAuto("HP:CoS", testBook2);
		
		serv.addBookManual();
		
		System.out.println("Before Deleting LOTR");
		System.out.println(serv.mapToJson(serv.bookMap));
		
		serv.removeBookByKey("LOTR");
		
		System.out.println("\nAfter Deleting LOTR");
		System.out.println(serv.mapToJson(serv.bookMap));
		
		serv.sc.close();
		
		String testTitle = serv.bookMap.get("HP:CoS").getTitle();
		System.out.println("Incorrect Title:"+testTitle);
		
		serv.updateBook("HP:CoS",1, "Harry Potter and the Chamber of Secrets", serv.bookMap);
		
		testTitle = serv.bookMap.get("HP:CoS").getTitle();
		System.out.println("Corrected Title"+testTitle);
		
		
	}

}
