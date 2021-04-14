/*Write a Java program that takes a number as input
 *and prints its  multiplication table up to 10.
 * created by vishal tailor
 */

import java.util.Scanner;

public class Table {

    static void MultiTable() {
        Scanner myobj = new Scanner(System.in);
        System.out.println("Enter the Number");
        int a = myobj.nextInt();
        for (int x = 1; x <= 10; x++) {
            int b = a * x;
            System.out.println(a + "*" + x + "=" + b);

        }


    }

    public static void main(String[] args) {

        MultiTable();

        // another way to workout time table

        System.out.println("");
        System.out.println("");

        int a = 8;
        for (int x = 1; x <= 10; x++) {
            int b = a * x;
            System.out.println(a + "*" + x + "=" + b);

        }


    }

}
