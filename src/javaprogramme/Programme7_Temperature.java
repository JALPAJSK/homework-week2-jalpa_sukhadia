package javaprogramme;

import java.util.Scanner;

/**
 * Write a program to insert any temperature value in degree Fahrenheit and
 * convert to degree Celsius ((F − 32) × 5/9 = 0°C).
 */
public class Programme7_Temperature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the temperature in Fahrenheit: ");
        double fahrenheit = sc.nextDouble();

        //Convert Fahrenheit to Celsius using the formula
        double celsius = (fahrenheit - 32) * 5/9;

        System.out.println("Temperature in Celsius: " + celsius + "c");
        sc.close();
    }
}
