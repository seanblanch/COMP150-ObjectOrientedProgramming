//Sean Blanchard
//10/17/18
//COMP 150 Test CH6
//Gift certificate


import java.io.File;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class GiftC {

    public static void main(String [] args) throws IOException {
        //variables
        double money = 50.00;
        double moneyOneHundred = 100.00;
        double moneyOneHundredFifty = 150.00;
        int payment;
        double cart;
        boolean forever = true;
        String trueOrFalse;
        double itemCost;

        //scanner
        Scanner scan = new Scanner(System.in);
        File prices = new File("/Users/sean.blanchard394/Desktop/COMP 150/src/Test ch6/prices.txt");
        Scanner file = new Scanner(prices);

        System.out.println("CONGRATULATIONS, you won $50.00");
        System.out.println("Let's start your SHOPPING SPREE; you can get up to 5 items.");

        while(forever) {
            Random random = new Random();
            //Try to find a random between 50.00, 100.00, and 150.00
            System.out.println("CONGRATULATIONS, you won " + random.nextDouble());
            System.out.println("Let's start your SHOPPING SPREE; you can get up to 5 items.");


                do {
                    //Find the price of the next item using the file scanner
                    System.out.println("The Price of the next item is: " + file.nextInt());
                    //output how much money you have
                    System.out.println("You have " + money + "available");

                    if (money < file.nextInt()) {
                        //if money is less then the int from scanner, you do not have enought money
                        System.out.println("You do not have enough money to buy this item.");
                    } else {
                        //if you do have enough money, would you like to buy these items
                        System.out.println("Would you like to buy the item? (Yes/No)");
                        //scan the user input
                        trueOrFalse = scan.next();
                        //if input matches yes, subtract money from item cost
                        if (trueOrFalse.toLowerCase().matches("yes")){
                            money = money - file.nextInt();

                            System.out.println("OK - adding the mystery item " + prices + " to your basket");

                            }
                        }


                }
                //check if file has a next line
                    while(file.hasNextLine());

            }

        }


        }



