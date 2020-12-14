//Sean Blanchard
//10/23/18
//COMP150 Lab 7b


import java.text.DecimalFormat;

public class Course {
    //Instance Variables
    private String description;
    private int numberOfCredits;
    private String code;

    public Course(){

        this.code = null;
        this.description = "";
        this.numberOfCredits = 0;
    }
    public Course (String startDescription, int startNumberOfCredits, String startCode){
        description = startDescription;
        numberOfCredits = startNumberOfCredits;
        code = startCode;
    }
    //Accessor Methods
    //returns current value of description
    public String getDescription(){
        return this.description;
    }
    //returns current value of numberOfCredits
    public int getNumberOfCredits(){
        return this.numberOfCredits;
    }
    //returns current value of code
    public String getCode(){
        return this.code;
    }
    //Mutator methods
    //allows client to set description
    public void setDescription(String description){
        this.description = description;
    }
    public void setNumberOfCredits(int numberOfCredits){
        this.numberOfCredits = numberOfCredits;
    }

    public void setCode(String code) {
        this.code = code;
    }

    //toString Method
    public String toString(){
        DecimalFormat courseFormat = new DecimalFormat("#0.0");
                return "Course: " + getDescription()
                        + "; Number of Credits: " + courseFormat.format(getNumberOfCredits())
                        + "; code: " + getCode()
                        + "; The level is: " + level();

    }

    //Equals Method
    public boolean equals(Course otherObject){
       return(this.code.equalsIgnoreCase(otherObject.code) && this.description.equalsIgnoreCase(otherObject.description));
    }

    //Course Level
//    public String level(){
//        if(code.equals("CR1")){
//            System.out.println("1");
//        }else if(code.equals("CR2")){
//            System.out.println("2");
//        }else if(code.equals("CR3")){
//            System.out.println("3");
//        }else if(code.equals("CR4")){
//            System.out.println("4");

//        return level();

        public char level() {
            return this.code.charAt(code.length() - 1);
        }

//    }
}


