//Sean Blanchard
//10/24/18
//TestCh7


import java.awt.*;
import java.text.*;

/**
 * @version 10/24/18
 * @author: Sean Blanchard
 */
public class Circle
{
    // instance variables
    private int radius;
    private double x;
    private double y;
    private final int DEFAULT_RADIUS = 3;
    private final int DEFAULT_CENTER_X = 1;
    private final int DEFAULT_CENTER_Y = 2;
    private double Distance;

    //TODO Project 1

    public Circle()
    {
        //TODO Project 1
        this.x = 1;
        this.radius = 3;
        this.y = 2;

    }

    public Circle(double x, double y, int radius)
    {
        //TODO Project 1
        setCenterX(x);
        setCenterY(y);
        setRadius(radius);
    }

    public double getRadius()
    {
        //TODO Project 1
        return this.radius;
    }

    public void setRadius(int radius)
    {
        //TODO Project 1
        this.radius = radius;
    }

    public double getCenterX()
    {
        //TODO Project 1
        return this.x;
    }

    public void setCenterX(double x)
    {
        //TODO Project 1
        this.x = x;
    }

    public double getCenterY()
    {
        //TODO Project 1
        return this.y;
    }

    public void setCenterY(double y)
    {
        //TODO Project 1
        this.y = y;
    }

    private double distanceFromCenter(double x, double y)
    {
        //TODO Project 1
        // this method should be called by isPointInTheCircle and intersectWith methods
        //  it computes, prints and returns the distance between the given [x,y] coordinates
        //  of a point and the center of this circle
        return Distance = Math.sqrt(Math.pow(DEFAULT_CENTER_X - x, 2) + Math.pow(DEFAULT_CENTER_Y - y, 2));


    }

    public boolean isPointInTheCircle(Point point)
    {
        //TODO Project 1
        Point center = new Point();
        return this.distanceFromCenter(point.getX(), point.getY()) <= radius;
    }

    public boolean intersectsWith(Circle other)
    {
        //TODO Project 1
        return this.radius + DEFAULT_RADIUS > distanceFromCenter(other.getCenterX(),other.getCenterY()) && distanceFromCenter(other.getCenterX(),other.getCenterY()) > Math.abs(this.radius - DEFAULT_RADIUS);
    }

    public boolean sameAs(Circle other)
    {
        //TODO Project 1
        return this.radius == DEFAULT_RADIUS;
    }

    public String toString()
    {
        //TODO Project 1
        //return "Output from toString ???"; // THIS IS A STUB
        return getCenterX() + getCenterY() + " radius " + getRadius();
    }

    //public boolean equals(Circle other)
    //{
     //   final double THRESHOLD = 0.001;

     //   if(sameAs(other) getCenterX() = other.x, getCenterY() = other.y){
     //       return true;
   // } else {
    //        return false;
   // }


}
