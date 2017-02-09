package com.qa.bookstore.student28;

import static org.junit.Assert.*;

import org.junit.Test;

public class BookServiceTest {

	@Test
	public void testHowManyBooksStephenKingHasInStore() {
		BookService service = new BookService();
		Book It = new Book("Stephen King", "IT", "Horror", "1988");
		service.addBook(It);
		long count = service.howManyBooksByAuthor("Stephen King");
		assertEquals(count, 1);
	}

}
