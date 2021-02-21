package Week07;

import java.util.Scanner;

public class Main {
    /**
     * Moises Sanchez
     * W07 Assignment: Program 7.1
     * Write a method that calculates and returns the average value for an array of doubles. The method header will look like the following:
     *
     * public static double average(double[ ] array)
     *
     * Then write a main( ) method that does the following:
     *
     * Tells the user what the program does.
     * Prompts the user to enter 5 double values.
     * Stores these values in an array.
     * Calls the average method you wrote to calculate and return the average value of the numbers in the array.
     * Displays the average value, with two digits after the decimal point.
     * Displays a goodbye message.
     * @param args
     */

    public static void main(String[] args) {
        // Program information to user
        System.out.println("This program calculates the average of five numbers.");
        //this collect date input from user
        Scanner input = new Scanner(System.in);

        //this are the variables
        double[] numbers = new double[5];
        double average = 0;

        //this is a CALLBACK METHOD
        Average(numbers);

        for (int i = 0; i < 5; i++) {
            System.out.print("Please enter a number:");
            numbers[i] = input.nextDouble();
            average = Average(numbers);
        }

        System.out.printf("The average of these five numbers is " +"%.2f%n",average);
        System.out.println("Goodbye classmates");

    }






        private static double Average(double[]numbers){
        //add input user array values
        double total = 0;
        for (double i: numbers){
            total += i;

        }
        //math divide by length in array
        double average = total / numbers.length;
        // result of return
        return average;
    }
}
