package bai05;

import java.math.BigDecimal;

public class BookApp {
	public static void main(String[] args) {
		Book[] books = mockBook();
	}
	
	private static Book[] mockBook() {
		return new Book[] {
				//new TextBook("SGK",BigDecimal.valueOf(20), "Nhi Đồng"),
				new TextBook("SGK",BigDecimal.valueOf(20), "Nhi Đồng", false, BigDecimal.valueOf(3)),
				new TextBook("SGK",BigDecimal.valueOf(20), "Nhi Đồng", false, BigDecimal.valueOf(3)),
				new TextBook("SGK",BigDecimal.valueOf(20), "Nhi Đồng", false, BigDecimal.valueOf(3)),
				new ReferenceBook("STK", BigDecimal.valueOf(30), "Nhi Đồng", BigDecimal.valueOf(2)),
				new ReferenceBook("STK", BigDecimal.valueOf(20), "Nhi Đồng", BigDecimal.valueOf(2)),
		};
	}
}
