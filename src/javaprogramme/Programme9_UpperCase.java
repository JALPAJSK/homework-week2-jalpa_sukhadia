package javaprogramme;

import java.util.Scanner;

/**
 * Write a program to convert the upper case to lower case.
 */
public class Programme9_UpperCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an uppercase string: ");
        String uppercaseString = sc.nextLine();

        String lowercaseString = uppercaseString.toLowerCase();

        System.out.println("Uppercase string: " + uppercaseString);
        System.out.println("Lowercase equivalent: " + lowercaseString);

        sc.close();
    }
}
