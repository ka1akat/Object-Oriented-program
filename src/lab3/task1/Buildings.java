package lab3.task1;

abstract class Buildings{
    String name;
    int floors;
    
    public Buildings(String name, int floors) {
        this.name = name;
        this.floors = floors;
    }
    public void showInfo() {
        System.out.println("Name: " + name);
        System.out.println("Floors: " + floors);
    }

    public abstract void use();
}
