//Sean Blanchard
//11/6/18
//Lab 8b WeekTemp



public class WeekTemp {
    private double[] temperatures;
    //private final int FREEZING;

    public WeekTemp(double[] temperatures) {

        super();

        this.temperatures = temperatures; // Set temperature to this.temperature

    }

    public double[] getTemperatures() {

        return temperatures;  //Returns the values of array

    }

    public void setTemperatures(double[] temperatures) {

        this.temperatures = temperatures; //Sets the temperatures to double

    }

    public String toString() {

        StringBuffer sb = new StringBuffer("");

        for (double temp : this.getTemperatures()) {

            sb.append(temp + ",");

        }

        return sb.toString();

    }

    public double[] getTemperaturesAbove100() {

        int count = 0;

        for (double temp : this.getTemperatures()) {

            if (temp > 100.0) { //If temperature is greater than 100

                System.out.println(temp);  //Print those temps

                count++; //Increase the count to go through array

            }

        }

        return temperatures;

    }



    public double getHighest() {

        double highest = this.getTemperatures()[0];

        for (double temp : this.getTemperatures()) {

            if (temp > highest) {  // if temperature is greater than the highest value

                highest = temp;  // Set the highest value equal to the temp

            }

        }

        return highest; //Return the highest double

    }



    public boolean equals(WeekTemp wt) {

        if (this.getTemperatures().length == wt.getTemperatures().length) {  //check if the values are equal

            for (int i = 0; i < this.getTemperatures().length; i++) {

                if (this.getTemperatures()[i] != wt.getTemperatures()[i]) {

                    return false;  // If the temperature of the arrays are not equal return false

                }

            }

        } else {

            return false;

        }

        return true;  // If the values are equal return true

    }

    public int howManyBelowFreezing() {

        int count = 0;

        for (double temp : this.getTemperatures()) {

            if (temp < 0.0) { //Check if value is less than 0

                count++; //Implement count to go through array

            }

        }

        return count;

    }

}


