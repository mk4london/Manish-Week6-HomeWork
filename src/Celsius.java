public class Celsius {
    /* Write a program to insert any temperature value in degree Fahrenheit and  convert to degree Celsius ((F − 32) × 5/9 = 0°C)
     * Created by Manish Moolchandani
     */

    static void hi(){
        int fahrenheit = 50 ;

        int celsius = ((fahrenheit-32)*5/9);
        System.out.print("Temperature in celsius is : ");
        System.out.println((celsius + "="+ "c"));

    }

    public static void main (String[] args){
        // temprature value in fahrenheit
        hi();



    }

}
