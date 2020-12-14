package L8a;
import  java.text.DecimalFormat;
import java.util.Arrays;

/**  Supporting methods for an integer array
  *   @author Sean Blanchard
  *   @version 10/30/18
 *   LAB8a
  */

public class ArrayMethodsL8a
{
  /**
   * instance variable array of ints
   */ 
  private int [] intArray;
  private final int DEFAULT_SIZE = 15;
  
  /**
   * default constructor, 
   * creates the intArray of size DEAFULT_SIZE and 
   * calls fillValues method to fill the instance variable intArray 
   * with random values
   */
  public ArrayMethodsL8a()
  {
    this.intArray = new int [DEFAULT_SIZE];
    fillValues();
  }
  /**
   * secondary constructor, 
   * the instance variable intArray will be a copy of the array created by the user
   */
  public ArrayMethodsL8a(int [] newArray)
  {
    setIntArray(newArray);
  }
  
  /**
   * accessor method, 
   * returns a copy of the instance variable intArray
   */
  public int [] getIntArray()
  {
    // instantiate array with the same length as the parameter
    int[] copy = new int [this.intArray.length];
    for (int i = 0; i < this.intArray.length; i++)
    {
      copy[i] = this.intArray[i];
    }
    return copy;
  }
  
  /**
   * returns the length of the instance variable intArray
   */
  public int getLength()
  {
    return this.intArray.length;
  }
  
  /**
   * mutator method, 
   * the instance variable intArray will be a copy of the array passed by the user
   */
  public void setIntArray(int[] newArray)
  {
    // instantiate array with the same length as the parameter
    this.intArray = new int [newArray.length];
    for (int i = 0; i < newArray.length; i++)
    {
      this.intArray[i] = newArray[i];
    }
  }
  
  /**
   * equals method
   * checks if the array in this object is the same as the array in the other object
   * if the lengths are not the same returns false right away
   * otherwise compares the elements until either the first not the equal pair is found
   *    or there are no more elements to compare
   */
  public boolean equals (ArrayMethodsL8a other)
  {
    boolean isEqual = true;
    if ( this.intArray.length != other.intArray.length )
    {
      isEqual = false; // arrays are not the same size
    }
    else
    {
      for ( int i = 0; i < this.intArray.length && isEqual; i++ )
      {
        if ( this.intArray[i] != other.intArray[i] )
        {
          // found the first pair that is not the same
          // no need to compare any further
          isEqual = false; 
        }
      }
    }
    return isEqual;
  }
  
  /**
   * toString method returns printable version
   * of the content of intArray
   */
  public String toString()
  {
    String returnValue = "";
    for ( int i = 0; i < this.intArray.length; i++ )
    {
      returnValue += this.intArray[i] + " ";
    }
    return returnValue += "\n";
  }
  
  // *** BUSINESS METHODS *** //
  
  /**
   * calculates product of all the integers in this.intArray
   * @return an integer - value of the product
   */
  public int arrayProduct()
  {
    int product = this.intArray[0];
    for ( int i = 1; i < this.intArray.length; i++ )
    {
      product *= this.intArray[i];
    }
    return product;
  } 
  
  /**
   * fills this.intArray with random numbers between 5 and 9 inclusive.
   */
  private void fillValues( )
  {
    
    System.out.println("in fillValues - IMPLEMENT ME");
    
    
  }
  
  
  /** Counts number of elements in this.intArray that are equal to parameter value
    *     
    *      @param  value    the value to count
    *      @return   the number of elements equal to value
    */
  public int countFrequency( int value )
  {
    
    System.out.println("in countFrequency - IMPLEMENT ME");
    int count = 0;

    //check each array number
    for ( int i = 0; i < this.intArray.length; i++){
      if (this.intArray[i] == value){
        count++;
      }
    }
    
    
    
    return count; // replace this line with your return statement
    
  }



  /** Finds and returns the minimum value in this.intArray
    *    
    *      @return the minimum value found in this.intArray
    */
  public int findMinimum(  )
  {


    Arrays.sort(this.intArray);

    return this.intArray[0];

  }
  // find the sum of array at each index
  public int Sum(){
    int sum = 0;

    //Check each array number
    for ( int i = 0; i < this.intArray.length; i += 2){
      sum += this.intArray[i];
    }
    return sum;
  }

  //Convert array to Booleans if array number is greater or equal to 100
  public boolean[] toBoolean(){
    boolean[] boolArray = new boolean[this.intArray.length];

    // Check each array number
    for ( int i = 0; i < this.intArray.length; i++){
      if ( this.intArray[i] >= 100 ){
        boolArray[i] = true;
      } else {
        boolArray[i] = false;
      }
    }
    return boolArray;
  }

  public String percentage (){
    DecimalFormat percent = new DecimalFormat("0.0'%'");
    double count = 0.0;

    //Check each array number
    for ( int i = 0; i < this.intArray.length; i++){
      if(this.intArray[i] >= 90){
        count++;
      }
    }
    return percent.format(count / this.intArray.length * 100);
  }


}