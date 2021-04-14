package JavaProgrammes;

/* Write a Java programme using the following steps.
 *3.1 Declare one instance and one static variable.
 *3.2 Declare one instance method.
 *3.3 Declare one static method.
 *3.4 Call both instance and static variables into both instance and static methods inside the  print statement.
 *3.5 Declare the Main method.
 *3.6 Call both instance and static methods into the Main method and run the programme.
 * Created by Manish Moolchandani

 */

public class Programme3 {
    int ab = 10;
    static int ba = 10;

    //Declare one instance method.
    void ac() {
        System.out.println(ab);
        System.out.println(ba);

    }

    //Declare one static method.

    static void ca() {

        //Call both instance and static variables into both instance and static methods inside the  print statement.
        Programme3 as = new Programme3();
        System.out.println(ba);
        System.out.println(as.ab);

    }

    public static void main(String[] args) {

        //Call both instance and static methods into the Main method and run the programme.
        Programme3 as = new Programme3();
        ca();
        as.ac();

    }







}
