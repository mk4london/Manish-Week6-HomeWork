/*
Write a Java program to convert a given string into lowercase.
*Sample Input: THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.
*Output: the quick brown fox jumps over the lazy dog.

 */

public class LowerCase2 {
    // static methode
    static void lower(){
        String b2 = new String(" THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG");
        // convert to uppercase
        System.out.println("Convert in lower case :-    " + b2.toLowerCase());

    }

    public static void main(String[] args) {
        lower(); // invoke methode

    }
}
