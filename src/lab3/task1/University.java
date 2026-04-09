package lab3.task1;

public class University extends Buildings {
	String name;
	int floors;
	
	public University(String name,int floors) {
		super(name, floors);
	}
    public void use() {
        System.out.println("Used for living");
    }

}
