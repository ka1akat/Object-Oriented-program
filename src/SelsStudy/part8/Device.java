package SelsStudy.part8;

public abstract class Device {
	private String Brand;
	private String Model;
	private int Power;
	
	public Device(String Brand,String Model,int Power) {
		this.Brand = Brand;
		this.Model = Model;
		this.Power = Power;	
	}
	public String getBrand() {
		return Brand;
	}
	public String getModel() {
		return Model;
	}
	public int Power() {
		return Power;
	}
	
    public abstract void turnOn();
    public abstract void turnOn(String mode);
    

    
    
}
