import java.util.Scanner;

/*

Write a Java program to print the sum (addition), multiply, subtract, divide and  remainder of two numbers.
Test Data:
Input first number: 125
Input second number: 24
Expected Output :
125 + 24 = 149
125 - 24 = 101
125 x 24 = 3000
125 / 24 = 5
125 mod 24 = 5

 */

public class PrintTheSum {

    // instance methode
    void Total(){
        int b;
        int c;
        Scanner a =new Scanner(System.in); // take the user input
        System.out.println("Enter 1st Number :- " );
        b =a.nextInt(); // store value in a variable
        System.out.println(" Enter 2nd Number :- " );
        c =a.nextInt(); // sotre value in a variable
        System.out.println("Expected Output :-"+ ( b+c));
        System.out.println("Expected Output :-" + ( b-c));
        System.out.println("Expected Output :-" + ( b*c));
        System.out.println("Expected Output :-" + ( b/c));
        System.out.println("Expected Output :-" + ( b%c));


    }

    public static void main (String[] args){
// object crated for above methode
        PrintTheSum a =new PrintTheSum();
        a.Total(); // invoke methode
    }


}
