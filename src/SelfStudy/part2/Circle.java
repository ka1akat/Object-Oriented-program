package SelfStudy.part2;

public class Circle extends Shape {
	
	public Circle(String color,int locationX,int locationY) {
		super(color,locationX, locationY );		
	}
	public void draw(int locationX, int locationY){
		System.out.println("The shapes should be drawn at locations: " + locationX + " and "+ locationY);
	}
	public void draw(int locationX, int locationY,String color){
		System.out.println("The shapes should be drawn at locations: " + locationX + " and "+ locationY + " having color " + color);
		
	}

}
