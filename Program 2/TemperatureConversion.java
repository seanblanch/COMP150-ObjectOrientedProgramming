// Temperature Conversion
// your name
//
// Sean Blanchard
// 9/8/2018
// L2a Temperature Conversion

public class TemperatureConversion
{
  public static void main( String [] args )
  {
    //***** 1. declare any constants here, FREEZING_POINT would be a good candidate, declare it as int
    //         (remember naming conventions for constants)
    int FREEZING_POINT;
    
    
    //***** 2. declare temperature in Fahrenheit as an int (remember naming convention for variables) and assign a value to it
    int FAHRENHEIT;
    FAHRENHEIT = 72;
    
    
    //***** 3. calculate equivalent Celsius temperature as double 
    //         ( coversion formula: tC = (tF - 32) * 5 / 9 )
    double Celsius;
    Celsius = (FAHRENHEIT-32)*5/9;
    
    
    //***** 4. output the temperature in Fahrenheit and its calculated equivalent in Celsius
    System.out.println("The temperature is " + FAHRENHEIT + " degrees Fahrenheit and " + Celsius + " degrees Celsius.");
    
    
    //***** 5. convert Celsius temperature back to Fahrenheit as int (use the same variable for the Fahrenheit that you declared in step 2)
    //         ( conversion formula: tF = tC * 9 / 5 + 32 )
    int newCelsius = 9;
    FAHRENHEIT = (newCelsius * 9 / 5 + 32);

    
    
    //***** 6. output the temperature in Celsius and the converted back temperature in Fahrenheit to check correctness 
    System.out.println("The Temperature is " + Celsius + " degrees Celsius and " + FAHRENHEIT + " degrees Fahrenheit");
    
  }
} 