public class AreaOfRectangle {
    /*
     *Write a Java program to print the area and perimeter of a rectangle. Test Data:
     * created by Manish Moolchandani
     */


    double width =5.5; // instance variable
    double height = 8.5; // instance variable

    // instance methode
    void Area (){
        System.out.println( "Width" + "=" + width);
        System.out.println("Height" + "=" + height);
        System.out.println("Area is " +":-" + "5.5 * 8.5 =" + width*height  );
        System.out.println("");

    }
    // instance methode
    void Perimeter (){
        System.out.println( "Width" + "=" + width);
        System.out.println("Height" + "=" + height);
        System.out.println("Perimeter is " + ":-"  + "2 * (5.5 +8.5 )" + 2* (width+height));
        System.out.println("");

    }

    public static void main (String[] args){
// object for above methode
        AreaOfRectangle a =new AreaOfRectangle();

        a.Area();
        a.Perimeter();

    }


}
