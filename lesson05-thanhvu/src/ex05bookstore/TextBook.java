package ex05bookstore;

import java.math.BigDecimal;

public class TextBook extends Book{

	private BookStatus bookStatus;
	
	public TextBook() {
	}

	public TextBook(String bookCode, BigDecimal unitPrice, String author, BookStatus bookStatus) {
		super(bookCode, unitPrice, author);
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
		return super.toString() + ", bookStatus=" + bookStatus + "]";
	}
	
	
}
