/* Airport class
   Anderson, Franceschi
*/

public class Airport
{

  // instance variables
  private String airportCode;
  private int gates;

  // 1. ***** Add a static class variable *****
  //  countAirports is an int
  //  assign an initial value of 0
    int countAirports = 0;



  // 2. ***** Modify this method *****
  // Default constructor:
  // method name: Airport
  // return value:  none
  // parameters: none
  // function: sets the airportCode to an empty String
  //    ***** add 1 to countAirports class variable
  public Airport( )
  {
     this.airportCode = "";
     this.gates = 0;
     countAirports = countAirports + 1;

  }

  // 3. ***** Modify this method *****
  // Overloaded constructor:
  // method name: Airport
  // return value: none
  // parameters:  a String airport code and an int gates
  // function: assigns this.airportCode the value of the
  //      airportCode parameter;
  //      calls the setGates method,
  //      passing the gates parameter
  //    ***** add 1 to countAirports class variable
  public Airport( String airportCode, int gates )
  {
     this.airportCode = airportCode;
     setGates( gates );
     countAirports++;

  }

  // Accessor method for the airportCode instance variable
  // method name: getAirportCode
  // return value: String
  // parameters: none
  // function: returns airportCode
  public String getAirportCode( )
  {
     return this.airportCode;
  }

  // Accessor method for the gates instance variable
  // method name: getGates
  // return value: int
  // parameters: none
  // function: returns gates
  public int getGates( )
  {
     return this.gates;
  }

  // 4. ***** Write this method *****
  // Accessor method for the countAirports class variable
  // method name: getCountAirports
  // return value: int
  // parameters: none
  // function: returns countAirports
    public int getCountAirports(){
      return this.countAirports;
    }




  // Mutator method for the airportCode instance variable
  // method name: setAirportCode
  // return value: void
  // parameters: String airportCode
  // function: assigns this.airportCode the value of the
  //                    airportCode parameter
  public void setAirportCode( String airportCode )
  {
     this.airportCode = airportCode;
  }

  // Mutator method for the gates instance variable
  // method name: setGates
  // return value:  void
  // parameters: int gates
  // function: validates the gates parameter.
  //   if gates is greater than 0, sets this.gates to gates;
  //   otherwise, prints an error message to System.out
  //   and does not change value of gates
  public void setGates( int gates )
  {
     if ( gates  >=  0 )
     {
       this.gates = gates;
     }
     else
     {
       System.out.println( "Gates must be at least 0" );
       System.out.println( "Value of gates unchanged." );
     }
  }

  // 5. ***** Write this method *****
  // method name:  toString
  // return value: String
  // parameters: none
  // function:  returns a String that contains the airportCode
  //    and gates
    public String toString(){
        return airportCode;
}





  // 6. ***** Write this method *****
  // method name: equals
  // return value: boolean
  // parameter:  Airport other
  // function:  returns true if airportCode and gates in this object
  //    are equal to those in the parameter object other
  //    returns false otherwise

    public boolean equals(){

      if(airportCode && gates){
          return true;
      } else {
          return false;
      }
    }
 




   }  // end of Airport class definition
