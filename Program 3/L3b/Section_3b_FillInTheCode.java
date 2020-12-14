/**
 * @author Sean Blanchard
 * @version 9/17/18
 */

import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.Random;

public class Section_3b_FillInTheCode
{
    public static void main(String[] args)
    {
        // Code the following exercises:
        // ============================


        // #1 this code prompts the user for a sentence, then prints the String

        System.out.println("Please enter a sentence: ");
        Scanner scan = new Scanner( System.in );  // Creating a scanner
                String response = scan.nextLine();
        System.out.println(response);  //Printing the response to the sentence


        // #2 this code prompts the user for an integer, prints it,
        //    and saves it to a variable
        System.out.println("Please enter an integer: ");
            int number = scan.nextInt();
        System.out.println(number);




        // #3 this code randomly generates two integers between 5 and 15 inclusive
        //    and finds the smallest of the two
        //    prints the values of the integers and the result
        //    utilize nextInt method from Random class and min method from Math class

        Random generator = new Random();
        int MAX_FACE = 10;
        int randomNumber = generator.nextInt(MAX_FACE) + 5;
        int randomNumber2 = generator.nextInt(MAX_FACE) + 5;
        System.out.println("The two random numbers are : " + randomNumber + "\n");
        System.out.println(randomNumber2);

        if (randomNumber > randomNumber2)
            System.out.println(randomNumber2 + " Is the lesser number.\n");
        else if (randomNumber < randomNumber2)
            System.out.println(randomNumber + " Is the lesser number.\n");
        else
                    System.out.println("The numbers are equal.");





        // #4 this code randomly generates an integer that is a single digit
        //    and calculates the sum of the four integers (include the integers from exercise #2 and #3),
        //    and their average.
        //    sum should be an int but average should be a double (use casting)
        //    Print the values of the four variables, the sum, and the calculated average;
        //    Format average with DecimalFormat to display one digit after decimal points.
        MAX_FACE = 8;
        int randomNumber3 = generator.nextInt(MAX_FACE) + 1;
        System.out.println("The four variables are: ");
        System.out.println(number);
        System.out.println(randomNumber);
        System.out.println(randomNumber2);
        System.out.println(randomNumber3);
        System.out.println("The sum of all four number is: ");
        System.out.println((number+randomNumber+randomNumber2+randomNumber3));
        System.out.println("the calculated average of all four numbers: ");
        System.out.println(((double)number+randomNumber+randomNumber2+randomNumber3)/4);
        DecimalFormat percnt = new DecimalFormat (".0");
        System.out.println("or " + percnt.format(((double)number+randomNumber+randomNumber2+randomNumber3)/4));


        // #5 this code randomly generates a boolean and prints the result
        //    use nextBoolean method from Random class
        boolean randomBoolean = generator.nextBoolean();
        System.out.println("random boolean = " + randomBoolean);



        // #6 this code prompts the user for a character, prints it, prints its UniCode value,
        //    checks if the character is a digit and prints the result
        //    see Chapter3 -> Example03_Character -> CharacterDemo
        System.out.println("Enter a character: ");
        char ch = scan.next().charAt(0);
        int uniCode = Character.getNumericValue(ch);
        System.out.println("The unicode value of " + ch + " is " + uniCode);
        if(ch >= '0' && ch <='9')
            System.out.println(ch+ " is a digit");
        else
            System.out.println(ch + " is not a digit");



        
    }
}
