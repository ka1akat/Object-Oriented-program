package lab3.task6;

class Person implements Comparable<Person>, Cloneable {
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int compareTo(Person other) {
        return this.age - other.age;
    }

    public Person clone() {
        try {
            return (Person) super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    public void show() {
        System.out.println(name + " " + age);
    }
}
