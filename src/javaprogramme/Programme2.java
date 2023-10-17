package javaprogramme;

/**
 * Write a Java programme using the following steps.
 * 2.1 Declare two static variables
 * 2.2 Declare one static method
 * 2.3 Call both static variables into the static method inside the print statement.
 * 2.4 Declare the Main method.
 * 2.5 Call the static method into the Main method and Run the programme.
 */
public class Programme2 {
    // static variables
    static int a = 30;
    static String name = "rohan";

    // static method
    public static void v1() {
        System.out.println(a);
        System.out.println(Programme2.name);
    }

    // Main method
    public static void main(String[] args) {
        v1();
    }
}
