package bai05;

import java.math.BigDecimal;

public class Book {
	private String bookId;
	private BigDecimal salesPrice;
	private String publicsher;
	
	public Book() {
		
	}

	public Book(String bookId, BigDecimal salesPrice, String publicsher) {
		this.bookId = bookId;
		this.salesPrice = salesPrice;
		this.publicsher = publicsher;
	}

	public String getBookId() {
		return bookId;
	}

	public void setBookId(String bookId) {
		this.bookId = bookId;
	}

	public BigDecimal getSalesPrice() {
		return salesPrice;
	}

	public void setSalesPrice(BigDecimal salesPrice) {
		this.salesPrice = salesPrice;
	}

	public String getPublicsher() {
		return publicsher;
	}

	public void setPublicsher(String publicsher) {
		this.publicsher = publicsher;
	}

	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", salesPrice=" + salesPrice + ", publicsher=" + publicsher + "]";
	}
	
	
	
	
}
