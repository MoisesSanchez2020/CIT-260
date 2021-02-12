package Week03;

import java.util.Scanner;

public class Main {
    /**
     * Write a short Java program that does the following:
     *
     * Tells the user what the program does.
     * Prompts the user to enter a value for today's day of the week (0 for Sunday, 1, for Monday, etc. ).
     * Gets the user's input and saves it. If the value is less than 0 or greater than 6, tell the user the input is invalid, and terminate the program.
     * Prompts the user to enter some number of days in the future. This can be any positive value.
     * Gets the user's input and saves it. If the value is negative, tell the user the input is invalid and terminate the program.
     * Calculates the day of the week for the future day.
     * Displays the day of the week for today and the day of the week for the future day.
     * Outputs a goodbye message.
     * @param args
     */

    /**
     * return
     * @param
     *
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        byte currentDate, daysintoFuture, futureDate;
        System.out.println("""
                Given today's day of the week and some number of days in the future
                this program will tell you the day of the week for the future day.
                """);
        System.out.print("Enter today's day of the week" + "\n" + "(0 for Sunday, 1 for Monday, etc):");
        currentDate= input.nextByte();

        /**
         * here user enter number input
         */
        if(currentDate > 0 && currentDate < 7 ){
            System.out.print("Enter the number of days in the future:");
            daysintoFuture= input.nextByte();
            if(daysintoFuture >0 ){
                futureDate = (byte)(currentDate + daysintoFuture);
                if(futureDate > 6 ){
                    futureDate %= 7;

                }

                /**
                 * This is the print for the user results
                 *
                 */

                switch (futureDate){
                    case 0: System.out.print("The future date is Sunday"+"\n");
                        break;
                    case 1: System.out.print("The future date is monday"+"\n");
                        break;
                    case 2: System.out.print("The future date is tuesday"+"\n");
                        break;
                    case 3: System.out.print("The future date is wednesday"+"\n");
                        break;
                    case 4: System.out.print("The future date is thursday"+"\n");
                        break;
                    case 5: System.out.print("The future date is friday"+"\n");
                        break;
                    case 6: System.out.print("The future date is saturday"+"\n");
                        break;
                }
                Goodbye();
            }

            /**
             * This is the invalid message entry
             */

            else{
                System.out.print(daysintoFuture + " is invalid. You must enter a positive number." + "\n");
                System.out.print("Goodbye, friend");
            }
        }

        //current date check negative
        else{
            System.out.print( currentDate + " is invalid must be between 0 and 6" + "\n");
            System.out.print("Goodbye, friend");
        }
    }
    public static void Goodbye() {
        System.out.println("Goodbye, friend");
    }


}



