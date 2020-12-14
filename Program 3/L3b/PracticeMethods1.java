// Chapter 3 Programming Activity 2
//   Calling class methods
//
//

// ***** 
// 1. add your import statements
//Sean Blanchard
//Lab 3b
//COMP150
//9/17/18

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Random;
import java.util.Scanner;
public class PracticeMethods1
{
  public static void main( String [] args )
  {
    //*****
    // 2.  a. Create a Scanner object to read from the keyboard
    //     b. Prompt the user for his/her first name
    //     c. Print a message that says hello to the user
    //     d. Print a message that says how many letters
    //               are in the user's name
    
    // Your code goes here
    //a
    Scanner scan = new Scanner(System.in);
    //b
    System.out.println("Type your first name: ");
    String firstName = scan.nextLine();
    //c
    System.out.println("Hello, " + firstName);
    //d
    int index = firstName.length();
    System.out.println(index);




    
    
    //*****
    // 3.  Print an empty line
    
    // Your code goes here
    System.out.println();
    
    
    //*****
    // 4.  a. Using previously created Scanner object prompt the user for the year (s)he was born.
    System.out.println("Enter your year of Birth: ");
    int yearBorn = scan.nextInt();


    //     b. Calculate and print the age the user will be this year (prompt the user for the current year).
    System.out.println("Enter the current year: ");
    int currentYear = scan.nextInt();
    int yearsOld = (currentYear-yearBorn);
    System.out.println("You are " + yearsOld + "years old.");
    //     c. Declare a constant for average life expectancy,
    //            set its value to 78.74
    final double lifeExpectancy = 78.74;
    double lifeLeft = yearsOld/lifeExpectancy;
    //     d. Print a message that tells the user the percentage
    //            of their expected life they've lived.
    NumberFormat pct = NumberFormat.getPercentInstance();
    System.out.println("You have lived " + pct.format(lifeLeft) + " of your life");
    //       Use the DecimalFormat class to format the percentage
    DecimalFormat percnt = new DecimalFormat ("#0.00%");
    System.out.println("or " + percnt.format(lifeLeft));
    
    // Your code goes here

    
    
    //*****
    // 5.  a. Create a Random object
    //             and generate a random integer between 1 and 20 inclusive
    //     b. Using previously created Scanner object prompt the user for a guess.
    //     c. Print a message that tells the user the number
    //         and how far from the number the guess was (hint: use Math.abs)
    
    // Your code goes here
    System.out.println();
    System.out.println();
    System.out.println();

    final int MAX_FACE = 20;
    Random random = new Random();
      int generate = random.nextInt( MAX_FACE ) + 1;

    System.out.println("I'm thinking of a number between 1 and 20: ");

      int userGuess = scan.nextInt();

      if (MAX_FACE == userGuess)
        System.out.println("You guessed it right!");

      else
        System.out.println("You guessed wrong\n" + "The number is : " + MAX_FACE + "\n" +
                "You were only " + Math.abs(userGuess - MAX_FACE) + " away!");





    
    
  }
}