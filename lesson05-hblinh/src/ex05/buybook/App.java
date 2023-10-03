package ex05.buybook;

import java.util.regex.Matcher;

public class App {
		public static void main(String[] args) {
			
			double total = 0;
			Book[] books = mockBooks();
			Book[] buyBooks = {new Textbook("SGK-291",250000,"Việt Nam", 0),
					           new Referencebook("STK-23",80000 ,"Nhi Đồng",2)};
					
			System.out.println("SÁCH THUỘC NHÀ XUẤT BẢN NHI ĐỒNG");
			System.out.printf("%15s %-20s %-15s ","Mã sách","Đơn giá","NXB");
			for(Book book : books) {
				company(book);
			} 
			
			System.out.println("\nSÁCH THUỘC CÓ ĐƠN GIÁ NHỎ HƠN 50");
			System.out.printf("%15s %-20s %-15s ","Mã sách","Đơn giá","NXB");
			for(Book book : books) {
				minBook(book);
			}
			System.out.println("\nSÁCH THUỘC CÓ ĐƠN GIÁ TỪ 100 ĐẾN 200");
			System.out.printf("%15s %-20s %-15s ","Mã sách","Đơn giá","NXB");
			for(Book book : books) {
				maxminBook(book);
			}
		}
		

		private static Book books(String string, int i, String string2, int j) {
			// TODO Auto-generated method stub
			return null;
		}


		private static Book[] mockBooks() {
			return new Book[] {
					new Textbook("SGK-291",250000,"Việt Nam", 0),
					new Textbook("SGK-718",60000,"Nhi Đồng",1),
					new Textbook("SGK-111",12000,"Việt Nam", 1),
					new Referencebook("STK-23",80000 ,"Nhi Đồng",2),
					new Referencebook("STK-77",270000 ,"Nhi Đồng",3),
					
			};
		}
		public static void company(Book book) {
			if(book.getCompany()=="Nhi Đồng") {
				System.out.printf("\n%15s %-20s %-15s",book.getId(),book.getValue(),book.getCompany());
			}
		}
		public static void minBook(Book book) {
			if(book.getValue()<50000) {
				System.out.printf("\n%15s %-20s %-15s",book.getId(),book.getValue(),book.getCompany());
			}
		}
		public static void maxminBook(Book book) {
				if(book.getValue()>=50000&&book.getValue()<=200000) {
					System.out.printf("\n%15s %-20s %-15s",book.getId(),book.getValue(),book.getCompany());	
		}
		
}
		public static void totalBuyBook(Book[] buyBooks) {
			for(Book book : buyBooks) {
				if(book.getId().matches("(.*)SGK(.*)")) {
			
				}
			}
		}
}
