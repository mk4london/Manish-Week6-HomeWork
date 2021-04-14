import java.util.Scanner;
/*
 *Write a Java program to convert a decimal number to binary number.
 * crated  with help of google

 */
public class DecimalToBinary {

    // static methode
    static void Decimal() {
        int n, count = 0, a;
        String x = "";
        Scanner s = new Scanner(System.in);
        System.out.print("Enter any decimal number:");
        n = s.nextInt();
        while (n > 0) {
            a = n % 2;
            if (a == 1) {
                count++;
            }
            x = a + "" + x;
            n = n / 2;
        }
        System.out.println("Binary number:" + x);


    }

    public static void main(String[] args) {
        // invoke static methode
        Decimal();

    }
}