package lab2.t5;

public class Student extends Person {
    protected String major;

    public Student(String name, int age, String major) {
        super(name, age);
        this.major = major;
    }

    @Override
    public String getOccupation() {
        return "Student in " + major;
    }
}
