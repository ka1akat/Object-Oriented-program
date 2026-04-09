package lab3.task6;

class Animal implements Soundable, Movable , Cloneable {
    protected String name;
    protected String type;

    public Animal(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public void makeSound() {
        System.out.println(name + " makes a sound");
    }
    
    public void move() {
    	System.out.println(name + " can move");
    }
    public void show() {
        System.out.println(name + " " + type);
    }
    
    public Animal clone() {
        try {
            return (Animal) super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }
}