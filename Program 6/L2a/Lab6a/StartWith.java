//Sean Blanchard
//10/16/18
//COMP 150
// Write a program that reads from the attached text file Logic.txt one word at a time.

package Lab6a;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class StartWith {
    public static void main(String[] args) throws IOException {
        String txtStorage;
        int withIs = 0;

        File inputFile = new File("C:\\Users\\Sean\\Desktop\\COMP150\\src\\Lab6a\\Logic.txt"); //Located outside SRC Folder
        Scanner file = new Scanner(inputFile);

        // Check hasNext() - If there is actually a word run loop
        do {
            //Read txt file
            txtStorage = file.next();
            //Check if word starts with is and increase the counter
            if (txtStorage.startsWith("is")) {
                withIs++;
            }
            System.out.print(txtStorage.replaceAll("[aeouAEIOU]", "~"));
        }
            while (file.hasNext()) ;
            //Output words with is
            System.out.println("\n" + withIs + " words start with is.");
        }
    }
