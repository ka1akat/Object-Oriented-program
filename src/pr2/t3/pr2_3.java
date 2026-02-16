package pr2.t3;

import java.util.Scanner;

import pr2.t2.Time;

public class pr2_3{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first time:");
        System.out.print("Hour: ");
        int h1 = sc.nextInt();

        System.out.print("Minute: ");
        int m1 = sc.nextInt();

        System.out.print("Second: ");
        int s1 = sc.nextInt();

        Time t1 = new Time(h1, m1, s1);

        System.out.println("\nEnter second time:");
        System.out.print("Hour: ");
        int h2 = sc.nextInt();

        System.out.print("Minute: ");
        int m2 = sc.nextInt();

        System.out.print("Second: ");
        int s2 = sc.nextInt();

        Time t2 = new Time(h2, m2, s2);

        System.out.println("\nFirst Time:");
        System.out.println("Universal: " + t1.toUniversal());
        System.out.println("Standard: " + t1.toStandard());

        t1.add(t2);

        System.out.println("\nAfter adding second time:");
        System.out.println("Universal: " + t1.toUniversal());
        System.out.println("Standard: " + t1.toStandard());

        sc.close();
    }
}
