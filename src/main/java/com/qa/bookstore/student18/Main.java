package bookstore;

public class Main {

/**
 * Book info format: Author, Title, Publisher, PublishDate
 **/
	/*
	private static Book createBook(String author, String title, String publisher, String publishDate) {
		return new Book(author,title,publisher,publishDate);
	}
	*/
	
	public static void main (String[] args) {
		
		// establish service
			Service s = new Service();
		
		// add books to library
			Book book1 = Service.createBook("J K Rowling", "Harry Potter 1", "Bloomsbury Publishing", "26/06/1997");
			Book book2 = Service.createBook("Paula Hawkins", "The Girl on the Train", "Riverhead Books", "05/05/2016");
			Book book3 = Service.createBook("Jojo Moyes", "Me Before You", "Penguin", "05/01/2012");
			Book book4 = Service.createBook("David Walliams", "The Midnight Gang", "HarperCollins", "03/11/2016");
			Book book5 = Service.createBook("Lee Child", "Make Me", "Bantam Books", "24/03/2016");
	
		//add books
			s.addBook(book1);
			s.addBook(book2);
			s.addBook(book3);
			s.addBook(book4);
			s.addBook(book5);
		/*
		// print out all books
			s.viewAll(); 
			
		// remove book
			s.removeBookID(3);
		
		// print out again
			s.viewAll();
			*/
			
			s.mapToJson();

	}
	
	
}
