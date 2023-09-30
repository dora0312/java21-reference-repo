package homework.test04;

import java.math.BigDecimal;

public class CompanyApp {
	public static void main(String[] args) {
		Personal m1 = new Management("An", "12.12.1993", BigDecimal.valueOf(2.0), BigDecimal.valueOf(1), "Test Dev");
		
		Personal staff = new Staff("A Dor", "03.12.1994", BigDecimal.valueOf(1.5), (Management)m1);
		System.out.println("Staff: " + staff.toString());
		System.out.println("Salary of " + staff.getEmplName() + " : " + staff.getSalary());
	}
}
