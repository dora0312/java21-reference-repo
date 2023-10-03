package exam.bai05;

import java.math.BigDecimal;

public class Book {
	private String id;
	private BigDecimal price;
	private String publisher;
	
	public Book() {
	}

	public Book(String id, BigDecimal price, String publisher) {
		this.id = id;
		this.price = price;
		this.publisher = publisher;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	@Override
	public String toString() {
		return "id=" + id + ", price=" + price + ", publisher=" + publisher;
	}
	
}
