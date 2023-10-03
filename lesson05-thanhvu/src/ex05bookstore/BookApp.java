package ex05bookstore;

import java.math.BigDecimal;

public class BookApp {

	public static void main(String[] args) {
		Book[] arrBook = {
				new TextBook("SGK-01", BigDecimal.valueOf(22), "Nhi Đồng", BookStatus.NEW),
				new TextBook("SGK-05", BigDecimal.valueOf(120), "Mai Lan Hương", BookStatus.OLD),
				new TextBook("SGK-08", BigDecimal.valueOf(200), "Nhi Đồng", BookStatus.OLD),
				new ReferBook("STK-22", BigDecimal.valueOf(150), "Bách khoa Hà Nội", BigDecimal.valueOf(10)),
				new ReferBook("STK-48", BigDecimal.valueOf(68), "Nhi Đồng", BigDecimal.valueOf(5))
		};
		
		System.out.println("--> Toàn bộ sách thuộc nhà xuất bản Nhi Đồng: ");
		BookManagement.printBookOfAuthor("Nhi Đồng", arrBook);
		
		System.out.println();
		
		System.out.println("--> Toàn bộ sách giáo khoa có đơn giá nhỏ hơn 50: ");
		BookManagement.printBookOfPriceRequest(BigDecimal.valueOf(50), arrBook);
		
		System.out.println();
		
		System.out.println("--> Toàn bộ sách giáo khoa có đơn giá từ 100 đến 200: ");
		BookManagement.printBookOfPriceRange(BigDecimal.valueOf(100), BigDecimal.valueOf(200), arrBook);
	}
}
