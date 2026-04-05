package pr4.task2;

public class Student extends Person implements CanHavePizza, CanHaveRetake, Movable{
	public void eatPizza() {
		System.out.println("Student is eating pizza");
	}
	public void retakeExam() {
		System.out.println("Student can have Retake");
	}
	public void move() {
		System.out.println("Student is moving");
	}
	public void dance() {
		System.out.println("Student is dancing");
		
	}
	

}
