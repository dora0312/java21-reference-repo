package homework.test01;

import java.util.Scanner;

public class DaNangUniversity {
	public static void main(String[] args) {
		Students student1 = new Students(1, "Nguyễn Văn A", 9.5, 9.5);
		Students student2 = new Students(2, "Nguyễn Văn B", 10.0, 5.5);
		Students student3 = new Students();
//		student3.setStudentId(3);
//		student3.setStudentName("Lê Thị C");
//		student3.setTheoryPoint(9.5);
//		student3.setPracticPoint(10.0);
		Scanner sc = new Scanner(System.in);
		System.out.print("Input student ID: ");
		student3.setStudentId(Integer.parseInt(sc.nextLine()));
		System.out.print("Input student Name: ");
		student3.setStudentName(sc.nextLine());
		System.out.print("Input Theory point: ");
		student3.setTheoryPoint(sc.nextDouble());
		System.out.print("Input Practic point: ");
		student3.setPracticPoint(sc.nextDouble());
		sc.close();
		
		System.out.println("\n=====================Student Info=========================");
		System.out.println(student1);
		System.out.println(student2);
		System.out.println(student3);
		System.out.println("==========================================================");
		
		Students[] allStudents = {student1, student2, student3};
		findMaxAvgPoint(allStudents);
		System.out.println("==========================================================");
		checkPracticAndTheoryPoint(allStudents);
		System.out.println("==========================================================");
	}
	private static void studentPoint(Students student, StudentStrategy stategy) {
		stategy.calPoint(student);
	}
	
	private static void findMaxAvgPoint(Students[] allStudents) {
		System.out.println("Students have average point > 8.5");
		for(Students st:allStudents) {
			if (st != null) {
				StudentStrategy strategy = (studentStrategy) -> {
					double point = avgPoint(studentStrategy.getTheoryPoint(), studentStrategy.getPracticPoint());
					if( point > 8.5 ) {
						System.out.println(studentStrategy.toString());
						System.out.println("Average point: " + point);
					}
				};
				studentPoint(st, strategy);
			}
		}
	}
	
	private static void checkPracticAndTheoryPoint(Students[] allStudents) {
		System.out.println("Students have Theory point > Practic point");
		for(Students st:allStudents) {
			if (st != null) {
				StudentStrategy strategy = (studentStrategy) -> {
					if( studentStrategy.getTheoryPoint() >  studentStrategy.getPracticPoint() ) {
						System.out.println(studentStrategy.toString());
					}
				};
				studentPoint(st, strategy);
			}
		}
	}
	
	
	private static double avgPoint(double point1, double point2) {
		return (point1 + point2)/2;
	}
//	private static void findStudentMaxPoint(Students[] students) {
//	Students findStudent = students[0];
//	double avgMaxPoint = avgPoint(students[0].getPracticPoint(),students[0].getTheoryPoint());
//	for(int i = 1; i < students.length; i++) {
//		double tempAvgPoint = avgPoint(students[i].getPracticPoint(), students[i].getTheoryPoint());
//		if( tempAvgPoint > avgMaxPoint ) {
//			avgMaxPoint = tempAvgPoint;
//			findStudent = students[i];
//		}
//	}
//	System.out.println("Sinh viên có điểm trung binh cao nhất là: \n" + findStudent.toString());
//	System.out.println("Với số điểm trung bình là: " + avgMaxPoint);
//}
}
