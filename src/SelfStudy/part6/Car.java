package SelfStudy.part6;

public class Car extends Vehicle {
	private int doors;
	private String fuelType;
	public Car(String brand,int speed,int doors,String fuelType) {
		super(brand, speed);
		this.doors = doors;
		this.fuelType=fuelType;
	}
	public int getdoors() {
		return doors;
	}

	public String getfuelType() {
		return fuelType;
	}
	public void setdoors(int doors) {
		this.doors = doors;
	}
	public void setfuelType(String fuelType) {
		this.fuelType = fuelType;
	}
	
	@Override
	public String toString() {
		return "Doors: " + doors + " fuelType: " + fuelType + super.toString();
	}
	
}
