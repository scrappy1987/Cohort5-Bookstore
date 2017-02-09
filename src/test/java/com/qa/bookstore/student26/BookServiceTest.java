package com.qa.bookstore.student26;

import org.junit.Assert;
import org.junit.Test;

public class BookServiceTest {

	@Test
	public void testHowManyBooksStephenKingHasInStore() {
		BookService service = new BookService();
		Book IT = new Book("Stephen King", "IT", "Horror", "1998");
		service.addBook(IT);
		int count = service.howManyBooksByAuthor("Stephen King");
		Assert.assertEquals(count, 1);
	}

}
