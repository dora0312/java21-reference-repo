package test01;

public class Student {
	private int Id;
	private String name;
	private Rating rating;
	public Student() {
		// TODO Auto-generated constructor stub
	}
	public Student(int id, String name, Rating rating) {
		Id = id;
		this.name = name;
		this.rating = rating;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Rating getRating() {
		return rating;
	}
	public void setRating(Rating rating) {
		this.rating = rating;
	}
	@Override
	public String toString() {
		return "Student [Id=" + Id + ", name=" + name + ", rating=" + rating + "]";
	}
	
}
