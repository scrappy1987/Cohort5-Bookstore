package com.qa.booksotre.sudent14;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.qa.bookstore.student14.Book;
import com.qa.bookstore.student14.BookService;

public class BookServiceTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	
	
	@Test
	public void howManyBooksStephenKingHasInStore() {
		BookService service = new BookService();
		Book book = new Book("Stephen King","IT","Horror","1988");
		service.addBook(book);
		long count = service.howManyNamesByAuthor("Stephen King");
		assertEquals(count, 1);
	}

}
