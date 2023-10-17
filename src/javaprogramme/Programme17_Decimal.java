package javaprogramme;

/**
 * Write a Java program to convert a decimal number to binary number.
 ** Input Data:
 * Input a Decimal Number : 5
 * Expected Output*
 * Binary number is: 101
 */
public class Programme17_Decimal {
    public static void main(String[] args) {
        int num = 5;
        String Binary = Integer.toBinaryString(num);
        System.out.println(Binary);
    }
}
