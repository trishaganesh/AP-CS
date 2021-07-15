/**
 * This program uses Strings, characters, to prompt the user to understand what they would like to
 * purchase. We will then print their receipt
 *
 * @author Trisha Ganesh
 * @version 2/08/2021
 */

import java.util.Scanner;

public class BuyMovieTickets {

        public static void main(String[] args) {

                // Prompt user to enter the information
                Scanner in = new Scanner(System.in);
                System.out.println("Good evening!");
                System.out.print("Please enter your first name: ");
                String firstName = in.nextLine();
                System.out.print("Please enter your last name: ");
                String lastName = in.nextLine();
                System.out.print("Please enter today's date (mm/dd/yyyy): ");
                String date = in.nextLine();
                System.out.print("What movie would you like to see? ");
                String movie = in.nextLine();
                System.out.print("How many tickets? ");
                String tickets = in.nextLine();
                System.out.print("What is the ticket price? ");
                String price = in.nextLine();
                System.out.print("Please enter your debit card number (#####-###-####): ");
                String cardNumber = in.next();
                System.out.print("Please enter your pin (#####): ");
                String pin = in.next();

                String account = cardNumber;

                //parse tickets and price to int and double
                int numberOfTickets = Integer.parseInt(tickets);
                double priceOfTickets = Double.parseDouble(price);
                // calculate total amount
                double total = numberOfTickets * priceOfTickets;

                System.out.println("*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*");
                System.out.println("*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*");


                System.out.println("Your e-Receipt");
                System.out.println("\n");
                //date formation
                date = date;
                date = date.replace("/", "-");
                System.out.println(date);

                //name formation
                System.out.println(firstName.charAt(0) + " " + lastName);

                // calculate last 4 of card number
                int lastFourCardIndex = account.lastIndexOf('-');
                String lastFourCardNumber = account.substring(lastFourCardIndex);

                //Order Number
                System.out.println("Order number:" + lastName + lastFourCardNumber);

                //Account
                System.out.println("Account: " + "#####-###" + lastFourCardNumber);


                System.out.println("\n");
                System.out.println("Movie:" + movie);
                System.out.println("Number of tickets:"  + tickets);
                System.out.println("Ticket price:" + "$" + price);

                System.out.println("$" + total + " will be debited to your account.");
                System.out.println("Thank you. Enjoy your movie tonight.");
                System.out.println("*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*");
                System.out.println("*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*");
        }
}

