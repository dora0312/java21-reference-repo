package test01;
import static test01.Rating.*;

public class App01 {
	public static void main(String[] args) {
		Student[] students = mockStudent();
		System.out.println("************ Danh sách sinh viên đạt loại A ************");
		getStudents(students, A);
		System.out.println("************ Danh sách sinh viên học lại ************");
		getStudentRelearn(students);
	}
	private static Student[] mockStudent() {
		return new Student[] {
			new Student(102, "Nam", C),
			new Student(103, "Bảo", F),
			new Student(104, "Hoàng", D),
			new Student(105, "Nguyên", B),
			new Student(107, "Vũ", F),
			new Student(109, "Lan", A),
			new Student(202, "Đạt", C),
			new Student(103, "Bảo", F),
			new Student(107, "Vũ", C),
			new Student(104, "Hoàng", B)
		};
	}
	
	private static void getStudents(Student[] students, Rating rating) {
		for(Student st : students) {
			if(st.getRating() == rating) {
				System.out.println("  " + st.toString());
			}
		}
	}
	private static void getStudentRelearn(Student[] students) {
		for(int i = 0; i < students.length; i++) {
			Student st = students[i];
			for(int j = students.length - 1 ; j > i; j--) {
				Student st2 = students[j];
				if(st.getId() == st2.getId()) {
					System.out.println("  " + st.toString());
				}
			}
		}
	}
}
