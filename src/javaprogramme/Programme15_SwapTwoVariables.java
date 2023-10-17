package javaprogramme;

/**
 * Write a Java program to swap two variables.
 */
public class Programme15_SwapTwoVariables {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        //Swap the values of a and b without using a third variable
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println(a);
        System.out.println(b);
    }
}
