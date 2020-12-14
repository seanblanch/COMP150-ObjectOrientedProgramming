import java.util.Scanner;

/**
 *  Fraction Class
 *
 *  @author Sean Blanchard
 *  @version 10/24/18
 */

public class Fraction
{
  private int numerator;
  private int denominator;
  
  /**
   * Default constructor:
   * Sets numerator and denominator to 1
   */
  public Fraction()
  {
    this.numerator = 1;
    this.denominator = 1;
  }
  
  
  /**
   * Overloaded constructor:
   * Allows client to set beginning values for numerator
   *   and denominator
   *   The created fraction is NOT simplified
   * This constructor takes two parameters
   * Calls mutator methods to validate new values
   * @param numerator the numerator of the fraction
   * @param denominator the denominator of the fraction
   */
  public Fraction(int numerator, int denominator)
  {
    setNumerator( numerator );
    setDenominator( denominator );
  }
  
  /** getNumerator method
    * @return the numerator of the fraction
    */
  public int getNumerator( )
  {
    return this.numerator;
  }
  
  /**
   * Mutator method:
   * Allows client to set value of numerator
   * @param numerator the new value of numerator
   */
  public void setNumerator( int numerator )
  {
    this.numerator = numerator;
  }
  
  /** getDenominator method
    * @return the denominator of the fraction
    */
  public int getDenominator( )
  {
    return this.denominator;
  }
  
  /**
   * Mutator method:
   * Sets the value
   *   of this.denominator to 1 if the passed value is 0
   * Ensures that the value
   *   of denominator is positive without affecting the sign of the fraction
   * @param denominator the new denominator
   */
  public void setDenominator( int denominator )
  {
    if ( denominator != 0 )
    {
      this.denominator = denominator;
      if (this.denominator < 0)
      {
        // make the denominator positive and multiply numerator by negative one
        // to ensure the same value of the overall fraction       
        this.denominator *= -1;
        this.numerator *= -1;
      }
    }
    else
    {
      this.denominator = 1;
      System.out.println("Denominator cannot be equal to 0.");
      System.out.println("   Denominator set to 1.");
    }
  }
  
  /**
   * Compute the greatest common divisor of numerator and denominator
   *
   * @return the gcd
   */
  private int calcGcd()
  {
    int result = 1;
    int a = this.numerator;
    int b = this.denominator;
    if (a < 0)
    {
      a = -a;
    }
    if (b < 0)
    {
      b = -b;
    }
    if (a == b)
    {
      result = a;
    }
    else
    {
      int smaller = Math.min(a,b);
      while (smaller > 0 && result == 1)
      {
        if ((a%smaller == 0) && (b%smaller == 0))
        {
          result = smaller;
        }
        smaller--;
      }
    }
    return result;
  }
  
  /**
   * @return the String representation of the fraction
   */
  public String toString( )
  {
    return( this.numerator + "/" + this.denominator );
  }
  
  /**
   * equals method
   * Compares two Fraction objects for the same field values
   * @param other another Fraction object
   * @return a boolean, true if this object
   * has the same field values as the parameter r
   */
  public boolean equals( Fraction other )
  {
    return ( this.numerator == other.numerator
              && this.denominator == other.denominator );
  }

  /**
   * Creates a Fraction object that is this Fraction simplified
   *
   */
  public Fraction simplify()
  {
    int gcd = calcGcd();
    Fraction simpFraction = new Fraction((this.numerator / gcd),
            (this.denominator / gcd));
    return simpFraction;
  }

  //  vvvvvvvvvvvvvvvvv NEW METHODS  vvvvvvvvvvvvvv
  
  /**
   * reciprocal method
   * @return a Fraction, the reciprocal of this fraction or null
   *        if the new denominator is to be 0
   */
  public Fraction reciprocal( )
  {
    // TODO Project 2
    if (numerator == 0){
      return null;
    } else {
      return simplify();
    }// THIS IS A STUB
  }
  
  /**
   * negate method
   * @return a Fraction, the negation of this Fraction
   */
  public Fraction negate( )
  {

    // TODO Project 2
    return null;
  }
  
  /**
   * add method
   * Adds two Fraction objects and produces the result simplified (utilizes simplify method)
   * @param other another Fraction object
   * @return a Fraction, the result of the addition simplified.
   */
  public Fraction add( Fraction other )
  {
    // TODO Project 2
    return null; // THIS IS A STUB
  }
  
  /**
   * multiply method
   * Multiplies two Fraction objects and produces the result simplified (utilized simplify method)
   * @param other another Fraction object
   * @return a Fraction, the result of the multiplication simplified
   */
  public Fraction multiply( Fraction other )
  {
    // TODO Project 2
    return null; // THIS IS A STUB
  }
}