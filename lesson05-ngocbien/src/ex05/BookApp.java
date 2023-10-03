package ex05;

public class BookApp {

	public static void main(String[] args) {
		Book[] books = mockBooks();
		System.out.println("Bộ sách thuộc nhà xuất bản Nhi Đồng: ");
		for(Book book:Utils.findBooksOfPublisher(books, "Nhi Đồng")) {
			if (book != null)
				System.out.println(book);
		}
		System.out.println("Bộ sách có đơn giá nhỏ hơn 50 ");

		for(Book book:Utils.findBooksPriceLess50(books)) {
			if (book != null)
				System.out.println(book);
		}
		System.out.println("Bộ sách giáo khoa có đơn giá từ 100 đến 200: ");

		for(Book book:Utils.findBooksPriceBetween100To200(books)) {
			if (book != null)
				System.out.println(book);
		}
	}
	
	private static Book[] mockBooks() {
		return new Book[] {
				new TextBook("SGK1", 55, "Nhi Đồng", true),
				new TextBook("SGK2", 101, "Tuổi trẻ", false),
				new TextBook("SGK3", 300, "Nhi Đồng", true),
				new ReferenceBook("STK1", 70, "Tuổi trẻ" , 2),
				new ReferenceBook("STK2", 12, "Nhi Đồng" , 3),
		};
	}
}

