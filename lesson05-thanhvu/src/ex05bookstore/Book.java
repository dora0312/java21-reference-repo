package ex05bookstore;

import java.math.BigDecimal;

public class Book {

	private String bookCode;
	private BigDecimal unitPrice;
	private String author;
	
	public Book() {
	}

	public Book(String bookCode, BigDecimal unitPrice, String author) {
		super();
		this.bookCode = bookCode;
		this.unitPrice = unitPrice;
		this.author = author;
	}

	public String getBookCode() {
		return bookCode;
	}

	public void setBookCode(String bookCode) {
		this.bookCode = bookCode;
	}

	public BigDecimal getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(BigDecimal unitPrice) {
		this.unitPrice = unitPrice;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "[bookCode=" + bookCode + ", unitPrice=" + unitPrice + ", author=" + author;
	}
	
	
}
