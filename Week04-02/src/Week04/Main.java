package Week04;

import java.util.Scanner;


public class Main {


    /**
     * Moises Sanchez CIT 260
     * W04 Assignment: Program 4.2
     * Write a short Java program that does the following:
     *
     * Tells the user what the program does.
     * Prompts the user to enter their first and last name.
     * Gets the user's input and saves it as a String.
     * Prompts the user to enter the number of hours they worked this week.
     * Gets the user's input and saves it.
     * Prompts the user to enter their hourly wage.
     * Get's the user's input and saves it.
     * Calculates the state withholding tax (9%) and the federal withholding tax (20%).
     * Calculates the gross pay and the net pay after subtracting the withholding taxes.
     * Outputs a pay statement as shown in the example below.
     * Outputs a goodbye message.
     *
     *
     *
     *
     * @param args
     */

    public static void main(String[] args) {

        System.out.println("Given your name, hours worked, and hourly wage, this program calculates your \n" +
                "gross pay, state withholding tax, federal withholding tax, and your net pay.\n" +
                "It then displays your pay stub.");



        Scanner input = new Scanner(System.in);
        //Variables
        double timeHours, timeWage, timeGross, stateTax, FederalTax, netPay;
        double stateTaxPer = 0.09;
        double federalTaxPer = 0.20;

        String name;
        String statement1 = "Pay Stub for: ";
        String statement2 = "Hours Worked: ";
        String statement3 = "Hourly Wage: ";
        String statement4 = "Gross pay: $";
        String statement5 = "State Tax Withheld: $";
        String statement6 = "Federal Tax Withheld: $";
        String statement7 = "Net pay: $";




        System.out.print("Enter your first and last name: ");
        name = input.nextLine();

        System.out.print("Enter the hours you worked this week: ");
        timeWage = input.nextDouble();

        System.out.print("Enter your hourly wage: ");
        timeHours = input.nextDouble();

        timeGross = timeHours * timeWage;

        stateTax = timeGross * stateTaxPer;

        FederalTax = timeGross * federalTaxPer;

        netPay = timeGross - stateTax - FederalTax;


       System.out.printf("%s%s %n%s%.2f %n%s%.2f %n%s%.2f %n%s%.2f %n%s%.2f %n%s%.2f",statement1, name,statement2, timeHours,statement3, timeWage,statement4, timeGross,statement5, stateTax,statement6, FederalTax,statement7, netPay);

        System.out.print("\n Goodbye Classmate");
    }

}

