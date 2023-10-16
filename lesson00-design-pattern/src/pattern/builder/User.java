package pattern.builder;

public class User {
	private Integer id;
	private String firstName;
	private String lastName;
	private Integer age;
	private String email;
	private String address;
	
	private User() {
	}
	private User(Builder builder) {
		this.id = builder.id;
		this.firstName = builder.firstName;
		this.lastName = builder.lastName;
		this.lastName = builder.lastName;
		this.age = builder.age;
		this.email = builder.email;
		this.address = builder.address;
	}
	
/*
	public User(Integer id, String firstName, String lastName, Integer age, String email, String address) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.email = email;
		this.address = address;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
*/
	
	@Override
	public String toString() {
		return "User [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", email="
				+ email + ", address=" + address + "]";
	}
	
	public static Builder builder() {
		return new Builder();
	}
	
	// Nested Class
	// Class có nhiệm vụ tạo đối tượng chứa các thông tin của User
	// --> Truyền các giá trị này qua cho User
	public static class Builder {
		// B1: copy tất cả ác thuộc tính từ User
		private Integer id;
		private String firstName;
		private String lastName;
		private Integer age;
		private String email;
		private String address;
		
		// B2: Cho class này có private constructor, để dùng cho chính nó hoặc User
		// Lý do...
		private Builder() {
		}
		// B3: Tạo các hàm setter(return Builder) cho class Builder
		public Integer getId() {
			return id;
		}

		public Builder withId(Integer id) {
			this.id = id;
			return this;
		}

		public String getFirstName() {
			return firstName;
		}

		public Builder withFirstName(String firstName) {
			this.firstName = firstName;
			return this;
		}

		public String getLastName() {
			return lastName;
		}

		public Builder withLastName(String lastName) {
			this.lastName = lastName;
			return this;
		}

		public Integer getAge() {
			return age;
		}

		public Builder withAge(Integer age) {
			this.age = age;
			return this;
		}

		public String getEmail() {
			return email;
		}

		public Builder withEmail(String email) {
			this.email = email;
			return this;
		}

		public String getAddress() {
			return address;
		}

		public Builder withAddress(String address) {
			this.address = address;
			return this;
		}
		
		// B4: Sau khi khởi tạo đối tượng Builder và set các giá trị xong
		public User build() {
			return new User(this);
		}
		
	}
}
