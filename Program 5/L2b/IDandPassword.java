//Sean Blanchard
//9/24/18
//Lab 5b


import java.util.Scanner;

public class IDandPassword {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your user ID: ");
        String userID = scan.nextLine();
        System.out.println("Please enter your user Password: ");
        String password = scan.nextLine();
        String rightID = new String("admin");
        String rightPassword = new String("open");

        if (userID.equals(rightID) && password.equals(rightPassword)) {
            System.out.println("Welcome");
        } else if (userID.equals(rightID)){
            System.out.println("Wrong password");
        } else if (password.equals(rightPassword)){
            System.out.println("Wrong user ID");
        } else {
            System.out.println("Sorry, wrong ID and password");
        }
   }
}




