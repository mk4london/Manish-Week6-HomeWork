
/*Write a Java program to add two binary numbers.
Input Data:
Input first binary number: 10
Input second binary number: 11
Expected Output:
Sum of two binary numbers: 101

* created  with help of google
 */

import java.util.Scanner;
public class BinaryNumber {
    // static methode
    static void Binary (){
        Scanner sc = new Scanner(System.in);

        // lets take input from user
        System.out.println("First Binary Number");
        String binary1 =sc.next(); // convert the data in string
        System.out.println("Second Binary Number");
        String binary2 =sc.next(); // convert the data in string
        int n1 =Integer.parseInt(binary1,2); // convert data back to int use parseint methode
        int n2=Integer.parseInt(binary2, 2); // convert data back to int use parseint methode
        int n3 = n1+n2; // new variable

        System.out.println("first binary number : " +Integer.toBinaryString(n1));
        System.out.println("Second binary number : " +Integer.toBinaryString(n2));
        System.out.println("Sume of two binary numbers : " +Integer.toBinaryString(n3));

    }

    public static void main(String[] args) {

        Binary();
    }
}
