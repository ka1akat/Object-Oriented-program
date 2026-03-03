package lab1.t4;

import java.util.Scanner;
import pr2.t1.Student;

public class GradeBookTest {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        Course course = new Course(
                "CS101 Object-Oriented Programming",
                "Basics of OOP, classes, objects, encapsulation",
                5,
                "Intro to Programming"
        );

        GradeBook gb = new GradeBook(course);

        gb.addStudent(new Student("Student A", 1));
        gb.addStudent(new Student("Student B", 2));
        gb.addStudent(new Student("Student C", 3));
        gb.addStudent(new Student("Student D", 4));
        gb.addStudent(new Student("Student E", 5));

        gb.displayMessage();

        System.out.println("Input grades for students:");

        for (int i = 0; i < gb.getStudentsCount(); i++) {
            Student st = gb.getStudent(i);

            int grade;
            while (true) {
                System.out.print(st + " grade (0-100): ");
                grade = in.nextInt();

                if (grade >= 0 && grade <= 100) break;
                System.out.println("Invalid grade! Enter 0..100.");
            }
            gb.setGrade(i, grade);
        }

        gb.displayGradeReport();

        in.close();
    }
}
