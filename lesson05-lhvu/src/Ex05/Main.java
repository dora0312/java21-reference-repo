package Ex05;

// Khách hàng: Mã khách hàng, họ tên, số điện thoại, địa chỉ
// Sách giáo khoa: Mã sách, đơn giá, nhà xuất bản, tình trạng (mới, cũ).
// Sách tham khảo: Mã sách, đơn giá, nhà xuất bản, thuế %.

public class Main {
	public static void main(String[] args) {
		
		TextBook b1 = new TextBook("SGK01", 110 , "Nhi Đồng", "Cũ");
		TextBook b2 = new TextBook("SGK02", 40 , "Thanh Niên", "Mới");
		TextBook b3 = new TextBook("SGK03", 120 , "Tiền Phong", "Cũ");
		
		ReferenceBook b4 = new ReferenceBook("STK01", 40, "Nhi Đồng", 10 );
		ReferenceBook b5 = new ReferenceBook("STK01", 115, "Nhi Đồng", 20);
		
		//People[] peoples = {gd, tp1, tp2, nv1, nv2, nv3, nv4, nv5, nv6};
		Book[] books = {b1,b2,b3,b4,b5};
	
		
		System.out.println("Toàn bộ sách thuộc nhà sách Nhi Đồng");
		for (Book bs: books) {
			System.out.println(bs);
		}
}
}