//Sean Blanchard
//9/24/18
//Lab 5b
//Year


import java.util.Scanner;

public class Year {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // create a scanner
        System.out.println("Please enter the year: ");
        String year = scan.nextLine();
        String ValidDidgets = "[0-9]+"; // create a string of Valid Didgets

        if (year.matches(ValidDidgets)) {
            switch (year.length()) {
                case 2: // print out if user enters 2 didgets but add 20 in front
                    System.out.println((2000 + Integer.parseInt(year)));
                    break;
                case 4: //pring out if use 4 didgets
                    System.out.println(year);
                    break;
                default: //not a valid 4 or 2 didgets
                    System.out.println("Entered year is not valid");

            }
        } else {
            System.out.println("Invalid input. Input must be all didgets.");
        }


    }
}
