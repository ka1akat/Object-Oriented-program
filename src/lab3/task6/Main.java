package lab3.task6;

public class Main {
    public static void main(String[] args) {

        Person p1 = new Person("Alice", 20);
        Person p2 = new Person("Bob", 25);

        System.out.println(p1.compareTo(p2)); 

        Person p3 = p1.clone();
        p3.show();

        System.out.println("");

        Animal a1 = new Animal("Tom", "Cat");

        a1.makeSound();
        a1.move();

        Animal a2 = a1.clone();
        a2.show();
    }
}
