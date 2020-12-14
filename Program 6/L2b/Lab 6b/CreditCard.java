//Sean Blanchard
//10/16/18
//COMP150
//Find credit card using algorithms given in problem #2 in lab 6b


import java.util.Scanner;

public class CreditCard {
    public static void main(String [] args){
        //Variable
        final String validCreditCard = "[0-9]{8}"; //pattern of 8 digits (0-9)
        int cardNumberInt;
        int evenDoubled;
        int checkSum;
        int oddSum;
        int evenSum;
        String cardNumber;
        String trueOrFalse;

        Scanner keyboard = new Scanner(System.in);
        do {
            // If user checks another credit card reset sum to 0
            evenSum = 0;
            oddSum = 0;
            do {
                //get Credit Card Number from user
                System.out.println("Please enter your 8-Digit Credit Card Number: ");
                cardNumber = keyboard.next(); //UserID no spaces
            }
            while (!cardNumber.matches(validCreditCard)); //Repeat Until Valid Pattern is entered

            for (int i = 0; i < cardNumber.length(); i++) {
                //Check if i is a digit
                cardNumberInt = Character.digit(cardNumber.charAt(i), 10);

                //Check if even or odd digit
                if (i % 2 == 0) {
                    evenDoubled = cardNumberInt * 2;

                    if (evenDoubled / 10 == 0) {
                        evenSum += evenDoubled;
                    } else {
                        int tempDigit = evenDoubled / 10; // first digit
                        evenSum += tempDigit;
                        tempDigit = evenDoubled % 10; // Your second digit
                        evenSum += tempDigit;
                    }
                } else {
                    oddSum += cardNumberInt;
                }
            }
            //Check last digit of sum is equal to zero
            checkSum = evenSum + oddSum;
            //checkSum % 10 is equal to 0, is that true or false
            System.out.println("The checksum is: " + checkSum);
            System.out.println(checkSum % 10 == 0 ? "The credit card number " + cardNumber + " is Valid" : "The credit card number " + cardNumber + " is invalid. Please Try again!");


            // Check another card loop
            do {
                //get user input as yes or no
                System.out.println("Would you like to check another credit card (yes/no): ");
                trueOrFalse = keyboard.next();
            }
            //Repeat until valid yes or no
            while (!trueOrFalse.toLowerCase().matches("yes|no"));
        }
        while (trueOrFalse.toLowerCase().matches("yes")); //repeat if true
        System.out.println("Have a nice day!");
        }
    }

