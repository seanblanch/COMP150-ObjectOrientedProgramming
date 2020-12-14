//Sean Blanchard
//9/17/2018
//Lab 3a


import java.sql.SQLOutput;

public class FunWithNames {

        public static void main(String[] args) {
            //a
            String myFullName = "Sean Blanchard"; // This is my name
            String myFirstName,myLastName;

            //b
            System.out.println("My name in all upper case: " + myFullName.toUpperCase()); // Name in all upper case

            System.out.println("MY name in all lower case: " + myFullName.toLowerCase()); // name in all lower case

            System.out.println("My name: " + myFullName); //My full name in original String
            //c
            System.out.println("My name is " + myFullName + "and it is " + myFullName.length() + " characters long."); // display length of name
            //d + e
            myFirstName = myFullName.substring(0, myFullName.indexOf(' '));

            myLastName = myFullName.substring(myFullName.indexOf(' ')+1);

            System.out.println(myFirstName);

            System.out.println(myLastName);
            //f
            System.out.println(myLastName + ", " + myFirstName); //Display last name followed by first name
            //g

            String friendsFullName = "Ferid None Ruano"; //This is my friends name
            //h
            System.out.println("My friends name is " + friendsFullName + " and it is " + myFullName.length() + " characters long."); //display length of friends name
            //i
            char friendsFirstNameInitial = friendsFullName.charAt(0);
            //j
            char friendsLastNameInitial = friendsFullName.charAt(friendsFullName.lastIndexOf(' ')+1);
            char myFirstNameInitial = myFirstName.charAt(0);
            char myLastNameInitial = myLastName.charAt(0);
            //k
            System.out.println(myFirstNameInitial + " " + myLastNameInitial + " and " + friendsFirstNameInitial + " " + friendsLastNameInitial + " are friends.");







        }




}

