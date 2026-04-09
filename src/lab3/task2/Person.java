package lab3.task2;

public class Person implements MakeSound, Cloneable {
    protected String name;
    protected int age;
    
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
    	return name;
    }
	
	public void move() {
		System.out.println("Person is moving");
	}
	public void makeSound() {
		System.out.println("Person is talking");
	}
	
    public int compareTo(Person other) {
    	return this.age - other.age;
    }
    
    public Person clone() {
    	try {
    		return (Person) super.clone();
    	} catch (CloneNotSupportedException e) {
            return null;
        }
    }
}
