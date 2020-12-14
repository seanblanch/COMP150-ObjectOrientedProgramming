package L8a; /**   Lab8a
  *   @author Sean Blanchard
  *   @version 10/30/18
 *   LAB8a
  */
import java.util.*;
public class ArrayMethodsClientL8a
{ 
  public static void main( String [] args )
  {
    // declare and initialize array of integers in ascending order
    int [] numbers = { 1, 2, 3, 4, 5, 6 };
    int[] numbers2 = { 7, 6, 5, 6, 8, 9, 8, 8, 5, 8 };
    
    // create an ArrayMethods object - passing the array to the object
    ArrayMethodsL8a arr1 = new ArrayMethodsL8a(numbers);
    System.out.println("Created arr1 object with the secondary constructor.");
    
    // print the content of the array
    System.out.println( "---->The elements of the array in arr1 object are: " + arr1);
    
    // print the value of the product calculated  by the method arrayProduct
    System.out.println( "---->The product of all elements in the array is: "
                         + arr1.arrayProduct() );
    
    // create an ArrayMethods object with default constructor
    ArrayMethodsL8a arr2 = new ArrayMethodsL8a(numbers2);
    System.out.println("\nCreated arr2 object with the default constructor.");
    
    // print the content of the array
    System.out.println( "---->The elements of the array in arr2 object are: " + arr2);
    
    // print the value of the product calculated  by the method arrayProduct
    System.out.println( "---->The product of all elements in the array is: "
                         + arr2.arrayProduct() );
    // print the odd indexed elements 
    System.out.println( "\n---->The odd-indexed elements in arr2 object are:");

    // STUDENT IMPLEMENTS THE FOLLOWING
    // vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv

    
    // call accessor method getIntArray
    int[] arrayTemp = arr2.getIntArray();
 
    
    // using a for loop print the odd-indexed elements of the retrieved array
    for ( int i = 1; i < arr2.getLength(); i += 2){
      System.out.println(arrayTemp[i]);
    }
    // Output Sum of Even Indexed Array items
    System.out.println( "\n---->The sum of even indexed array items is: " + arr2.Sum() + "\n" );

    // Create Array to test Percentage Method and Boolean Method
    int[] numbers3 = {10, 27, 44, 100, 177, 122, 2, 77, 4}; // 3 / 9 = .33 %
    ArrayMethodsL8a arrayGT90 = new ArrayMethodsL8a( numbers3 );
    int[] numbers4 = { 90, 90, 90, 90, 90, 90, 90, 90, 90, 90, 90 }; // 100%
    ArrayMethodsL8a arrayAll90 = new ArrayMethodsL8a( numbers4 );

    // Output Boolean Array of Array Integers - True >= 100
    boolean[] intAsBoolean = arrayGT90.toBoolean();
    System.out.println( "The span of Array 3 numbers that are over 100: " );
    // Print Each Boolean in Array - This Array will be all false
    for ( int i = 0; i < intAsBoolean.length; i++ )
    {
      System.out.print( intAsBoolean[ i ] + " " );
    }
    System.out.println( "\n" ); // Empty/Newline;

    // Output Array Percentages with Numbers >= 90
    System.out.println( "Percentage of Array with Numbers less than 90: " + arr2.percentage() ); // All items are less than 90
    System.out.println( "Percentage of Array with Numbers greater than or equal 90: " + arrayGT90.percentage() );   // Items >= 90
    System.out.println( "Percentage of Array with All Numbers equal 90: " + arrayAll90.percentage() ); // All Items are 90
    
    

    // ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
    
    // print the smallest element
    System.out.println( "\n---->The smallest element in arr2 object is: "
                         + arr2.findMinimum() );
    
    Scanner scan = new Scanner(System.in);
    System.out.println("\nEnter a value to count the frequency of");
    int value = scan.nextInt();
    // print the frequency of value
    System.out.println( value + " appears " + arr2.countFrequency(value) + " times.");
  }
}
