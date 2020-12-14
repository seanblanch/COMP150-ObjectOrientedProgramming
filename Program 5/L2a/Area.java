//Sean Blanchard
//9/24/18
//Lab 5a


public class Area {

    public static void main(String [] args){
        //Area of square with side of 0.666666667
        double sides = 0.666666667;
        double areaOfSquare;

        areaOfSquare = sides * sides;
        System.out.println("The area of the square is: " + areaOfSquare);

        //Rectangle of sides 4.0 and 1.0/9.0.
        double rectangleSides = 4.0;
        double rectangleWidth = 1.0/9.0;
        double area;

                area = rectangleSides * rectangleWidth;

        System.out.println("The area of the rectangle is: " + area);

        //test fir equality
        if (areaOfSquare == area)
            System.out.println("The area are equal");
        else {
            System.out.println("The area is not equal");
        }


    }
}
