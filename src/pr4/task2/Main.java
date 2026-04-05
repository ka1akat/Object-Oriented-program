package pr4.task2;

public class Main {
    public static void main(String[] args) {
    	Restaurant restaurant = new Restaurant();
    	Cat cat = new Cat();
    	Student student = new Student();
    	
    	System.out.println("Cat:");
    	restaurant.servePizza(cat);
    	
    	System.out.println("");
    	
    	System.out.println("Student:");
    	restaurant.servePizza(student);
    	
    	
    			
    	
    }
}