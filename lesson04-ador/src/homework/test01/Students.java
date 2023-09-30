package homework.test01;

public class Students {
	private int studentId;
	private String studentName;
	private double theoryPoint;
	private double practicPoint;

	public Students() {
	}

	public Students(int studentId, String studentName, double theoryPoint, double practicPoint) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.theoryPoint = theoryPoint;
		this.practicPoint = practicPoint;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public double getTheoryPoint() {
		return theoryPoint;
	}

	public void setTheoryPoint(double theoryPoint) {
		this.theoryPoint = theoryPoint;
	}

	public double getPracticPoint() {
		return practicPoint;
	}

	public void setPracticPoint(double practicPoint) {
		this.practicPoint = practicPoint;
	}

	@Override
	public String toString() {
		return "Students ID: " + this.studentId + ", Name: " + this.studentName
				+ ", Theory Point: " + this.theoryPoint
				+ ", Practic Point: " + this.practicPoint;
	}
}
