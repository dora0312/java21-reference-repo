package bai05;

import java.math.BigDecimal;

public class TextBook extends Book {

	private boolean bookStatus;
	private BigDecimal discount;
	
	public TextBook() {
		// TODO Auto-generated constructor stub
	}

	public TextBook(String bookId, BigDecimal salesPrice, String publicsher, boolean bookStatus, BigDecimal discount) {
		super(bookId, salesPrice, publicsher);
		this.bookStatus = bookStatus;
		this.discount = discount;
	}

	public boolean isBookStatus() {
		return bookStatus;
	}

	public void setBookStatus(boolean bookStatus) {
		this.bookStatus = bookStatus;
	}

	public BigDecimal getDiscount() {
		return discount;
	}

	public void setDiscount(BigDecimal discount) {
		this.discount = discount;
	}

	@Override
	public String toString() {
		return "TextBook" + super.toString() + "[bookStatus=" + bookStatus + ", discount=" + discount + "]";
	}
	
	
}
