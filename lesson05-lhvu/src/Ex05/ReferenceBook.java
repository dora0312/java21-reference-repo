package Ex05;

public class ReferenceBook extends Book {
private double tax;
public ReferenceBook() {
}
public ReferenceBook(String maSach, int donGia, String nhaXuatBan, double tax) {
	super(maSach, donGia, nhaXuatBan);
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
	return "ReferenceBook"  + super.toString()+ "tax=" +tax + "]";
}

}
