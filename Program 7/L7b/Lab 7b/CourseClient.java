//Sean Blanchard
//10/23/18
//Lab 7b Course Client


import java.util.Scanner;

public class CourseClient {
    public static void main(String[] args){
        //Scanner
        Scanner keyboard = new Scanner(System.in);

        //Objects
        Course course = new Course("Computer Science", 4, "CS4");
        Course userCourse = new Course(); // New Object, call default constructor
        System.out.println(course);

        //Set Instance Variable userCourse Object
        System.out.println("Enter a Course Code: (IE: CS1, CS2, etc.) ");
        userCourse.setCode(keyboard.next());
        System.out.println("Enter course Credit: ");
        keyboard.nextLine(); //Scanner Bug Fix
        userCourse.setNumberOfCredits(keyboard.nextInt());
        System.out.println("Enter a Course Description: ");
        keyboard.nextLine();
        userCourse.setDescription(keyboard.nextLine());

        //Check for duplicate object data
        System.out.println(!userCourse.equals(course) ? userCourse.toString() : "Enter userCourse is equal to present Course object." );


    }
}
