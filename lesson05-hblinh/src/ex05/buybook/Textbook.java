package ex05.buybook;

public class Textbook extends Book {
	private int status;
	public Textbook() {
		// TODO Auto-generated constructor stub
	}
	public Textbook(String id, double value, String company, int status) {
		super(id, value, company);
		this.status = status;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Textbook [status=" + status + "]";
	}
	
	
}
