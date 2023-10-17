package javaprogramme;

/**
 * Write a Java programme using the following steps.
 * 3.1 Declare one instance and one static variable.
 * 3.2 Declare one instance method.
 * 3.3 Declare one static method.
 * 3.4 Call both instance and static variables into both instance and static methods inside the
 * print statement.
 * 3.5 Declare the Main method.
 * 3.6 Call both instance and static methods into the Main method and run the programme.
 */
public class Programme3 {
    int a = 23; // Instance variable
    static String name = "jalpa"; // static variable

    //Static method
    public static void b1() {
        Programme3 obj = new Programme3();
        System.out.println(obj.a);
        System.out.println(name);
    }

    //Instance method
    public void b2() {
        System.out.println(a);
        System.out.println(Programme3.name);
    }

    //Main method
    public static void main(String[] args) {
        b1();
        Programme3 obj = new Programme3();
        obj.b2();
    }
}
