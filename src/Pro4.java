/*4.1 Declare two instance and two static variables.
 *4.2 Declare one instance method.
 *4.3 Declare one static method.
 *4.4 Call all four instance and static variables into both instance and static methods inside the  print statement.
 *4.5 Declare the Main method.
 *4.6 Call both instance and static methods into the Main method and run the programme.

 */

public class Pro4 {


    //Declare two instance and two static variables.
    String ab = "Hello World";
    String bc = "my first java code";
    static Float c = 100.00f;
    static Double d = 100.00;

    // Declare one instance method.
    void v1() {
        //Call all four instance and static variables into both instance and static methods inside the  print statement
        System.out.print(ab);
        System.out.print(bc);
        System.out.print(Pro4.c);
        System.out.print(Pro4.d);

    }

//  Declare one static method.

    static void v2() {
        //Call all four instance and static variables into both instance and static methods inside the  print statement

        Pro4 obj = new Pro4();
        System.out.print(obj.ab);
        System.out.print(obj.bc);
        System.out.print(c);
        System.out.print(d);
    }

    public static void main (String[] args){

        // Call both instance and static methods into the Main method and run the programme.
        Pro4 obj = new Pro4();
        obj.v1();
        v2();


    }
}
