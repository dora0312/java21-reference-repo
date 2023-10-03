package Ex05;

public class KhachHang {
	private String maKhachHang;
	private String hoTen;
	private int soDienThoai;
	private int diaChi;
	
	public KhachHang() {
	}

	public KhachHang(String maKhachHang, String hoTen, int soDienThoai, int diaChi) {
		//super();
		this.maKhachHang = maKhachHang;
		this.hoTen = hoTen;
		this.soDienThoai = soDienThoai;
		this.diaChi = diaChi;
	}

	public String getMaKhachHang() {
		return maKhachHang;
	}

	public void setMaKhachHang(String maKhachHang) {
		this.maKhachHang = maKhachHang;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public int getSoDienThoai() {
		return soDienThoai;
	}

	public void setSoDienThoai(int soDienThoai) {
		this.soDienThoai = soDienThoai;
	}

	public int getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(int diaChi) {
		this.diaChi = diaChi;
	}

	@Override
	public String toString() {
		return "KhachHang [maKhachHang=" + maKhachHang + ", hoTen=" + hoTen + ", soDienThoai=" + soDienThoai
				+ ", diaChi=" + diaChi + "]";
	}
	
	
}
