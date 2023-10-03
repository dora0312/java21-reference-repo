package exam.ex05;

import java.math.BigDecimal;

public class ReferenceBook extends Book{
	private BigDecimal tax; 
	
	public ReferenceBook() {
	}

	public ReferenceBook(String id, BigDecimal price, String publisher, BigDecimal tax) {
		super(id, price, publisher);
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
		return getId() + ", "
				+ getPrice() + ", "
				+ getPublisher() + ", "
				+ getTax();
	}
}
