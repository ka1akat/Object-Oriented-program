package pr1;

import java.util.Scanner;

public class Task5 {
	public static void main(String[] args){
	 Scanner sc = new Scanner(System.in);
		 System.out.println("Your current balance:");
		 double n = sc.nextDouble();
		 System.out.println("Interest in %:");
		 double m = sc.nextDouble();
		 
		 double d= n+((n*m)/100);
		 System.out.println("You will have: " + Math.round(d));
		 
	 }
	}

