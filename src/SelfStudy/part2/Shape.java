package SelfStudy.part2;

public abstract class Shape {
    private String color;
    private int locationX;
    private int locationY;

    public Shape(String color, int locationX, int locationY) {
        this.color = color;
        this.locationX = locationX;
        this.locationY = locationY;
    }
	public abstract void draw(int locationX, int locationY);

}
