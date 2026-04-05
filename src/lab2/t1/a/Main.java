package lab2.t1.a;

public class Main {
	public static void main(String[] args) {
		Cylinder c1 = new Cylinder(2.5 , 1.5);
		System.out.printf("Cylinders volume: %.2f\n", c1.volume());
		System.out.printf("Cylinders surface area: %.2f\n", c1.surfaceArea());
		
		Cube cu1 = new Cube(5);
		System.out.printf("Cube volume: %.2f\n", cu1.volume());
		System.out.printf("Cube surface area: %.2f\n", cu1.surfaceArea());
		
		Sphere s1 = new Sphere(6.5);
		System.out.printf("Sphere volume: %.2f\n", s1.volume());
		System.out.printf("Sphere surface area: %.2f\n", s1.surfaceArea());
}
}

