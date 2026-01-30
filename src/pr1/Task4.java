package pr1;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a: ");
        double a = sc.nextDouble();

        System.out.print("Enter b: ");
        double b = sc.nextDouble();

        System.out.print("Enter c: ");
        double c = sc.nextDouble();

        if (a == 0) {
            System.out.println("a cannot be 0, equation should be quadratic");
            return;
        }

        final double D = (b * b) - (4 * a * c);  // lowerCase

        if (D < 0) {
            System.out.println("Error: Discriminant is negative. No real roots.");
            return;
        }

        double sqrtD = Math.sqrt(D); 
        double n = 2 * a;        

        double x1 = (-b + sqrtD) / n;
        double x2 = (-b - sqrtD) / n;

        System.out.println("x1 = " + x1);
        System.out.println("x2 = " + x2);
        
//        sc.close();
    }
}
