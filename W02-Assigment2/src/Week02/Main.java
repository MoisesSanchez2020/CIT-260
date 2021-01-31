package Week02;

import java.util.Scanner;

class Temperature {
    /**
     *
     * Tells the user what the program does.
     * Prompts the user to enter a temperature in degrees Celsius.
     * Gets the user's input and saves it in a variable declared as a double.
     * Converts the Celsius temperature to a temperature in degrees Fahrenheit, using the formula tempf = (9/5) tempc+ 32
     * Outputs the Celsius temperature and the Fahrenheit temperature, with 2 digits after the decimal point.
     * Outputs a goodbye message
     *
     *
     * @param args
     */

    public static void main(String[] args) {
	displayPrompt();
	double celsius = UserCelsius();
	double fahrenheit = calculateFahrenheit(celsius);
	displayResultConversion(celsius, fahrenheit);
	finalEnd();
    }
    /**
     * this is a message to the user explain conversion
     */
     private static void displayPrompt(){
         System.out.println("This program converts a temperature in degrees Celsius into");
         System.out.println("a temperature in degrees Fahrenheit. Enter a temperature in");
         System.out.println("degrees Celsius:");

     }

     private static double UserCelsius(){
         Scanner input = new Scanner(System.in);
         double celsius = input.nextDouble();
         return celsius;
     }
      private static double calculateFahrenheit(double celsius){
         double fahrenheit = (9.0 / 5.0) * celsius + 32.0;
         return fahrenheit;
      }


    /**
     * Math - convert temperature values + display
     */
      private static void displayResultConversion(double celsius, double fahrenheit){
          String outPutcelsius = String.format("%.2f", celsius);
          String outPutfahrenheit = String.format("%.2f", fahrenheit);
          System.out.println("\n" + outPutcelsius  + " Celsius is equal "  +  outPutfahrenheit  + " degrees Fahrenheit .");
      }

         private static void finalEnd(){
          System.out.println("Great to have you here!... Goodbye");
}


}
