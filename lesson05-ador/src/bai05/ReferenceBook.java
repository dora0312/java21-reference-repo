package bai05;

import java.math.BigDecimal;

public class ReferenceBook extends Book {
	private BigDecimal bookTax;
	
	public ReferenceBook() {
		// TODO Auto-generated constructor stub
	}

	public ReferenceBook(String bookId, BigDecimal salesPrice, String publicsher, BigDecimal bookTax) {
		super(bookId, salesPrice, publicsher);
		this.bookTax = bookTax;
	}

	public BigDecimal getBookTax() {
		return bookTax;
	}

	public void setBookTax(BigDecimal bookTax) {
		this.bookTax = bookTax;
	}

	@Override
	public String toString() {
		return "ReferenceBook: " + super.toString() + "[bookTax=" + bookTax + "]";
	}
	
}
