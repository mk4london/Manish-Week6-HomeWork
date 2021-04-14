public class Programme15 {
    /*
     * Write a Java program to swap two variables.
     */

    // instance variables
    int a = 150;
    int b = 250;
    int temp;  // variable declare

    // before swaping instance methode
    void Beforeswaping() {
        System.out.println("Before Swaping varriable is " + "=" + a + "," + b);

    }

    // after swaping instance methode
    void Afterswaping() {

        temp = a;
        a = b;
        b = temp;
        System.out.println("After Swaping varriable is " + "=" + a + "," + b);
    }

    // main methode
    public static void main(String[] args) {

        System.out.println("Variabele are :- " + "a = 150 " + "and " + "b = 250");
// objects for above methode
        Programme15 a = new Programme15();
        System.out.println("");
        a.Beforeswaping();
        System.out.println("");
        a.Afterswaping();
    }
}







