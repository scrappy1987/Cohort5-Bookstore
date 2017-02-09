package com.qa.bookstore.student29;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class BookServiceTest {

	@Test
	public void testHowManyBooksInStore() {
		BookService service = new BookService();
		Book IT = new Book("Stephan King", "IT", "Horror", "1988");
		service.addBook(IT);
		long count = service.howManyBooksByAuthor("Stephan King");
		assertEquals(count, 1);
	}

}

//something.