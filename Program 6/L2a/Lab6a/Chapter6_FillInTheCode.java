package Lab6a; /**
 * Created by atb on 10/2/16.
 */
//Sean Blanchard
//10/10/18
//Lab 6a


import java.util.*;
public class Chapter6_FillInTheCode {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        // exercise 21
        // write a while loop that generates random integers between 3 and 7 until a 5 is generated
        // and prints them all out, excluding 5
        Random random = new Random();
        int i = 0;

        // your code goes here

        while (i != 5) {
            i = random.nextInt(5) + 3;
            if (i != 5) {
                System.out.println("The random integer is: " + i);
            }
        }


        // exercise 22
        // write a while loop that takes an integer input from the user, then prompts for additional integers
        // and prints all integers that are greater than or equal to the original input until the user enters 20,
        // which is not printed
        System.out.println("Enter a starting integer > ");
        int start = keyboard.nextInt(); // prime read


        // your code goes here
        int newInt = 0;

        while (newInt != 20) {
            System.out.println("Enter a new Integer > ");
            newInt = keyboard.nextInt();

            if (newInt > start && newInt != 20) {
                System.out.println("The integer entered " + newInt + " is greater than first integer.");
                System.out.println(start + " " +  newInt);
            } else if (newInt == 20) {
                System.out.println("The integer entered " + newInt + " is 20.");
            } else {
                System.out.println("Enter an integer greater than or equal to the first");
            }
        }


        // exercise 23
        // write a while loop that takes integer values as input from the user and finds the sum of those
        // integers until the user types in the value -1 which is not added
        System.out.println("Enter an integer value. enter -1 to stop >");
        int value = keyboard.nextInt(); // prime read
        int addInt = keyboard.nextInt(); //new int

        // your code goes here

                while (addInt != -1) {
                    System.out.println("Enter another integer: ");
                    System.out.println(value += addInt);
                    addInt = keyboard.nextInt();
                }
                //Add integers
                if (addInt != -1) {
                    value += addInt;
                    System.out.println("The new sum is: " + value);
                }



        // exercise 25
        // write a while loop that takes words as input from the user and concatenates them until
        // the user types in the word "end" which is not concatenated
        String sentence = "";
        System.out.println("Enter a word to be added to a sentence");
        String word = keyboard.next(); // prime read

        // your code goes here
        while (!word.toLowerCase().matches("end")) {
            sentence += word + " ";
            System.out.println(sentence);
            word = keyboard.next();
        }
    }
}






