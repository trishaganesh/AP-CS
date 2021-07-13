
/**
 * A class to run the Magpie class.

 *
 * @author Trisha Ganesh
 * @version 6/19/2021
 */

import java.util.Scanner;

public class MagpieRunner2 {
    public static void main(String[] args) {

        //Create a Magpie, give it user input, and print its replies.
        Magpie2 maggie = new Magpie2();
        System.out.println (maggie.getGreeting());
        Scanner in = new Scanner (System.in);
        // trim and convert user input to lowercase
        String statement = in.nextLine().trim().toLowerCase();

        while (!statement.equals("Bye")) {
            System.out.println (maggie.getResponse(statement));
            // trim and convert user input to lowercase
            statement = in.nextLine().trim().toLowerCase();
        }
    }
}
