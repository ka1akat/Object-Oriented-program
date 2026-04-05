package SelsStudy.part8;

public class Laptop extends Device { 
	private String mode;
	public Laptop(String Brand,String Model,int Power) {
		super(Brand, Model, Power);
	}
    public void turnOn(){
        System.out.println(getBrand() + " is turned on");
    }

    public void turnOn(String mode){
        System.out.println(getBrand() + " is turned on in " + mode + " mode");
    }

}
