package ex05;

public class TextBook extends Book {

	private boolean status;
	
	public TextBook() {
		// TODO Auto-generated constructor stub
	}

	public TextBook(String id, double price, String publisher, boolean status) {
		super(id, price, publisher);
		this.status = status;
	}

	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
	
	@Override
	public String toString() {
		return super.toString() + ", status = " + status;
	}
}
