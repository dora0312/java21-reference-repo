package ex05;

public class TextBook extends Book{
	private boolean status;

	public TextBook() {
	}

	public TextBook(String id, float price, String publisher, boolean status) {
		super(id, price, publisher);
		this.status = status;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Textbook [" + super.toString() + "status=" + status + "]";
	}
	
}
