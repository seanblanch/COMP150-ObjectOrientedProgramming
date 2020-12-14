//Sean Blanchard
//10/23/18
//COMP 150 lab 7b - Circle class

import java.awt.Point;
import java.text.DecimalFormat;

public class circle {

    private double radius;
    //Point Object - center of circle
    Point center = new Point();


    //

    public circle(double x, double y, double radius){
        center.setLocation(x,y);
        setRadius(radius);
    }
    //Accessor Methods

    public double getRadius() {
        return this.radius;
    }


    //Mutator methods


    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String toString(){
        DecimalFormat twoDigits = new DecimalFormat("0.00");
        return "The center of the circle is: " + center.toString()
                + "; The radius is: " + twoDigits.format(getRadius())
                + "; The perimeter is: " + twoDigits.format(getPerimeter())
                + "; The area is: " + twoDigits.format(getArea());
    }

    public boolean equals(circle otherObj){
        return this.center.equals(otherObj.center) && this.radius == otherObj.radius;
    }


    public double getArea() {
        return Math.PI * radius * radius;
    }
    public double getPerimeter() {
        return 2 * Math.PI * radius;

    }
}
