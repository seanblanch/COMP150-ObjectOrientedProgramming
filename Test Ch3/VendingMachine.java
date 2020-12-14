//Sean Blanchard
//9/19/18
//Chaper 3 test


import java.text.DecimalFormat;
import java.util.Scanner;

public class VendingMachine {

    public static void main(String[] args){

        double Half_Dollar = 0.50;
        double quarter = 0.25;
        double dime = 0.10;
        double nickel = 0.05;
        double penny = 0.01;
        int oneBill = 1;
        int fiveBill = 5;
        int tenBill = 10;
        int twentyBill = 20;

        double cost;
        double halfDollarReturn;
        double quarterReturn;
        double dimeReturn;
        double nickelReturn;
        double pennyReturn;
        int bill;
        double change;

        double runningChange;



        Scanner scan = new Scanner(System.in);
        DecimalFormat twoNumbers = new DecimalFormat("0.00");

        System.out.println("Enter item price as double (i.e 1.25): ");
        cost = scan.nextDouble();

        System.out.println("Enter bill value as int (i.e 1 for $1 bill, 5 for $5 bill, etc.): ");
        bill = scan.nextInt();

        change = bill - cost;

        System.out.println("For the item price of " + twoNumbers.format(cost) + " the change due out of " + twoNumbers.format(bill) + " is " + twoNumbers.format(change) + ":" );

        halfDollarReturn = (int) (change / Half_Dollar);
        quarterReturn = (int) (change / quarter);
        dimeReturn = (int) (change / dime);
        nickelReturn = (int) (change / nickel);
        pennyReturn = (int) (change / penny);



        System.out.print(halfDollarReturn + " half dollar coins; " + quarterReturn + " quarter coins; ");
        System.out.print(dimeReturn + " dime coins; " + nickelReturn + " nickel coins; " + pennyReturn + " penny coins;");







    }



}
