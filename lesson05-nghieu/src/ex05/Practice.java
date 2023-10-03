package ex05;

public class Practice {

	private String idOfPrac;
	private String name;
	private String phone;
	private String address;
	
	public Practice() {
	}

	public Practice(String idOfPrac, String name, String phone, String address) {
		this.idOfPrac = idOfPrac;
		this.name = name;
		this.phone = phone;
		this.address = address;
	}

	public String getIdOfPrac() {
		return idOfPrac;
	}

	public void setIdOfPrac(String idOfPrac) {
		this.idOfPrac = idOfPrac;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Practice [idOfPrac=" + idOfPrac + ", name=" + name + ", phone=" + phone + ", address=" + address + "]";
	}
}
