package Ex05;

public abstract class Book {
	private String maSach;
	private int donGia;
	private String nhaXuatBan;
	public Book() {
	}
	public Book(String maSach, int donGia, String nhaXuatBan) {
		super();
		maSach = maSach;
		donGia = donGia;
		nhaXuatBan = nhaXuatBan;
	}
	@Override
	public String toString() {
		return "Book [MaSach=" + maSach + ", DonGia=" + donGia + ", NhaXuatBan=" + nhaXuatBan + "]";
	}
	
}
