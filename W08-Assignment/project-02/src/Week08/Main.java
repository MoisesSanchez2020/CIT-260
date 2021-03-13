package Week08;
import java.util.Date;
public class Main {

    /**
     * Moises Sanchez
     * W08 Assignment: Program 8.2
     * Wrote a short Java program that does the following:
     *
     * Tells the user what the program does.
     * Using the Date class (described in section 9.6.1 of the textbook) Create a Date object and set it's elapsed time to 10000, 100000, 1000000, 10000000, 100000000, 1000000000, and 10000000000 and displays the data and time using the toString( ) method, respectively.
     * Display a goodbye message.
     *
     *
     * @param args
     */

    public static void main(String[] args) {
        Date date = new Date(100000L);
        Date date1= new Date(1000000L);
        Date date2= new Date(10000000L);
        Date date3= new Date(100000000L);
        Date date4= new Date(1000000000L);
        Date date5= new Date(10000000000L);
        Date date6= new Date(100000000000L);

        //program info
        System.out.println("This program uses the Date class to display a set of dates and times.\n");
        //variables outputs
        System.out.print(date.getTime() + " *** ");
        System.out.println(date.toString());

        System.out.print(date1.getTime() + " *** ");
        System.out.println(date1.toString());

        System.out.print(date2.getTime() + " *** ");
        System.out.println(date2.toString());

        System.out.print(date3.getTime() + " *** ");
        System.out.println(date3.toString());

        System.out.print(date4.getTime() + " *** ");
        System.out.println(date4.toString());

        System.out.print(date5.getTime() + " *** ");
        System.out.println(date5.toString());

        System.out.print(date6.getTime() + " *** ");
        System.out.println(date6.toString());



        System.out.print("\nGoodbye Classmate...");
    }
}
