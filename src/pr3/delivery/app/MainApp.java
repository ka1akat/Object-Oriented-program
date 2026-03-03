package pr3.delivery.app;
import java.util.ArrayList;
import java.util.List;
import pr3.delivery.model.Engine;
import pr3.delivery.model.Vehicle;
import pr3.delivery.model.Car;
import pr3.delivery.model.Truck;
import pr3.delivery.service.DeliveryService;

public class MainApp {
	public static void main(String[] args) {
        Engine e1 = new Engine("Diesel", 200);
        Engine e2 = new Engine("Petrol", 150);
        Car car1 = new Car("Toyota Camry", 1000, e1, 5);
        Truck truck1 = new Truck("Volvo FH", 2000, e2, 12000);
        
        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(car1);
        vehicles.add(truck1);
        
        DeliveryService service = new DeliveryService();
        System.out.println("Print ALL vehicles:");
        service.printAllVehicles(vehicles);
        
        System.out.println("--------");
        service.calculateAllDeliveries(vehicles);
        
        System.out.println("--------");
        double total = service.calculateTotalCost(vehicles);
        System.out.println("Total COST: " + total);
        
               
        
	}

}
