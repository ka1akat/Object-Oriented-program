package lab3.task2;

public class Bird implements MakeSound, Cloneable{
	private String name;
	
    public Bird(String name) {
        this.name = name;
    }
	
	public void move() {
		System.out.println("Bird is flying");
	}
	public void makeSound() {
		System.out.println("Bird is making sound: chirik-chirik");
	}
	
	public Bird clone() {
		try {
			return (Bird) super.clone();
		}catch (CloneNotSupportedException e) {
            return null;
        }
	}

}
