package bai05;

import java.math.BigDecimal;

public class BookApp {
	public static void main(String[] args) {
		Book[] books = mockBook();
		Book[] allBook = {books[0], books[1], books[3], books[4], books[2]};
		printBook(allBook);
		printBookPrice(allBook);
	}
	
	private static Book[] mockBook() {
		return new Book[] {
				//new TextBook("SGK",BigDecimal.valueOf(20), "Nhi Đồng"),
				new TextBook("SGK",BigDecimal.valueOf(20), "Viet Nam", false, BigDecimal.valueOf(3)),
				new TextBook("SGK",BigDecimal.valueOf(60), "Nhi Đồng", false, BigDecimal.valueOf(3)),
				new TextBook("SGK",BigDecimal.valueOf(20), "Nhi Đồng", false, BigDecimal.valueOf(3)),
				new ReferenceBook("STK", BigDecimal.valueOf(50), "Việt Nam", BigDecimal.valueOf(2)),
				new ReferenceBook("STK", BigDecimal.valueOf(20), "Nhi Đồng", BigDecimal.valueOf(2)),
		};
	}
	private static void printBook(Book[] books) {
		
		for(Book bk : books) {
			if(bk.getPublicsher() == "Nhi Đồng") {
				System.out.println(bk.toString());
			}
		}
	}
	private static void printBookPrice(Book[] books) {
		System.out.println("Giá lớn hơn 50");
		for(Book bk : books) {
			if(bk.getSalesPrice().compareTo(BigDecimal.valueOf(50)) >= 0) {
				System.out.println(bk.toString());
			}
		}
	}
}
