package exam.bai05;

public enum BookStatus {
	
	NEW("mới"), 
	OLD("cũ");
	
	private String value;

	BookStatus(String value) {
	}
	
	public String getValue() {
		return value;
	}
}
