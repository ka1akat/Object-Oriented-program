package SelfStudy.part6;

public class Vehicle {
	private String brand;
	private int speed;
	
    public Vehicle(String brand,int speed) {
    	this.brand = brand;
    	this.speed = speed;
    }
    public String getbrand(){
    	return brand;
    }
    
    public int getspeed(){
    	return speed;
    }
    
    public void setbrand(String brand){
    	this.brand = brand;
    }
    public void setspeed(int speed){
    	this.speed = speed;
    }
	public String toString() {
		return " Brand: " + brand + " Speed: " + speed;
	}

}
