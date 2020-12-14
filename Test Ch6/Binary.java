//Sean Blanchard
//10/17/18
//COMP 150 CH 6 test
//Write a program that takes as an input a string representing a binary number


import java.sql.SQLOutput;
import java.util.Scanner;

public class Binary {

    public static void main(String [] args){
        //variables
        String binaryNumber;
        String pattern = "[0-1]";
        int binaryInt;
        double value = 0;

        Scanner keyboard = new Scanner(System.in);

        do {
            //Enter a binary number
            System.out.println("Please enter a binary number");
            binaryNumber = keyboard.next();
        }
        while (!binaryNumber.matches(pattern)); // repeat until valid input
        for (int i =0; i < binaryNumber.length();  i--) {
            //check if i is a digit
            binaryInt  = Character.digit(binaryNumber.charAt(i), 1);
            System.out.println("Digit is " + binaryInt);

            if (binaryInt == 0) {
                System.out.println("Please enter valid Int/your int is at 0");

            } else {
                // take the power of binaryNumber with a index increasing
                value = value + (1 * Math.pow(2, 1));

            }

        }




    }
}
