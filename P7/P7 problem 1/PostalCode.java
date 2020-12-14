/**
 * SERVICE CLASS Translate ZIP code into its bar code representation
 *
 * @author Sean Blanchard
 * @version 10/28/2018
 */
public class PostalCode
{
    /**
     * Instance variable. <BR>
     * Contains the zipCode in a DDDDD-DDDD format
     * (for example 12345-6789)
     */
    private String zipCode;

    /**
     * Secondary constructor.<BR>
     * Allows user to provide the value of the zipCode
     *
     * @param zipCode initial value of the zipCode
     */
    public PostalCode(String zipCode)
    {
        setZipCode(zipCode);
    }

    /**
     * Mutator method.<BR>
     * Sets the value of a zipCode to the given new value
     *
     * @param zipCode
     */
    public void setZipCode(String zipCode)
    {
        this.zipCode = zipCode;
    }

    /**
     * method that converts the zipCode into the bar code format
     */
    public StringBuilder computeBarCode()
    {
        // TODO Project 1
        // IMPLEMENT THIS METHOD

        // 1. first remove all '-' for easy processing by calling replaceAll
        String zipCodeDigits = this.zipCode.replaceAll("-",""); //Remove all '-'
        System.out.println("The zip string to be processed is " + zipCodeDigits);

        // 2. calculate the checksum by calling the private calculateChecksum method
        int checkSum = calculateChecksum(zipCodeDigits);

        // 3. calculate the check digit by calling the private calculateCheckDigit method
        int checkDigit = calculateCheckDigit(checkSum);
        System.out.println("The checksum is " + checkSum);
        // 4. append the check digit to the zip string for final processing
        zipCodeDigits += (char)(checkDigit+'0');
        System.out.println("The zip with the check digit is " + zipCodeDigits);

        // 5. produce the bar code and save it in barCode variable
        //    - check java API for description of StringBuilder append method
        String codes[] =  {"||:::", ":::||", "::|:|", "::||:", ":|::|", ":|:|:", ":||::", "|:::|", "|::|:", "|:|::"};
        StringBuilder barCode = new StringBuilder("|");

        //    use a for loop and a switch inside the loop 
        for(int i=0; i<zipCodeDigits.length(); i++){
            int index = zipCodeDigits.charAt(i)-'0';
            barCode.append(codes[index]);
        }
        barCode.append("|");
        return barCode;
    }

    /**
     * Business method that calculates the checksum for the given zipCode.
     *
     * @param zipCodeDigits the zipCode without '-'
     * @return checkSum
     */
    private int calculateChecksum(String zipCodeDigits)
    {
        // TODO Project 1
        int checkSum = 0;
        // IMPLEMENT THIS METHOD
        // HINT: to get the numeric value of each character
        //       utilize Character.digit(zipCodeDigits.charAt(i),10) method inside
        //       a for loop which runs over zipCodeDigits string
        for (int i=0; i<zipCodeDigits.length(); i++){
            checkSum += Character.digit(zipCodeDigits.charAt(i), 10);
    }
        return checkSum;
    }

    /**
     * Business method that calculates the check digit.
     *
     * @param checkSum sum of the digits in the zip code
     * @return check digit
     */
    private int calculateCheckDigit(int checkSum)
    {
        // TODO Project 1
        int checkDigit = 0;
        // IMPLEMENT THIS METHOD
        if(checkSum%10==0){
            checkDigit = 0;
        } else {
            checkDigit = ((int)Math.floor(checkSum/10)+1)*10-checkSum;
        }

        return checkDigit;
    }

    /**
     * Accessor method.
     *
     * @return the instance variable zipCode
     */
    public String getZipCode()
    {
        return this.zipCode;
    }

    /**
     * toString method.
     *
     * @return the string representation of the PostalCode object
     */
    public String toString()
    {
        return "The zip code: " + this.zipCode + " has the following bar code: " + computeBarCode();
    }
}