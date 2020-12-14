import java.awt.*;

/**
 * Created by atb on 10/15/2017.
 */
public class CircleClient
{
    public static void main(String[] args)
    {
        System.out.println("\n*** Creating Circle object with default constructor ***");
        Circle defaultCircle = new Circle();

        System.out.println("\n*** Testing toString method ***");
        System.out.println("defaultCircle: " + defaultCircle);

        System.out.println("\n*** Testing accessor methods ***");
        System.out.println("defaultCircle instance variables are: x = "
                + defaultCircle.getCenterX() + ", y = " + defaultCircle.getCenterY()
                + ", radius = " + defaultCircle.getRadius());

        System.out.println("\n*** Creating Circle objects with secondary constructor ***");
        Circle circle1 = new Circle(0, 0, 1);
        System.out.println("Circle circle1 is: " + circle1);
        Circle circle2 = new Circle(0, 0, 1);
        System.out.println("Circle circle2 is: " + circle2);
        Circle circle3 = new Circle(0, 0, 10);
        System.out.println("Circle circle3 is: " + circle3);
        Circle circle4 = new Circle(5, 6, 10);
        System.out.println("Circle circle4 is: " + circle4);
        Circle circle5 = new Circle(2.5, 7, -3);
        System.out.println("Circle circle5 is: " + circle5);

        System.out.println("\n*** Testing equals method ***");
        if (circle3.equals(circle4))
        {
            System.out.println("Circles " + circle3 + ", and " + circle4 + " are equal - INCORRECT");
        }
        else
        {
            System.out.println("Circles " + circle3 + ", and " + circle4 + " are not equal - CORRECT");
        }
        if (circle2.equals(circle3))
        {
            System.out.println("Circles " + circle2 + ", and " + circle3 + " are equal - INCORRECT");
        }
        else
        {
            System.out.println("Circles " + circle2 + ", and " + circle3 + " are not equal - CORRECT");
        }
        if (circle1.equals(circle2))
        {
            System.out.println("Circles " + circle1 + ", and " + circle2 + " are equal - CORRECT");
        }
        else
        {
            System.out.println("Circles " + circle1 + ", and " + circle2 + " are not equal - INCORRECT");
        }

        System.out.println("\n*** Testing sameAs method ***");
        if (circle4.sameAs(circle3))
        {
            System.out.println("Circle " + circle4 + " is the same as circle " + circle3 + " - CORRECT");
        }
        else
        {
            System.out.println("Circle " + circle4 + " is not the same as circle " + circle3 + " - INCORRECT");
        }
        if (circle2.sameAs(circle3))
        {
            System.out.println("Circle " + circle2 + " is the same as circle " + circle3 + " - INCORRECT");
        }
        else
        {
            System.out.println("Circle " + circle2 + " is not the same as circle " + circle3 + " - CORRECT");
        }

        System.out.println("\n*** Testing isPointInTheCircle method ***");
        Point point1 = new Point(4, 5);
        System.out.println("Created Point object point1: " + point1);
        if (circle3.isPointInTheCircle(point1))
        {
            System.out.println("Point [" + point1.getX() + ", " + point1.getY() + "] is inside the circle " + circle3 + " - CORRECT");
        }
        else
        {
            System.out.println("Point [" + point1.getX() + ", " + point1.getY() + "] is outside the circle " + circle3 + " - INCORRECT");
        }

        Point point2 = new Point(9, 9);
        System.out.println("\nCreated Point object point2: " + point2);
        if (circle1.isPointInTheCircle(point2))
        {
            System.out.println("Point [" + point2.getX() + ", " + point2.getY() + "] is inside the circle " + circle1 + " - INCORRECT");
        }
        else
        {
            System.out.println("Point [" + point2.getX() + ", " + point2.getY() + "] is outside the circle " + circle1 + " - CORRECT");
        }

        Point point3 = new Point(-4, -5);
        System.out.println("\nCreated Point object point3: " + point3);
        if (circle3.isPointInTheCircle(point3))
        {
            System.out.println("Point [" + point3.getX() + ", " + point3.getY() + "] is inside the circle " + circle3 + " - CORRECT");
        }
        else
        {
            System.out.println("Point [" + point3.getX() + ", " + point3.getY() + "] is outside the circle " + circle3 + " - INCORRECT");
        }

        System.out.println("\n*** Testing intersectsWith method ***");
        if (circle4.intersectsWith(circle3))
        {
            System.out.println("Circle " + circle4 + " intersects with circle " + circle3 + " - CORRECT");
        }
        else
        {
            System.out.println("Circle " + circle4 + " does not intersect with circle " + circle3 + " - INCORRECT");
        }
        System.out.println();
        if (circle1.intersectsWith(circle4))
        {
            System.out.println("Circle " + circle1 + " intersects with circle " + circle4 + " - INCORRECT");
        }
        else
        {
            System.out.println("Circle " + circle1 + " does not intersect with circle " + circle4 + " - CORRECT");
        }
        System.out.println();
        if (circle1.intersectsWith(circle2))
        {
            System.out.println("Circle " + circle1 + " intersects with circle " + circle2 + " - INCORRECT");
        }
        else
        {
            System.out.println("Circle " + circle1 + " does not intersect with circle " + circle2 + " - CORRECT");
        }
        System.out.println();
        if (circle1.intersectsWith(circle3))
        {
            System.out.println("Circle " + circle1 + " intersects with circle " + circle3 + " - INCORRECT");
        }
        else
        {
            System.out.println("Circle " + circle1 + " does not intersect with circle " + circle3 + " - CORRECT");
        }
    }
}
