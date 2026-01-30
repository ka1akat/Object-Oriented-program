package pr1;

import java.util.Scanner;

public class Task2 {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a num:");
		int a = scan.nextInt();
		double diagonal = Math.round(a * Math.sqrt(2));
		System.out.println("Area= " + a*a);
		System.out.println("Perimeter= " + 4*a);
		System.out.println("Diagonal= " + diagonal);
		
		
	}
}