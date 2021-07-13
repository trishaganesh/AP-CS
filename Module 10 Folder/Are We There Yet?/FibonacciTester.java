/**
 * The purpose of this program to utilize the concept of recursion to convert a (number value) to
 * the Fibonacci value, based on the number the user enters.
 *
 * @author Trisha Ganesh
 * @version 07/09/2021
 */

import java.util.Scanner;

public class FibonacciTester
{
    //the tester class of the fibonacci method to get the user's input on (number).
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Fibonacci nValueConversion = new Fibonacci();
        int selection = 0;
        int nValueNumber = 0;

        while (selection != 2)
        {
            System.out.print("What number value for n would you like for the Fibonacci number? (or would " +
                    "you prefer to quit " +
                    "the program?) ");
            System.out.println();
            System.out.println("               [1] Enter value for n");
            System.out.println("               [2] Quit Program");
            System.out.print("Please enter your choice based on the number above: ");
            selection = input.nextInt();
            System.out.println();

            if (selection <= 0 || selection > 2) {
                System.out.println("|----------------------------------------|");
                System.out.println("|    Please enter an option of 1 or 2.    ");
                System.out.println("|----------------------------------------|");
            }
            else if (selection == 1) {
                System.out.print("Please enter the number value for n " +
                        " that you would like for the Fibonacci number: ");
                nValueNumber = input.nextInt();

            } else if (selection == 2) {
                System.out.println("|-----------------------------------------------------------------------|");
                System.out.println("   Program ended. Thank you for using the Fibonacci number Generator!   ");
                System.out.println("|-----------------------------------------------------------------------|");
            }


            if (selection == 1) {
                if (nValueNumber >= 0) {
                    System.out.println("|-----------------------------------------------------------------|");
                    // Call fibonacciValue with n (number) value
                    System.out.println("     The fibonacci number of value n = " + nValueNumber + " is " +
                            nValueConversion.fibonacciValue(nValueNumber));
                    System.out.println("|-----------------------------------------------------------------|");
                    System.out.println();
                } else if (nValueNumber < 0) {
                    System.out.println("|-----------------------------------------------------------------|");
                    System.out.println("       An invalid n value has been entered. Please try again.");
                    System.out.println("|-----------------------------------------------------------------|");
                    return;
                }
            }
        }
    }
}
