package homework.test04;

import java.math.BigDecimal;

public class CompanyApp {
	public static void main(String[] args) {
		Personal direc = new Director("Hosokawa", "04.02.1982",chgBD(2), chgBD(2));
		
		Personal m1 = new Management("Nguyễn Văn An", "12.12.1993", chgBD(2.0), BigDecimal.valueOf(1), "Test Dev");
		Personal m2 = new Management("Lê Thị Thu", "23.04.1991", chgBD(2.0), BigDecimal.valueOf(1.5), "Software Develop");
		
		Personal staff1 = new Staff("Nguyễn Văn A", "03.12.1994", chgBD(1.5), (Management)m1);
		Personal staff2 = new Staff("Nguyễn Văn B", "02.11.1980", chgBD(1.0), (Management)m2);
		Personal staff3 = new Staff("Lê Thị H", "10.10.1998", chgBD(1.0), (Management)m1);
		Personal staff4 = new Staff("Nguyễn Văn C", "22.12.1995", chgBD(1.2), (Management)m2);
		Personal staff5 = new Staff("Lê Thị K", "09.09.1999", chgBD(1.8), (Management)m2);
		Personal staff6 = new Staff("Nguyễn Văn D", "06.03.1996", chgBD(1.3), (Management)m1);
		
		Personal[] allMember = {direc, m1, m2, staff1, staff2, staff3, staff4, staff5, staff6};
		System.out.println("======================All Company's Member Info==============================");
		printAllMember(allMember);
		System.out.println("======================Filter By Managerment==============================");
		printStaffByMgn(allMember);
		System.out.println("======================All Member Of Salary==============================");
		printSalaryOfMembers(allMember);

	}
	
	private static void printAllMember(Personal[] personals) {
		for(Personal pr: personals) {
			System.out.println(pr.toString());
		}
	}
	
	private static void printStaffByMgn(Personal[] personals) {
		for(Personal pr : personals) {
			if( pr instanceof Management) {
				System.out.println("Management By: " + pr.getEmplName());
				System.out.print("Members: ");
				for(Personal staff : personals) {
					if(staff instanceof Staff) {
						Staff st = (Staff)staff;
						if (st.getQuanLy().equals(pr)) {
							System.out.print(pr.getEmplName() + ", ");
						}
					}
				}
				System.out.println("");
			}
		}
	}
	private static void printSalaryOfMembers(Personal[] personals) {
		for(Personal pr: personals) {
			if(pr instanceof Director) {
				System.out.println(pr.getChucVu() + ": "+pr.getEmplName() + " - Salary: "+ pr.getSalary(chgBD(3000000)));
			} else if(pr instanceof Management) {
				System.out.println(pr.getChucVu() + ": "+pr.getEmplName() + " - Salary: "+ pr.getSalary(chgBD(3000000)));
			} else if(pr instanceof Staff) {
				System.out.println(pr.getChucVu() + ": "+pr.getEmplName() + " - Salary: "+ pr.getSalary(chgBD(3000000)));
			}
		}
	}
	
	private static BigDecimal chgBD(double value) {
		return BigDecimal.valueOf(value);
	}
}
