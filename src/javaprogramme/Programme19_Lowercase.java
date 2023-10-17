package javaprogramme;

/**
 * Write a Java program to convert a given string into lowercase.
 * Sample Input: THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.
 * Output: the quick brown fox jumps over the lazy dog.
 */
public class Programme19_Lowercase {
    public static void main(String[] args) {
        String input = "THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.";
        String LowercaseString = input.toLowerCase();

        System.out.println("Original String: " + input);
        System.out.println("Lowercase String: " + LowercaseString);
    }

}
