package pr2.t1;

import java.util.Scanner;

public class StudentTest {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.print("Enter id: ");
        String id = sc.nextLine();

        Student s = new Student(name, id);

        System.out.println("\nStudent data:");
        System.out.println("Name: " + s.getName());
        System.out.println("ID: " + s.getId());
        System.out.println("Year: " + s.getYearOfStudy());

        s.incrementYearOfStudy();

        System.out.println("After increment:");
        System.out.println("Year: " + s.getYearOfStudy());

        sc.close();
    }
}

