package vjezbanje;

import java.math.BigDecimal;

public class Book {
	private String title;
	private Author author;
	private BigDecimal price;
	
	public Book(String title, Author author, BigDecimal price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	
	private String bookDetails() {
		return new StringBuilder().append(title).append(" | ").append(author).append(" | ").append(price).toString();
	}

	@Override
	public String toString() {
		return bookDetails();
	}
	
	
}
