package pr3.delivery.model;

public class Engine {
	String type;
	double horsePower;
	
	public Engine(String type, double horsePower) {
		this.type = type;
		this.horsePower = horsePower;		
	}
	public void getEngineInfo(){
		System.out.println("type: "+ type + ", horsePower: "+ horsePower);
	}
}

