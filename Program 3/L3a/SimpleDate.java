/* A simple date class
 Anderson, Franceschi
 */
// Sean Blanchard
// 9/10/18
// Lab 3a SimpleDate

public class SimpleDate
{
  private int month;
  private int day;
  private int year;
  private final int FEBRUARY = 2;
  
  /** default constructor
    *  sets month to 1, day to 1 and year to 2000
    */
  public SimpleDate( )
  {
    setDate( 1, 1, 2000 );
  }
  
  /** overloaded constructor
    *  @param mm    initial value for month
    *  @param dd    initial value for day
    *  @param yyyy  initial value for year
    *
    *  passes parameters to set methods
    */
  public SimpleDate( int mm, int dd, int yyyy )
  {
    setMonth( mm );
    setYear( yyyy );
    setDay( dd );
  }
  
  /* accessor methods */
  int getMonth( ) { return month; }
  int getDay( )   { return day; }
  int getYear( )  { return year; }
  
  /** mutator method */
  /** setMonth
    *  @param mm new value for month
    *  if mm is between 1 and 12, sets month to mm
    *  otherwise, sets month to 1
    */
  public void setMonth( int mm )
  {
    month = ( mm >= 1 && mm <= 12 ? mm : 1 );
  }
  
  /** setDay
    *  @param dd new value for day
    *  if dd is legal day for current month, sets day to dd
    *  otherwise, sets day to 1
    */
  public void setDay( int dd )
  {
    day = ( dd >= 1 && isValidDay( dd ) ? dd : 1 );
  }
  
  /** setYear
    *  @param yyyy new value for year
    *  sets year to yyyy
    */
  public void setYear( int yyyy )
  {
    year = yyyy;
  }
  
  /** sets date to the next day
    */
  public void nextDay( )
  {
    if ( ! isValidDay( ++day ) )
    {
      day = 1;
      if ( ++month > 12 )
      {
        month = 1;
        year++;
      }
    }
  }
  
  private boolean isValidDay( int newDay )
  {
    int [] daysInMonth = { 0, 31, 28, 31,
      30, 31, 30,
      31, 31, 30,
      31, 30, 31 };
    
    if ( newDay > daysInMonth[month] )
    {
      if ( month == FEBRUARY && isLeapYear( ) && newDay == 29 )
        return true;
      else
        return false;
    }
    else
      return true;
    
  }
  
  private boolean isLeapYear( )
  {
    return !( year % 4 != 0
               ||( year % 100 == 0 && year % 400 != 0 ) );
  }
  
  
  /** setDate
    *  @param mm    new value for month
    *  @param dd    new value for day
    *  @param yyyy  new value for year
    *  passes parameters to setMonth, setDay, and setYear
    */
  public void setDate( int mm, int dd, int yyyy )
  {
    setYear( yyyy );  // set year first (could be leap year)
    setMonth( mm );   // set month next
    setDay( dd );     // set day
  }
  
  /** toString
    *  @return String
    *  returns date in mm/dd/yyyy format
    */
  public String toString( )
  {
    return month + "/" + day + "/" + year;
  }
  
  /** equals
    *  @param   other  SimpleDate object to compare to this object with
    *  @return  true if d is equal to this object
    *           false, otherwise
    */
  public boolean equals( SimpleDate other )
  {
    return ( month == other.month
              && day == other.day
              && year == other.year );
  }
}
