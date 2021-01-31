package Week04;

import java.util.Scanner;



public class Main {

    /**
     * Moises Sanchez CIT 260
     * W04 Assignment: Program 4.1
     * Write a short Java program that does the following:
     *
     * Tells the user what the program does.
     * Prompts the user to enter a single hexadecimal digit.
     * Gets the user's input and saves it. If the value is not a valid hexadecimal digit tell the user and terminate the program.
     * Converts the hexadecimal digit into a four digit binary number. You may not use any of the conversion methods built into Java, such as toBinaryString( ), to do this.
     * Outputs the four digit binary number, including any leading zeros.
     * Outputs a goodbye message.
     *
     *
     *
     * @param args
     */







    public static void main(String[] args) {

        String hexNumber;
        System.out.println("This program converts a hexadecimal digit into a four digit binary number.");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a hexadecimal number: ");
        hexNumber = input.nextLine();
        if(hexNumber.length() != 1){
            System.out.println("You must enter exactly one character.");
        }

        char hexCh = Character.toUpperCase(hexNumber.charAt(0));
        if('A' <= hexCh && hexCh <= 'F' || Character.isDigit(hexCh)){
            switch (hexCh){
                case 0:
                    System.out.println("The binary value is 0000");
                    break;
                case 1:
                    System.out.println("The binary value is 0001");
                    break;
                case 2:
                    System.out.println("The binary value is 0010");
                    break;
                case 3:
                    System.out.println("The binary value is 0011");
                    break;
                case 4:
                    System.out.println("The binary value is 0100");
                    break;
                case 5:
                    System.out.println("The binary value is 0101");
                    break;
                case 6:
                    System.out.println("The binary value is 0110");
                    break;
                case 7:
                    System.out.println("The binary value is 0111");
                    break;
                case 8:
                    System.out.println("The binary value is 1000");
                    break;
                case 9:
                    System.out.println("The binary value is 1001");
                    break;
                case 'A':
                    System.out.println("The binary value is 1010");
                    break;
                case 'B':
                    System.out.println("The binary value is 1011");
                    break;
                case 'C':
                    System.out.println("The binary value is 1100");
                    break;
                case 'D':
                    System.out.println("The binary value is 1101");
                    break;
                case 'E':
                    System.out.println("The binary value is 1110");
                    break;
                case 'F':
                    System.out.println("The binary value is 1111");
                    break;
            }

        }else{
            System.out.print(hexCh + " is not a valid hexadecimal digit");
        }
        System.out.print("Goodbye Classmate");

    }


}
