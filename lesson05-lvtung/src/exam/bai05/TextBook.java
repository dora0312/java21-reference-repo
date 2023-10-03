package exam.bai05;

import java.math.BigDecimal;

public class TextBook extends Book{
	private BookStatus bookStatus; 
	
	public TextBook() {
	}

	public TextBook(String id, BigDecimal price, String publisher, BookStatus bookStatus) {
		super(id, price, publisher);
		this.bookStatus = bookStatus;
	}
	
	public BookStatus getBookStatus() {
		return bookStatus;
	}
	
	public void setBookStatus(BookStatus bookStatus) {
		this.bookStatus = bookStatus;
	}
	
	@Override
	public String toString() {
		return super.toString() + " BookStatus: " + bookStatus + "\n";
	}
}
