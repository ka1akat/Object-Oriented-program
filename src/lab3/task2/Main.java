package lab3.task2;

public class Main {
	public static void main(String[] args) {
		//MakeSound f1 = new Person();
		//MakeSound f2 = new Bird();
		
//		f1.move();
//		f1.makeSound();
//		System.out.println("");
//		f2.move();
//		f2.makeSound();
//		
        Person p1 = new Person("Ali", 20);
        Person p2 = new Person("Dana", 25);

        System.out.println(p1.compareTo(p2));
        
        Person p3 = p1.clone();
        System.out.println(p3.getName());
        
        Bird b = new Bird("Sparrow");

        b.makeSound();
        b.move();

        Bird b2 = b.clone();
        b2.makeSound();
	}

}
