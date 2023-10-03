package ex05bookstore;

import java.math.BigDecimal;

public class ReferBook extends Book{

	private BigDecimal tax;
	
	public ReferBook() {

	}

	public ReferBook(String bookCode, BigDecimal unitPrice, String author, BigDecimal tax) {
		super(bookCode, unitPrice, author);
		this.tax = tax;
	}

	public BigDecimal getTax() {
		return tax;
	}

	public void setTax(BigDecimal tax) {
		this.tax = tax;
	}

	@Override
	public String toString() {
		return super.toString() + ", tax=" + tax + "]";
	}
	
	
}
