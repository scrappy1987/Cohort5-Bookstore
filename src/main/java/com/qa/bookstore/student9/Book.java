package com.qa.bookstore.student9;

public class Book {
	
	
	
	private String title;


	private String author;
	private String isbn;
	private String genre;

	public Book(String title, String author,  String isbn, String genre){
		this.title = title;
		this.author = author;
		this.isbn = isbn;
		this.genre = genre;
		
	}
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}
}
