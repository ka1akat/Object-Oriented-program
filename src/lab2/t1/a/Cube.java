package lab2.t1.a;

public class Cube extends Shape3D {
	private double a;
	public Cube(double a) {
	this.a = a;
	}
	public double volume() {
		return a*a*a;
	}
	public double surfaceArea() {
		return 6*a*a;
	}
}
