package JavaProgrammes;


/*Write a Java programme using the following steps.
 *2.1 Declare two static variables
 *2.2 Declare one static method
 *2.3 Call both static variables into the static method inside the print statement.
 *2.4 Declare the Main method.
 *2.5 Call the static method into the Main method and Run the programme.
 * created by Manish Moolchandani
 */

public class Programme2 {

    //Declare two static variables
    static String a = "Hello";
    static String b = "World";

    //Declare one static method
    static void abc() {
// Call both static variables into the static method inside the print statement.
        System.out.print(a);
        System.out.println(b);

    }

    //Declare the Main method.
    public static void main(String[] args) {
        // Call the static method into the Main method and Run the programme.

        abc();

    }


}

