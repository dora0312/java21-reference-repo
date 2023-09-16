package bean;

public class Car {
	// Car: carName, capacity, price, quantity
	private String carName;
	private int capcity;
	private double price;
	private int quantity;
	
	public Car() {
		// TODO Auto-generated constructor stub
	}

	public Car(String carName, int capcity, double price, int quantity) {
		super();
		this.carName = carName;
		this.capcity = capcity;
		this.price = price;
		this.quantity = quantity;
	}

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public int getCapcity() {
		return capcity;
	}

	public void setCapcity(int capcity) {
		this.capcity = capcity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Car [carName=" + carName + ", capcity=" + capcity + ", price=" + price + ", quantity=" + quantity + "]";
	}
	
}
