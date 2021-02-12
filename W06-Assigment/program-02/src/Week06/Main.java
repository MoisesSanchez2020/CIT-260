package Week06;

public class Main {

    /**
     * Moises Sanchez
     * W06 Assignment: Program 6.2
     * Write a short Java program that contains the following two methods:
     *
     * public static double celsiusToFahrenheit(double tempCelsius)
     *
     * public static double fahrenheitToCelsius(double tempFahrenheit)
     *
     * Your program should
     *
     * Tell the user what the program does.
     * Invoke the above two methods to compute and display the table shown below.
     * Output a goodbye message.
     *
     * @param args
     */


    public static void main(String[] args) {
	System.out.println("\n\n\t\tTable of comparison, with Celsius & Fahrenheit\n\n");
	System.out.println("\tCelsius\t\tFahrenheit\t|\tFahrenheit\t\tCelsius\n" + "\t-----------------------------------------------------");

	// temp starting point
    // variables
    double celsius = 40;
    double fahrenheit = 120;
    // count down celsius by Fahrenheit by 10
	for(int i = 1; i <= 10;celsius--, fahrenheit -=10, i++){
            System.out.printf("\t%.1f\t\t%.2f\t\t%s\t%.1f\t\t\t%.2f\n",celsius,celsiusToFahrenheit(celsius),"|",fahrenheit,fahrenheitToCelsius(fahrenheit));
        }
	        System.out.print("\n\t\tGoodbye Classmate");
    }

    /**
     * this the the math conversation of the program
     *
     */

    // Convert Fahrenheit to celsius

    private static double fahrenheitToCelsius(double tempFahrenheit){
        return (5.0 / 9)* (tempFahrenheit -32);
    }

   // Convert  celsius to Fahrenheit
     private static double celsiusToFahrenheit(double tempCelsius){
        return (9.0 / 5.0)* tempCelsius +32;
     }






}
