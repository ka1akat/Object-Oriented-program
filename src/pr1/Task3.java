package pr1;

import java.util.Scanner;

public class Task3{
	public static void main(String[] args){ 
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your gpa:");
		double gpa = scan.nextDouble();
		
		if(gpa<0 || gpa>4) { 
			System.out.println("Enter correct point");
			return;
		}
		
		if (gpa >= 3.67) {
            System.out.println("Grade: A");
        } else if (gpa >= 3.33) {
            System.out.println("Grade: A-");
        } else if (gpa >= 3.00) {
            System.out.println("Grade: B+");
        } else if (gpa >= 2.67) {
            System.out.println("Grade: B");
        } else if (gpa >= 2.33) {
            System.out.println("Grade: B-");
        } else if (gpa >= 2.00) {
            System.out.println("Grade: C+");
        } else if (gpa >= 1.67) {
            System.out.println("Grade: C");
        } else if (gpa >= 1.33) {
            System.out.println("Grade: C-");
        } else if (gpa >= 1.00) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F");
        }

		
		
	}
}