//Sean Blanchard
//10/16/18
// COMP 150
//Square root user number until smaller than 1.01


package Lab6a;

import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args){
        //variable
        double Number;
        double sqRoot;
        int sqRootCounter = 0; //start at 0

        Scanner keyboard = new Scanner(System.in);

        //While the inputed number is less than or equal to 10, ask for number greater than 10
       do {
           System.out.println("Enter a number greater than 10.0 > ");
           Number = keyboard.nextDouble();
       }
        // while number is less than 10 run math.sqrt, increment counter by 1
        while (Number <= 10) ;
            sqRoot = Math.sqrt(Number);
            sqRootCounter++;
            // when sqRoot is greater than then 1.01 print the sqroot
        while (sqRoot > 1.01){
            System.out.println(sqRootCounter + ". Calculated square root is " + sqRoot);
            sqRoot = Math.sqrt(sqRoot);
            sqRootCounter++;

        }

    }
}
