//Sean Blanchard
//L2a
//9/12/2018
//SecondsToHoursMinutesSeconds

import java.util.Scanner;

public class SecondsToHoursMinutesSeconds {
    //Cases
    //1)When the number of minutes is greater than 60.
    //If user enters 2300, then
    //2300/60 = 38 (minutes)
    //2300%60 = 20 (seconds)
    //
    // 2)When the number of minutes is less than 60
    //(3600 seconds = 1 hour)
    //If user enters 4567,
    //4657/60 = 77 (minutes)
    //4567%37 = 37 (seconds)
    //77/60 = 1 (hour)
    //77%60 = 17 (minutes)
    // 4567 seconds = 1 hour 17 minutes 37 seconds.

    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);    // create scanner for imput of seconds

        int seconds;                                //declare seconds

        int minutes;                                //declare minutes

        int hours;                                  //declare hours

        boolean keepRunning = true;

        while(keepRunning) {


            System.out.print("Enter the number of seconds : ");    //create a line to ask how many seconds

            seconds = input.nextInt();                          //use the scanner

            if(seconds == 0) {

                keepRunning = false;

                System.out.println("Quitting now!");
            }

            hours = seconds / 3600;

            minutes = (seconds % 3600) / 60;

            int outputSeconds = (seconds % 3600) % 60;


            System.out.println(seconds + " seconds is " + hours + " hours, " + minutes + " minutes, and "
                    + outputSeconds + " seconds.");
        }

    }




}
