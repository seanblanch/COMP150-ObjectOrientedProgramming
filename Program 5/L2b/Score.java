// Sean Blanchard
// 9/24/18
//Lab 5b COMP 150


import java.util.Scanner;

public class Score {
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the score you recieved on your test: ");
        int score = scan.nextInt();
        int userScore;
        userScore = score/10;
        char finalGrade;

        if (userScore > 10 || userScore < 0) {
            System.out.println("The user input is not in the proper range (0-100).");
        }

        switch (userScore) {
            case 10:
                finalGrade = 'A';
                break;
            case 9:
                finalGrade = 'A';
                break;
            case 8:
                finalGrade = 'B';
                break;
            case 7:
                finalGrade = 'C';
                break;
            case 6:
                finalGrade = 'D';
                break;
            default:
                finalGrade = 'F';
                break;



        }
        System.out.println("Your grade is " + finalGrade);

    }





}
