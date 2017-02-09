package com.qa.bookstore.student17;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class BookServiceTest {

	@Test
	public void testHowManyBooksStephenKingsHasInStore() {
		BookService service = new BookService();
		Book IT = new Book("Stephen King", "IT", "Horror", "1988");
		service.addBook(IT);
		long count = service.howManyBooksByAuthor("Stephen King");
		Assert.assertEquals(1, count);
	}

}
