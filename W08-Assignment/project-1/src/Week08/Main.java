package Week08;

public class Main {

    /**
     * Moises Sanchez
     * W08 Assignment: Program 8.1
     * Using the example of the Circle class from section 9.2 of the textbook design a Rectangle class. Create a UML class diagram that shows your design. Your UML class diagram must be submitted as part of this assignment. The preferred format for you class diagram is a .PDF file. This week's Powerpoint slides describe how to create a UML class digram. Your Rectangle class should contain the following:
     *
     * Two data fields named width and height, that specify the width and height of the rectangle. The default values for both width and height should be 1.
     * A no-arg constructor that creates a default rectangle object.
     * A parameterized constructor that creates a rectangle object with the specified height and width.
     * Getter and setter methods for height and width.
     * A method named getArea( ) that computes and returns the area of the rectangle.
     *  A method names getPerimeter( ) that computes and returns the perimeter of the rectangle.
     * Your file should have the proper file prologue (comments) and each method should have the proper method prologue (comments).
     * Then write a short Java program that implements your Rectangle class, and a main() method that does the following:
     *
     * Tells the user what the program does.
     * Creates two Rectangle objects, the first with a height of 4 and a width of 40, the second with a height of 3.5 and a width of 5.
     * Call the methods in your Rectangle class to output the width, height, area, and perimeter of each rectangle, with 2 digits after the decimal point.
     * Output a goodbye message.
     *
     *
     */


    static class Rectangle {
        public double height;
        public double width;

        Rectangle(double height, double width){
            this.height = height;
            this.width = width;
        }

        double getArea(){
            return height * width;
        }
        double getPerimeter(){
            return (height + width) *2;
        }
    }

    public static void main(String[] args) {
        System.out.println("----------------------------");
        System.out.println("-   This program creates two rectangle Objects and displays their width, height, \n" +
                "-   area and perimeter.                                                          ");
        System.out.println("----------------------------");
        System.out.println(); // for adding blank line

        //The objects use Arguments cause Rectangle accepted parameters in the constructor
        Rectangle rectangle1 = new Rectangle(4, 40);
        Rectangle rectangle2 = new Rectangle(3.5, 5);
        System.out.println();

        System.out.format("********************************************\n");
        System.out.format("|     RECTANGLE 1 %5s  %2s%n", "||", "   RECTANGLE 2    |");
        System.out.format("********************************************\n");
        System.out.format("| height = %8.2f  ||  height =  %7.2f | %n", rectangle1.height, rectangle2.height);
        System.out.format("| width = %9.2f  ||  width = %9.2f | %n", rectangle1.width, rectangle2.width);
        System.out.format("| area = %10.2f  ||  area = %10.2f | %n", rectangle1.getArea(), rectangle2.getArea());
        System.out.format("| perimeter = %.2f  ||  perimeter = %.2f | %n", rectangle1.getPerimeter(), rectangle2.getPerimeter());
        System.out.format("********************************************\n");

        System.out.format("Goodbye Classmate...");
    }
}
