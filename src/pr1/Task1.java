package pr1;

import java.util.Scanner;

public class Task1 {
	public static void main(String[] args){ 
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		int len = s.length();
		System.out.print("+");
		
		for(int i=0;i<len;i++) {
			System.out.print("-");
		}
		System.out.println("+");
		System.out.println("|" + s + "|");
		System.out.print("+");
		for(int i=0;i<len;i++) {
			System.out.print("-");
		}
		System.out.print("+");
		
		
		
		
		
		
	}

}
