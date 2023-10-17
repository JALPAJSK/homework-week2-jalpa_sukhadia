package javaprogramme;

import java.util.Scanner;

/**
 * Write a program to calculate the area of a triangle.
 */
public class Programme8_Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of the base of the triangle: ");
        double base = sc.nextDouble();

        System.out.println("Enter the height of the triangle ");
        double height = sc.nextDouble();

        // calculate the area of the triangle using the formula
        double area = (0.5) * base * height;

        System.out.println("The area of the triangle is: " + area);

        sc.close();
    }
}
