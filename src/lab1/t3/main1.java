package lab1.t3;

import java.util.Scanner;

public class main1{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter temperature value: ");
        double value = input.nextDouble();

        System.out.print("Enter scale (C or F): ");
        char scale = input.next().charAt(0);
        scale = Character.toUpperCase(scale); 

        Temperature temp = new Temperature(value, scale);

        if (scale == 'C') {
            System.out.println("Temperature in Celsius: " + temp.getCelsius());
        } else if (scale == 'F') {
            System.out.println("Temperature in Fahrenheit: " + temp.getFahrenheit());
        } else {
            System.out.println("Please enter C or F");
        }

        System.out.println("Original scale: " + temp.getScale());

        input.close();
    }
}
