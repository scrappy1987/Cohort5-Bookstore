package bookstore;

public class Book {
	
	private String author, title, publisher, publishDate;
	
	public Book(String author, String title, String publisher, String publishDate) {
		this.author = author;
		this.title = title;
		this.publisher = publisher;
		this.publishDate = publishDate;
	}

	@Override
	public String toString(){
		return "Author: " + author + "\tTitle: " + title + "\t"
				+ "Publisher: " + publisher + "\tPublish Date: " + publishDate;
	}
}
