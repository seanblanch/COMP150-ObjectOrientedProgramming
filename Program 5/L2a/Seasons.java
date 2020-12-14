//Sean Blanchard
//Lab 5a
//9/24/18


import java.util.Scanner;

public class Seasons {

    public static void main(String[] args) {
        // scanner to ask what the temperature is
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the temperature: ");
        int temperature = scan.nextInt(); // declare temperature as an int

        if (temperature >= 110 || temperature <= -5){
            System.out.println("Temperature entered is outside the valid range.");
        } else if (temperature >= 90){
            System.out.println("It is probably summer");
        } else if (temperature >= 70 && temperature <= 90){
            System.out.println("It is probably spring");
        } else if (temperature >= 50 && temperature <= 70){
            System.out.println("It is probably fall");
        } else{
            System.out.println("It is probably winter");
        }




    }

}
