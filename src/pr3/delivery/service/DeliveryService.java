package pr3.delivery.service;
import java.util.List;
import pr3.delivery.model.Vehicle;

public class DeliveryService {
    public void printAllVehicles(List<Vehicle> vehicles) {

        for (Vehicle v : vehicles) {
            v.getVehicleInfo();
        }
    }
    
    public void calculateAllDeliveries(List<Vehicle> vehicles) {
    	for(Vehicle v : vehicles) {
    		double cost = v.calculateDeliveryCost();
    		System.out.println("Delivery cost: " + cost);
    	}
    	
    }
    
    public double calculateTotalCost(List<Vehicle> vehicles) {
    	double total = 0;
    	for(Vehicle v : vehicles) {
    		total += v.calculateDeliveryCost();
    	}
    	
    	return total;
    }

}
