//Sean Blanchard
//10/16/18
//COMP 150
// Write a program that takes website names as keyboard input until the user types stop

package Lab6a;

import java.util.Scanner;

public class WebsiteNames {
    public static void main(String[] args){
        //Variable
        String webName;
        boolean loop = true;

        int commercialWebsitecount = 0;

        //Scanner
        Scanner keyboard = new Scanner(System.in);

        //While loop is true, Run this code inside
        while (loop)
        {
            System.out.println("Enter a website: ");
                    webName = keyboard.next();

            //Check for end word "Stop"
            if(webName.toLowerCase().matches("stop"))
            {
                loop = false;
            }
            if (webName.toLowerCase().endsWith(".com"))
            {
                commercialWebsitecount++;
            }
        }
        System.out.println("The total number of commerical websites is: " + commercialWebsitecount);
    }
}
