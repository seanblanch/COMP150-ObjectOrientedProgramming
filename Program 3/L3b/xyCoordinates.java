//Sean Blanchard
//COMP150
//Lab3b
//9/17/18


import java.util.Scanner;
import java.awt.Point;

public class xyCoordinates {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // implement a scanner class
        int x1, y1, x2, y2; // Four integers declared

        System.out.println("Enter x1 and y1 ::"); // enter coordinates of p1
        x1 = scan.nextInt();
        y1 = scan.nextInt();

        System.out.println("Enter x2 and y2 ::"); // enter coordinated of p2
        x2 = scan.nextInt();
        y2 = scan.nextInt();

        Point p1 = new Point(x1, y1); // create point 1

        Point p2 = new Point(x2, y2); // create point 2

        System.out.println("\nPoint p1 coordinates are :: " + p1); // Print the points

        System.out.println("Point p2 coordinates are :: " + p2.toString()); // Print the points toString() required
    } //main end
} // class end




