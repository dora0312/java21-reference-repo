package ex05.buybook;

public class Client {
	private String id;
	private String name;
	private Integer numberPhone;
	private String address;
	public Client() {
		
	}
	public Client(String id, String name, Integer numberPhone, String address) {
		super();
		this.id = id;
		this.name = name;
		this.numberPhone = numberPhone;
		this.address = address;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getNumberPhone() {
		return numberPhone;
	}
	public void setNumberPhone(Integer numberPhone) {
		this.numberPhone = numberPhone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Client [id=" + id + ", name=" + name + ", numberPhone=" + numberPhone + ", address=" + address + "]";
	}
	
	
}
