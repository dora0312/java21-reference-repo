package exam.ex05;

import java.math.BigDecimal;
import java.util.Arrays;

public class BookApp {
	public static void main(String[] args) {
		Book[] books = input();
		System.out.println("\nList of books by Nhi Dong publisher:");
		display(findPublisher(books, "Nhi Đồng"));
 	}
	
	
	private static Book[] input() {
		return new Book[] {
			new TextBook("SGK1", bd(30), "Nhi Đồng", BookStatus.NEW),
			new TextBook("SGK2", bd(29), "Nhi Đồng", BookStatus.OLD),
			new TextBook("SGK3", bd(28), "Obamy", BookStatus.NEW),
			
			new ReferenceBook("STK13", bd(20) , "Obamy", bd(2)),
			new ReferenceBook("STK14", bd(30) , "Nhi Đồng", bd(4))		
		};
	}
	
	private static BigDecimal bd(double value) {
		return BigDecimal.valueOf(value);
	}
	
	public static Book[] findPublisher(Book[] books, String publisher) {
		Book[] bookByPublisher = new Book[books.length];
		int count = 0;
		for(Book book : books) {
			if(publisher.equals(book.getPublisher())){
				bookByPublisher[count++] = book;
			}
		}
		return Arrays.copyOf(bookByPublisher, count);
	}
	
	public static void display(Book[] books) {
		for (Book book : books) {
			System.out.println(book);
		}
	}
}
