package Week07;

import java.util.Scanner;

public class Main {

    /**
     * Moises Sanchez
     * W07 Assignment: Program 7.2
     * Now write a main( ) method that does the following:
     * Tells the use what the program does.
     * Prompts the user to enter five numbers.
     * Saves the user's input in an array of doubles.
     * Uses the methods above to compute the mean and the standard deviation for the numbers in the array.
     * Displays the mean and the standard deviation with 2 digits after the decimal point.
     * Displays a goodbye message.
     * Your file should have the proper file prologue, and each method should have the proper method prologue.
     *
     *
     * @param args
     */

    public static void main(String[] args) {
	// Program information
      System.out.println("This program computes the mean and the standard deviation for a set of f numbers.");
      //user input
      Scanner input = new Scanner(System.in);

      //this are the variables
        double[] x = new double[5];

        double mean = 0;
        double deviation = 0;

        //methods
        Mean(x);
        Deviation(x,mean);

        // gather input and place into array
        for(int i = 0; i < 5; i++){
            System.out.print("Please enter a number:");
            x[i] = input.nextDouble();
            //call out methods and push array
            mean = Mean(x);
            deviation = Deviation(x,mean);
        }
        //here will display the result from mean & deviation
        //result from Mean(x)
        System.out.printf("\nThe mean of this set of numbers is " +"%.2f%n",mean);
        //result from Deviation(x)
        System.out.printf("The standard deviation is " +"%.2f%n",deviation);
        System.out.print("Goodbye Classmates");
    }


    /**
     *
     * This will find the average of array of numbers
     *
     *
     */

    private static double Mean(double[] x){
        double total = 0;
        //add the array of numbers
        for(double i: x){
            total += i;
        }
        //divide by number of number int the array
        double mean = total / x.length;
        return mean;

    }

    /**
     *
     * this will find the simple deviation of the array
     *
     */


      private static double Deviation(double[] x, double mean){
          double deviation;
          double devStp1 = 0;
          //subtract the number within the array to the mean
          //then multiply it to itself
          for(double i: x){
              devStp1 +=(i -mean)*(i -mean);
          }
          //divide the devStp1 by the number of numbers in the array -1
          double devStp2 = devStp1 / (x.length -1);
          deviation = Math.pow(devStp2,0.5);
          return deviation;
      }


}
