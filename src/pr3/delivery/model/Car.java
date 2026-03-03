package pr3.delivery.model;

public class Car extends Vehicle {
	int numberOfSeats;
	public Car(String model,double baseCost,Engine engine,int numberOfSeats){
		super(model,baseCost,engine);
		this.numberOfSeats = numberOfSeats;	
	}
	@Override
	public double calculateDeliveryCost() {
		return baseCost+100;
	}
	public double calculateDeliveryCost(double extraWeight){
		return  baseCost + extraWeight;
	}
}
