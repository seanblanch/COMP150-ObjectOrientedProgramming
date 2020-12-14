//Sean Blanchard
//10/16/18
//COMP 150
//Write a program that take a user ID as a String input from keyboard and steps through
//every character, If two digits exist output "User ID valid", If not it's invalid


import java.util.Scanner;

public class UserID {
    public static void main(String[] args){

        //Variables
        String userID;
        int digitCount = 0;

        //New Scanner
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the User ID: ");
        userID = keyboard.next();

        //check for each character one by one
        for (int i = 0; i < userID.length(); i++)
        {
            if (Character.isDigit(userID.charAt(i))){
                digitCount++;
            }
        }
        //Valid userID 2 digits only
        if(digitCount == 2) {
            System.out.println("User ID is Valid.");
        }
            else{
                System.out.println("User ID is Invalid.");
            }
        }
    }

