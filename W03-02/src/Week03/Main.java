package Week03;
import java.util.Scanner;
public class Main {
    /**
     * Write a short Java program that does the following:
     * 1) Tells the user what the program does.
     * 2) Prompts the user to enter a year.
     * 3) Gets the user's input and saves it.
     * 4) Prompts the user to enter a value for the month(1 = Jan, 2 = Feb, etc).
     * 5) Gets the user's input and saves it. If the value is is not between 1
     *    and 12 inclusive, tell the user and terminate the program.
     * 6) Calculates the number of days in that month. Your program should
     *    correctly handle leap years (see listing 3.7 in the textbook).
     * 7) Displays the number of days in that month.
     * 8) Outputs a goodbye message.
     * @param args
     */

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Given a year and a month in that year, this program will tell you" + "\n" + "the number of days in that month.");
        System.out.print("Enter the year: ");
        int year = input.nextInt();
        System.out.print("Enter the month: ");
        byte month = input.nextByte();

/**
 * this is the part of the program when we do the calculation of the years and month
 */



        if( month >0 && month <13) {

            if (month == 2) {
                int days;
                if (year % 4 == 0) {
                    if (year % 100 == 0) {
                        if (year % 400 == 0) {
                            days = 29;
                        } else {
                            days = 28;
                        }
                    } else {
                        days = 29;}
                } else{
                    days = 28;
                }
                /**
                 * this will print the user info
                 */
                System.out.println("february " + year + " has " + days + " days");
                }
            /**
             * here is where the months and days are implement
             */
            else
                {
                switch(month){
                    case 1:
                        System.out.println("January " + year +" has 31 days");
                        break;
                    case 3:
                        System.out.println("March " + year +" has 31 days");
                        break;
                    case 4:
                        System.out.println("April " + year +" has 30 days");
                        break;
                    case 5:
                        System.out.println("May " + year +" has 31 days");
                        break;
                    case 6:
                        System.out.println("June " + year +" has 30 days");
                        break;
                    case 7:
                        System.out.println("July " + year +" has 31 days");
                        break;
                    case 8:
                        System.out.println("August " + year +" has 31 days");
                        break;
                    case 9:
                        System.out.println("September " + year +" has 30 days");
                        break;
                    case 10:
                        System.out.println("October " + year +" has 31 days");
                        break;
                    case 11:
                        System.out.println("November " + year +" has 30 days");
                        break;
                    case 12:
                        System.out.println("December " + year +" has 31 days");
                        break;
                }
            }
            /**
             * this is for data invalid
             */
        }else{
            System.out.println(month + " is invalid. Month values must be between between 1 and 12, inclusive.");
        }
        /**
         * This end the code
         */
        System.out.print("Goodbye, friend");


    }
}
