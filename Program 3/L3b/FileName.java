// Sean Blanchard
// COMP 150
//9/18/18
//Lab 3b


import java.util.Scanner;

public class FileName {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Write your file name, including extension : ");
        String input = scan.nextLine();
        String fileExtension = input.substring(input.lastIndexOf('.') + 1);
        System.out.println(fileExtension.toLowerCase());
        System.out.println(fileExtension.toUpperCase());
        System.out.println(input);


    }

}
