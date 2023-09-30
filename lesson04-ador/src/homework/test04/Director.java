package homework.test04;

import java.math.BigDecimal;

public class Director extends Personal {
	
	public Director() {
		// TODO Auto-generated constructor stub
	}
	
	public Director(String emplName, String emplBrithday, BigDecimal heSoLuong, BigDecimal heSoChucVu) {
		super("Giám đốc", emplName, emplBrithday, heSoLuong, heSoChucVu);
	}

	@Override
	public BigDecimal getSalary() {
		BigDecimal salary;
		salary = (super.getHeSoLuong().add(super.getHeSoChucVu())).multiply(BigDecimal.valueOf(300000));
		return salary;
	}

}
