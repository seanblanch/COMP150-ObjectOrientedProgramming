import java.util.Scanner;

/**
 * FractionCalculator - A client class of the Fraction class.
 *
 * @author Sean Blanchard
 * @version 10/24/18
 */
public class FractionCalculator
{
  public static void main(String args[])
  {

    System.out.println("*** Welcome to FRACTION CALCULATOR ***");

    //TODO Project 2
    //1. prompts the user for four integers needed to create two Fraction objects
    Scanner scan = new scan(System.in);
    Fraction fraction = new Fraction();

    System.out.println("enter numerator of the first fraction\n");
    fraction.getNumerator(scan.nextInt());
    System.out.println("Enter denominator of the first fraction\n");
    fraction.getDenominator(scan.nextInt());
    //System.out.println("Enter numerator of the second fraction\n");
    //fraction.getNumerator(scan.nextInt());
   // System.out.println("Enter denominator of the second fraction\n");
   // fraction.getDenominator(scan.nextInt());


    
    
    //2. creates two Fraction objects fraction1 and fraction2
    Fraction fraction1 = new Fraction(1,2);
    Fraction fraction2 = new Fraction(2,5);
    
    //3. prompts for the operation to be performed on these objects which is 
    //          one of: '+' (addition), '-' (subtraction), '*' (multiplication), ':' (division)
    System.out.println("Enter the option you would like to perform ( + - * : ) ");
    String input = scan.nextLine();
    
    
    
    //4. performs the requested operation by calling appropriate method from your Fraction class 
    //          and displays the result. 
    //          Use switch. See the attached sample run.    
    //
    // HINT:
    // if I wanted to add two Fraction objects fraction1 and fraction2
    // I would do the following to compute the sum and to print the result:
    //
    //     Fraction sum = fraction1.add(fraction2);
    //     System.out.println(fraction1 + " plus " + fraction2 + " is " + sum );
    //

    if(input == '+'){
        Fraction sum = fraction1.add(fraction2);
        System.out.println(fraction1 + " plus " + fraction2 + " is " + sum );
    } else if (input == '-'){
        Fraction sub = fraction1.simplify(fraction2);
        System.out.println(fraction1 + " subtract " + fraction2 + " is " + );
    } else if (input == '*'){
        Fraction mult = fraction1.multiply(fraction2);
        System.out.println(fraction1 + " multiplied " + fraction2 + " is " + );
    } else {
        Fraction div = fraction1.reciprocal(fraction2);
        System.out.println(fraction1 + " divided " + fraction2 + " is " + );
    }
  }
}