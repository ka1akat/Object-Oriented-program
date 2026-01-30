package pr1;

import java.util.Scanner;
//s = s.toLowerCase(); for change
public class Task6_1 { // Task6Part2
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your data:");
        String s = sc.nextLine();
        boolean isPalindrome = true;
        for (int i = 0; i < s.length() / 2; i++) {
        	if(s.charAt(i)==s.charAt(s.length() - i -1)) {
        		isPalindrome = false;
        		break;
        		
        	}

        }
        if (isPalindrome) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not palindrome");
        }
    }
}
