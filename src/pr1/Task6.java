package pr1;

import java.util.Scanner;

public class Task6 {
	public static void main(String[] args){ 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your data:");
		String s = sc.nextLine();
		String reversed = new StringBuilder(s).reverse().toString();
		
        if (s.equals(reversed)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not palindrome");
        }
	}
}
