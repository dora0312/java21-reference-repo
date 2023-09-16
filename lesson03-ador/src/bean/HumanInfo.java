package bean;

import java.util.Arrays;

public class HumanInfo {
	private Human human;
	private Car[] car;
	
	public HumanInfo() {
		// TODO Auto-generated constructor stub
	}

	public HumanInfo(Human human, Car[] car) {
		this.human = human;
		this.car = car;
	}

	public Human getHuman() {
		return human;
	}

	public void setHuman(Human human) {
		this.human = human;
	}

	public Car[] getCar() {
		return car;
	}

	public void setCar(Car[] car) {
		this.car = car;
	}

	@Override
	public String toString() {
		return "HumanInfo [human=" + human + ", car=" + Arrays.toString(car) + "]";
	}
	
	
}
