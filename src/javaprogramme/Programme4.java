package javaprogramme;
/**
 * Write a Java programme using the following steps.
 * 4.1 Declare two instance and two static variables.
 * 4.2 Declare one instance method.
 * 4.3 Declare one static method.
 * 4.4 Call all four instance and static variables into both instance and static methods inside the
 * print statement.
 * 4.5 Declare the Main method.
 * 4.6 Call both instance and static methods into the Main method and run the programme.
 */
public class Programme4 {
  int a = 20;
  String name = "jalpa";
  static int b = 30;
  static String surname = "shah";

  //static method
    public static void c1(){
        Programme4 obj = new Programme4();
        System.out.println(obj.a);
        System.out.println(obj.name);
        System.out.println(b);
        System.out.println(surname);
    }
    //Instance method
    public void c2(){
        Programme4 obj = new Programme4();
        System.out.println(a);
        System.out.println(name);
        System.out.println(Programme4.b);
        System.out.println(Programme4.surname);
    }

    //Main method
    public static void main(String[] args) {
        Programme4 obj = new Programme4();
        c1();
        obj.c2();
    }
}
