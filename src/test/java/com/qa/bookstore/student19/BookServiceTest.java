package com.qa.bookstore.student19;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class BookServiceTest {

	@Test
	public void testHowManyBooksStephenKingHasInStore() {
		BookService service = new BookService();
		Book IT = new Book("Stephen King", "IT", "Horror", "1988");
		service.addBook(IT);
		long count = service.howManyBooksByAuthor("Stephen King");
		Assert.assertEquals(count, 1l);
	}

}
