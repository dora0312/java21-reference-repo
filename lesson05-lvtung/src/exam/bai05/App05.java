package exam.bai05;

import java.math.BigDecimal;
import java.util.Arrays;

public class App05 {
	
	public static void main(String[] args) {
		Book[] books = mockBooks();
		System.out.println(Arrays.toString(findBooksByPublisher(books, "Nhi Đồng")));
	}

	private static Book[] mockBooks() {
		return  new Book[] { 
				new TextBook("SGK-291", bd(20), "Việt Nam", BookStatus.NEW),
				new TextBook("SGK-718", bd(30), "Nhi Đồng", BookStatus.NEW),
				new TextBook("SGK-111", bd(20), "Việt Nam", BookStatus.NEW),
				new ReferenceBook("STK-23", bd(20), "Nhi Đồng", bd(2)),
				new ReferenceBook("STK-77", bd(30), "Nhi Đồng", bd(4)) };
	}
	
	private static BigDecimal bd(double value) {
		return BigDecimal.valueOf(value);
	}
	
//	private static Book[] findIf(Book[] books, String publisher) {
//		
//	}
	
	
	private static Book[] findBooksByPublisher(Book[] books, String publisher) {
		int count = 0;
	    for (Book book : books) {
	        if (book.getPublisher().equals("Nhi Đồng")) {
	            count++;
	        }
	    }

	    Book[] result = new Book[count];
	    
	    int index = 0;
	    
	    for (Book book : books) {
	        if (book.getPublisher().equals("Nhi Đồng")) {
	            result[index] = book;
	            index++;
	        }
	    }

	    return result;
	}
	

//	private static Book[] findBooksByPrice(Book[] books, String publisher) {
//		int count = 0;
//	    for (Book book : books) {
//	        if (book.getPrice() > bd(50)) {
//	            count++;
//	        }
//	    }
//
//	    Book[] result = new Book[count];
//	    
//	    int index = 0;
//	    
//	    for (Book book : books) {
//	        if (book.getPublisher().equals("Nhi Đồng")) {
//	            result[index] = book;
//	            index++;
//	        }
//	    }
//
//	    return result;
//	}
}
