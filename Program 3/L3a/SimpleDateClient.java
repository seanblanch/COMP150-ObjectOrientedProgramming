// A client program to display SimpleDate object values
// Sean Blanchard
//  Lab 3a
// 9/17/18

public class SimpleDateClient
{
  public static void main( String [] args )
  {
    SimpleDate dateObj; // declare SimpleDate object reference
    System.out.println( "dateObj reference variable declared: ");

    /*****              Add your code below each step               *****/
    /*****    Uncomment System.out.println statement that follow    *****/
    /***** Compile and test each step before moving to the next one *****/
    
    
    /**** 1. Create dateObj using the SimpleDate default constructor  */
    dateObj = new SimpleDate();


    System.out.println( "Created dateObj object with the default constructor: " + dateObj.toString());

    /***** 2. Set the month of dateObj to the month you were born */
    dateObj = new SimpleDate(8,8,1993);


    System.out.println( "Set month to birth month: " + dateObj.getMonth());


    /***** 3. Set the day of dateObj to the day of the month you were born */



    System.out.println( "Set day to birth day: " + dateObj.getDay());


    /***** 4. Set the year of dateObj to the year you were born */


    System.out.println( "Set year to birth year: " + dateObj.getYear() );


    /***** 5. Call the nextDay method to set the dateObj to the next day */
    dateObj.nextDay();

    System.out.println( "Set the date to the next day: " + dateObj.toString() );


    /***** 6. Set the dateObj day to 32, an illegal value */
    dateObj.setDay(32);


    System.out.println( "Set day to 32: " + dateObj );


    /***** 7. Set the dateObj month to 13, an illegal value */
    dateObj.setMonth(13);
    

    System.out.println( "Set month to 13: " + dateObj);


    /***** 8. Assign the value of null to dateObj */
    dateObj = null;


    System.out.println( "Set object reference to null: " + dateObj);


    /***** 9. Attempt to set the month to 1 */
    dateObj.setMonth(1);

    System.out.println( "Attempting to set the month to 1" + dateObj);

  }
}
