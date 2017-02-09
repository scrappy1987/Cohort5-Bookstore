package com.qa.bookstore.student11;

import org.junit.Assert;
import org.junit.Test;

public class BookServiceTest {

	
	@Test
	public void testHowManyBooksStephenKingHasInStore() {
		
		BookService service = new BookService();
		
		Book IT = new Book("Stephen King", "IT", "Horror", "1998");
		service.addBook(IT);
		long numBooks = service.howManyBooksByAuthor("Stephen King");
		
		Assert.assertEquals(1, numBooks);
	}

}
