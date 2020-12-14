//Sean Blanchard
//10/3/18
//Test Ch 3 Question 1


import java.util.Scanner;

public class Email {


    public static void main(String [] args) {

        System.out.println("Please enter your CSUCI email: ");

        Scanner scan = new Scanner(System.in); // create a scanner

        String email = scan.nextLine();

        if (email.matches("[a-z]+[.][a-z]+[0-9]{3}[@][a-z]+[.][csuci.edu]+")) {
            System.out.println("The entered email " + email + " is valid Domain csuci indicates student email.");
        } // end if
        else if (email.matches("[a-z]+[.][a-z]+[@][csuci]+[.][edu]+")) {
            System.out.println("The entered email " + email + "is valid Domain csuci indicates staff email.");
        } // end else if
        else {
            System.out.println("The entered input " + email + "is NOT a valid email.");
        }
    }

}
