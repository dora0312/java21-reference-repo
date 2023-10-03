package ex05.buybook;

public class Referencebook extends Book {
	public double tax;
	public Referencebook() {
		// TODO Auto-generated constructor stub
	}
	public Referencebook(String id, double value, String company, double tax) {
		super(id, value, company);
		this.tax = tax;
	}
	public double getTax() {
		return tax;
	}
	public void setTax(double tax) {
		this.tax = tax;
	}
	@Override
	public String toString() {
		return "Referencebook [tax=" + tax + "]";
	}
	
}
