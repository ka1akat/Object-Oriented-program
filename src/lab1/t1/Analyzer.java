package lab1.t1;

import java.util.Scanner;

public class Analyzer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Data data = new Data();

        while (true) {
            System.out.print("Enter number: ");
            String s = sc.next();

            if (s.equalsIgnoreCase("Stop")) {
                break;
            }

            double value = Double.parseDouble(s); //преобразование в число
            data.addValue(value);
        }

        System.out.printf("Average = %.1f%n", data.getAverage());
        System.out.printf("Maximum = %.1f%n", data.getLargest());

        sc.close();
    }
}

