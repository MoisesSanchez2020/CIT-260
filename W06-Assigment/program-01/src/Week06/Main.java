package Week06;

import java.util.Scanner;

public class Main {

    /**
     * Moises Sanchez
     * W06 Assignment: Program 6.1
     * Write a short Java program that does the following:
     *
     * Tells the user what the program does.
     * Prompts the user to an investment amount, for example, 1000.
     * Gets the user's input and saves it. If the user's input is not a positive, non-zero value, display an error message, then loop back and prompt for a new value. Stay in this loop until you have a valid value.
     * Prompts the user to enter an annual interest rate between 0 and 100. For example, 9 would be 9%.
     * Gets the user's input and saves it. If the user's input is not positive or if it is greater than 100, display an error message, then loop back and prompt for a new value. Stay in this loop until you have a valid value.
     * Using a method that you have written, calculate and display the future value of the investment
     * for a period of 10 years. The formula for computing the future value of an investment is
     * futureValue = investmentAmount x (1 + monthlyInterestRate)numberOfYears * 12
     *
     * The method header for your method should look like this:
     *
     * public static double futureValue(double investmentAmount, double monthlyInterestRate, int years)
     *
     * Here is an example of what your program should look like when it runs (user input is in green):
     * @param args
     */

    public static void main(String[] args) {
        // get the user input
        Scanner input = new Scanner(System.in);
        // this are the variable
        double invested, interestRate;
        int years;


        //program output information
        System.out.println("\n\nGiven an investment amount and an annual interest rate, this program\n" +
                "will calculate the future value of the investment for a period of\n" + "ten years. ");


        // User input investment information
        System.out.print("\nEnter the a positive, non-zero value for the investment:");

        invested = input.nextDouble();
        // argument investment is greater than 0, check

        if (invested > 0) {
            System.out.print("Enter an annual interest rate, between 0 and 100:");
            interestRate = input.nextDouble();

            //check interest between 0 and 100
            if (interestRate >= 0 && interestRate <= 100) {
                System.out.print("\nYears\tFuture Value\n");
                //This calculate monthly compound interest gain each year
                for (years = 1; years <= 10; years++) {
                    double futureValue = FutureValue(invested, interestRate, years);
                    //display result
                    System.out.printf(years + "\t\t%.2f\n", futureValue);

                }
            }
            else {
                System.out.println("Interest rate must be between 0 and 100");
            }

        } else {
            System.out.println(" Investment must be greater than Zero");
        }
        System.out.print("\nGoodbye Classmate\n");
    }

       // this is  the math
         public static double FutureValue(double investment, double interest, int years){
         double Rate = (interest/12)*0.01;
         return investment * Math.pow((1+Rate),years*12);

    }

}
