import java.util.*;
import java.text.DecimalFormat;


public class RadiusOfACircle {

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in); // create a new scanner

        System.out.println("Enter a circle radius: "); // enter a circle radius

        float radius=scan.nextFloat(); // Create a float point

        DecimalFormat df = new DecimalFormat("#,###,##0.00"); // use the DecimalFormat class to format the results
        //with two digits printed to the right of the decimal point

        System.out.println("Area of Circle: " + df.format(Math.PI*radius*radius)); // use Math.PI
        System.out.println("Perimeter of Circle: " + df.format(2*Math.PI*radius)); // use Math.PI


    }
}
