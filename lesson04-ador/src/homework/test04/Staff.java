package homework.test04;

import java.math.BigDecimal;

public class Staff extends Personal {
	private String unitName;
	private Management quanLy;
	
	public Staff() {
		super.setChucVu("Nhân Viên");
	}
	
	public Staff(String emplName, String emplBrithday, BigDecimal heSoLuong, Management quanLy) {
		super("Nhân Viên", emplName, emplBrithday, heSoLuong, BigDecimal.ZERO);
		this.unitName = quanLy.getUnitName();
		this.quanLy = quanLy;
	}
	
	public String getTenDonVi() {
		return unitName;
	}

	public void setTenDonVi(String unitName) {
		this.unitName = unitName;
	}

	public Management getQuanLy() {
		return quanLy;
	}

	public void setQuanLy(Management quanLy) {
		this.quanLy = quanLy;
	}
	
	@Override
	public String toString() {
		return super.toString() + "Staff [tenDonVi=" + this.unitName + ", quanLy=" + this.quanLy.getEmplName() + "]";
	}

	@Override
	public BigDecimal getSalary(BigDecimal salary) {
		return (super.getHeSoLuong().add(super.getHeSoChucVu())).multiply(salary);
	}
	
}
