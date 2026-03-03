package pr3.delivery.model;

public class Truck extends Vehicle {
	int maxLoad;
	public Truck(String model,double baseCost,Engine engine,int maxLoad){
		super(model,baseCost,engine);
		this.maxLoad = maxLoad;	
	}
	@Override
	public double calculateDeliveryCost() {
		return baseCost+200;
	}
	public double calculateDeliveryCost(double distance, double fuelPrice){
		return  baseCost + distance*fuelPrice;
	}

}
