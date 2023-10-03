package ex05;

public class Utils {

	private Utils() {
		// TODO Auto-generated constructor stub
	}
	
	
		public static Book[] findBooksOfPublisher(Book[] books, String publisher) {
			Book[] result = new Book[books.length];
			int count = 0 ;
			for (int i = 0; i < books.length; i++) {
				if (books[i].getPublisher() == publisher) {
					result[count] = books[i];
					count++;
				}
			}
			return result;
		}
		
		public static Book[] findBooksPriceLess50(Book[] books) {
			Book[] result = new Book[books.length];
			int count = 0;
			for (int i = 0; i < books.length; i++) {
				if (books[i].getPrice() < 50 ) {
					result[count] = books[i];
					count++;
				}
			}
			return result;
		}
		
		public static Book[] findBooksPriceBetween100To200(Book[] books) {
			Book[] result = new Book[3];
			int count = 0;
			for (int i = 0; i < 3; i++) {
				if (books[i].getPrice() >= 100 && books[i].getPrice() <= 200 ) {
					result[count] = books[i];
					count++;
				}
			}
			return result;
		}
		
		public static Book[] calculater(Book[] books) {
			
		}
}
