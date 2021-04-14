/*  Write a Java program that takes three numbers as
 * input to calculate and  print the average of the numbers.
 * This programme re/*  Write a Java program that takes three numbers as
* input to calculate and  print the average of the numbers.
 * This programme is  from google
 */

public class Calculation {

    public void Average (){
        double[] arr = {19, 12.89, 16.5,};
        double total = 0;

        for(int i=0; i<arr.length; i++){
            total = total + arr[i];
        }

        /* arr.length returns the number of elements
         * present in the array
         */
        double average = total / arr.length;

        /* This is used for displaying the formatted output
         * if you give %.4f then the output would have 4 digits
         * after decimal point.
         */
        System.out.format("The average is: %.3f", average);

    }
    public static void main(String[] args) {

        Calculation a =new Calculation();
        a.Average();

    }



}

