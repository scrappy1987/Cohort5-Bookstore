package com.qa.bookstore.student5;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Application;

@Path("/")
public class AppController extends Application {
	
	@Inject
	private BookService bookService;
	
	@GET
	@Path("1")
	public String getBook(){
		return "This is a String";
	}
	
	
	
	

}
