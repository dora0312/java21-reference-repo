package homework.test04;

import java.math.BigDecimal;

public class Management extends Personal {
	private String unitName;
	
	public Management() {
		// TODO Auto-generated constructor stub
	}
	
	public Management(String emplName, String emplBrithday, BigDecimal heSoLuong, BigDecimal heSoChucVu,
			String unitName) {
		super("Quản lý", emplName, emplBrithday, heSoLuong, heSoChucVu);
		this.unitName = unitName;
	}

	public String getUnitName() {
		return unitName;
	}

	public void setUnitName(String unitName) {
		this.unitName = unitName;
	}
	
	@Override
	public String toString() {
		return super.toString() + "Management [unitName=" + unitName + "]";
	}

	@Override
	public BigDecimal getSalary() {
		BigDecimal salary;
		salary = (super.getHeSoLuong().add(super.getHeSoChucVu())).multiply(BigDecimal.valueOf(2200000));
		return salary;
	}
}
