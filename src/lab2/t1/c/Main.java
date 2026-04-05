package lab2.t1.c;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Ali", 20);
        Person p2 = new Person("Ali", 20);
        Person p3 = new Person("Dana", 25);

        System.out.println("Person test:");
        System.out.println(p1);
        System.out.println(p2);

        System.out.println("p1 equals p2: " + p1.equals(p2));
        System.out.println("p1 equals p3: " + p1.equals(p3));

        System.out.println();

        Employee e1 = new Employee("Ali", 20, "E101");
        Employee e2 = new Employee("Ali", 20, "E101");
        Employee e3 = new Employee("Ali", 20, "E102");

        System.out.println("Employee test:");

        System.out.println(e1);
        System.out.println(e2);

        System.out.println("e1 equals e2: " + e1.equals(e2));
        System.out.println("e1 equals e3: " + e1.equals(e3));

        System.out.println("hashCode e1: " + e1.hashCode());
        System.out.println("hashCode e2: " + e2.hashCode());
    }
}