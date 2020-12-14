//Sean Blanchard
//11/6/18
//Lab 8b Test

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Test {


     String courseName;
     List<Integer> list = new ArrayList<>();

    public Test(String courseName) {
        this.courseName = courseName;
    }

    public double calcAverage(int... grades){
        int n = grades.length; //find the length of grades array
        int sumOfNumbers = 0; //start sum of numbers

        for(int i : grades){
            sumOfNumbers = sumOfNumbers + i; //Create counter
        }
        System.out.println(toString());
        return (sumOfNumbers/n); //Find the average
    }


    public String toString(){

        return "Average grade is: ";
    }
}


