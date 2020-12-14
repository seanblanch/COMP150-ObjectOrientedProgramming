//Sean Blanchard
// 9/19/18
//Test Ch 3

import java.util.Scanner;

import static java.lang.Character.isLetter;

public class LetterDetection {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a single character. ");
        char input = scan.next().charAt(0);
        boolean character = Character.isLetter(input);
        System.out.println("The character '" + input + "' is a letter : " + character);





    }


}
