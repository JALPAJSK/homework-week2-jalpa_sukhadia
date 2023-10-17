package javaprogramme;

import java.util.Scanner;

/**
 * Write a Java program that takes a number as input and prints its
 * multiplication table up to 10.
 * Test Data: Input a number: 8
 * Expected Output :
 * 8 x 1 = 8
 * 8 x 2 = 16
 * 8 x 3 = 24
 * 8 x 10 = 80
 */
public class Programme10_Table {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the table number: ");
        int a = sc.nextInt();
        int b = a * 1;
        int c = a * 2;
        int d = a * 3;
        int e = a * 4;
        int f = a * 5;
        int g = a * 6;
        int h = a * 7;
        int i = a * 8;
        int j = a * 9;
        int k = a * 10;
        System.out.println(+a + " x 1 =" + b);
        System.out.println(+a + " x 2 =" + c);
        System.out.println(+a + " x 3 =" + d);
        System.out.println(+a + " x 4 =" + e);
        System.out.println(+a + " x 5 =" + f);
        System.out.println(+a + " x 6 =" + g);
        System.out.println(+a + " x 7 =" + h);
        System.out.println(+a + " x 8 =" + i);
        System.out.println(+a + " x 9 =" + j);
        System.out.println(+a + " x 10 =" + k);
        sc.close();
    }
}
