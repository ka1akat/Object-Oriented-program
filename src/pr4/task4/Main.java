package pr4.task4;
import java.util.*;
public class Main {

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        students.add(new Student("Zara", 3.2, "IS"));
        students.add(new Student("Ali", 3.9, "VTIPO"));
        students.add(new Student("Dana", 3.5, "AIU"));

        Collections.sort(students);
        System.out.println("Sorted by GPA:");
        for (Student s : students) {
            System.out.println(s);
        }

        System.out.println();

        Collections.sort(students, new NameComparator());
        System.out.println("Sorted by Name:");
        for (Student s : students) {
            System.out.println(s);
        }
        System.out.println();
        
        Collections.sort(students, new MajorComp());
        System.out.println("Sorted by Major:");
        for(Student s: students) {
        	System.out.println(s);
        }
        
    }
}
