//Sean Blanchard
//10/22/18
//lab 7a
// Create 3 fields:name(String),number(int), and cable(boolean)

public class TelevisionChannel {

    private String name;
    private int number;
    private boolean cable; //represents whether the channel is a cable channel

    //A default constructor that initialized the fields to an empty string, 0,
    //and false respectively
    public TelevisionChannel(){
        name = "";
        number = 0;
        cable = false;
    }


    //A secondary constructor that takes three parameters
    public TelevisionChannel(String startName, int startNumber, boolean startCable) {
        name = startName;
        number = startNumber;
        cable = startCable;
    }
    //accessor methods for each field
    //returns the value of name
    public String getName(){
        return name;
    }
    //returns the current value of number
    public int getNumber(){
        return number;
    }
    // returns the current value of cable

    public boolean isCable() {
        return cable;
    }
    //Mutator methods for each field
    // allows client to set cable t/f
    public void setCable(boolean cable) {
        this.cable = cable;
    }
    // allows client to set name
    public void setName(String name) {
        this.name = name;
    }
    // allows client to set value of number
    public void setNumber(int number) {
        this.number = number;
    }
    public int business(){
       String newNumber = String.valueOf(number);
       int length = newNumber.length();
        return length;



    }

}
