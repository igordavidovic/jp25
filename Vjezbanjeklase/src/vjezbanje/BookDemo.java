package vjezbanje;

import java.math.BigDecimal;

public class BookDemo {
	public BookDemo() {
		Author author = new Author("Russel", "Winderland");
		
		Book book = new Book("Developing Java Software", author, BigDecimal.valueOf(79.99));
		
		
		System.out.println(book);
		/*System.out.println(book.getTitle());
		System.out.println(book.getAuthor());
		System.out.println(book.getPrice());
		*/
	}
	
	public static void main(String[] args) {
		new BookDemo();
	}
}
