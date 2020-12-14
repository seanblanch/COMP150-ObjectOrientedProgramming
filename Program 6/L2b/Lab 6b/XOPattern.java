//Sean Blanchard
//10/16/18
//COMP 150
//Write a program that uses nested for loops to create the pattern of Xs and Os.
//This program will display one addition space to the right

import java.util.Scanner;

public class XOPattern {
    public static void main(String[] args) {
        //Variable
        int numberOfLines;
        char xChar = 'X';
        char oChar = 'O';
        boolean character = true; //True is X, False is 0

        //Scanner
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the number of lines: ");
        numberOfLines = keyboard.nextInt();

        //Print XO pattern
        for (int lineNumber = 0; lineNumber < numberOfLines; lineNumber++) {

            //Value of colum is set to 0 after loop
            // loop to print another space since lineNumber is increased by one
            for (int column = 0; column <= lineNumber; column++) {
                if (lineNumber == column) {
                    if (character) {
                        System.out.print(xChar);
                        character = false;
                    } else {
                        System.out.print(oChar);
                        character = true;
                    }
                } else {
                    System.out.print(" ");
                }
            }
                System.out.println();
            }
        }
    }

