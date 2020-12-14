//Sean Blanchard
//10/3/18
//Ch 5 test question 2



import java.util.Scanner;

public class Bills {

    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);
        int accountNumber; //create int acct number
        int minutes; //create int minutes
        char service; // create char service
        String stringInput;
        double serviceChargeR = 10; //create a double to output chargeRegular
        double serviceChargeP = 25; //create a double to output ChargePremium


        System.out.println("Please enter account number: ");
        accountNumber = scan.nextInt(); 

        System.out.println("Please enter type of service: ");
        stringInput = scan.next();
        service = stringInput.charAt(0);

        System.out.println("Enter the number of minutes: ");
        minutes = scan.nextInt();

        switch (service) {
            case 'r':
                System.out.println("Enter account number: " + accountNumber);
                System.out.println("Enter service code: " + service);
                System.out.println("Enter number of minutes: " + minutes);
                System.out.println("$" + serviceChargeR);
                break;
            case 'p':
                System.out.println("Enter account number: " + accountNumber);
                System.out.println("Enter service code: " + service);
                System.out.println("Enter number of minutes: " + minutes);
                System.out.println("$" + serviceChargeP);

                break;
            default:
                System.out.println("Enter account number: " + accountNumber);
                System.out.println("Enter service code: " + service);
                System.out.println("Enter number of minutes: " + minutes);
                System.out.println("Invalid service code: " + service);
        }





    }

}
