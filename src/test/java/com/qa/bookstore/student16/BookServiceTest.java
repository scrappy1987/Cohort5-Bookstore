package com.qa.bookstore.student16;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class BookServiceTest {

	@Test
	public void testHowManyBooksStephanKingHasInStore() {
		BookService service = new BookService();

		Book book = new Book("Stephan King", "IT", "Horror", "1988");
		service.addBook(book);

		long count = service.howManyBooksByAuthor("Stephan King");
		Assert.assertEquals(1, count);
	}
}
