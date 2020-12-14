//Sean Blanchard
//11/6/18
//Lab 8b Client that handles daily temp for a week




public class WeekTempClient {
    public static void main(String args[]){

        double arr1[]={-7.8,-2,-28.5,1.4,8.2,112.0,-12.3,100.2}; //First Array of temperatures

        double arr2[]={-7,-3.3,2.2,87.4,102.4,105.6,112.6}; // Second Array of temperatures

        double temp[]={0.0};

        WeekTemp wk1 = new WeekTemp(arr1); //wk1 is first week temperature

        WeekTemp wk2 = new WeekTemp(arr2); //wk2 is second week temperature

        wk2.setTemperatures(arr2); //Set temperatures to array 2

        System.out.println("Array 1 values : "+wk1.toString());  //Print array 1 values

        System.out.println("Array 2 values : "+wk2.toString());  //Print array 2 values

        System.out.println("Array 1 equals Array 2 : "+wk1.equals(wk2));  //Print if the arrays are equal to eachother

        System.out.println("Array 1 has this many below zero temp : "+wk1.howManyBelowFreezing()); //Print how many values in Array one is below 0

        System.out.println("Array 2 has this many below zero temp : " + wk2.howManyBelowFreezing());  // Print how many values in Array two is below 0

        System.out.println("Array 1 Temperatures above 100 degrees : ");

        printArray(wk1.getTemperaturesAbove100()); //Print array values that are greater than 100

        System.out.println("\nArray 2 Temperatures above 100 degrees : ");

        printArray(wk2.getTemperaturesAbove100());  //Print array values that are greater than 100

        System.out.println("\nArray 1 highest : "+wk1.getHighest());  //Get the highest value in array

        System.out.println("Array 2 highest : "+wk2.getHighest());  //Get the highest value in array

        System.out.println("Obejct 2 values are :");

        printArray(wk2.getTemperatures());  //Print array 2

    }

    public static void printArray(double arr[]){

        for(double temp:arr){

            System.out.print(temp+" ");

        }

    }

}


