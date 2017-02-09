package com.qa.bookstore.student15;

import org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class BookServiceTest {

	@Test
	public void testHowManyBooksStephenKingHasInStore() {
		Service serv = new Service();
		Book IT = new Book("IT", "Stephen King", "blah", "Horror");
		serv.addBookAuto("IT", IT);
		long count = serv.howManyBooksByAuthorStream("Stephen King");
		Assert.assertEquals(1, count);
	}

}
