package ex05bookstore;

import java.math.BigDecimal;

public class BookManagement {

	public static void printBookOfAuthor(String msg, Book[] arr) {
		for (Book b : arr) {
			if (b.getAuthor().equalsIgnoreCase(msg)) {
				System.out.println(b);
			}
		}
	}
	
	public static void printBookOfPriceRequest(BigDecimal price, Book[] arr) {
		for (Book b : arr) {
			if (b.getUnitPrice().compareTo(price) < 1) {
				System.out.println(b);
			}
		}
	}
	
	public static void printBookOfPriceRange(BigDecimal priceFirst, BigDecimal priceLast, Book[] arr) {
		for (Book b : arr) {
			if (b instanceof TextBook) {
				if (b.getUnitPrice().compareTo(priceFirst) > 0 && b.getUnitPrice().compareTo(priceLast) < 1) {
					System.out.println(b);
				}
			}
		}
	}
	
}
