package pr1;

import java.util.Scanner;

public class pr2_1{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Your name: ");
        String name = sc.nextLine();

        System.out.print("Your id: ");
        String id = sc.nextLine();
        
        System.out.print("Year of study: ");
        Integer yearOfStudy = sc.nextInt();

        pr2_stud s = new pr2_stud(name, id,yearOfStudy);
        
        System.out.println("\n");
        System.out.println("Student data:");
        System.out.println("Name: " + s.getName());
        System.out.println("ID: " + s.getId());
        System.out.println("Year: " + s.getYearOfStudy());

        s.incrementYearOfStudy();

        System.out.println("After increment:");
        System.out.println("Year: " + s.getYearOfStudy());

        sc.close();
    }
}

