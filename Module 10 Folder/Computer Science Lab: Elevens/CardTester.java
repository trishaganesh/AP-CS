/**
 * This is a class that tests the Card class.
 *
 *  < Trisha Ganesh >
 *  < 7/10/2021 >
 */

public class CardTester {

public static void main(String[] args) {

        /* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */

        // Establish new cards
        Card aceOfHearts = new Card("ace", "hearts", 1);
        Card sixOfHearts = new Card("6", "hearts", 6);
        Card threeOfSpades = new Card("3", "spades", 3);

        // Test card 1 and methods
        System.out.println("**** Tests Card 1: ace of hearts ****");
        System.out.println("  rank: " + aceOfHearts.rank());
        System.out.println("  suit: " + aceOfHearts.suit());
        System.out.println("  pointValue: " + aceOfHearts.pointValue());
        System.out.println("  toString: " + aceOfHearts.toString());
        System.out.println();

        // Test card 2
        System.out.println("**** Tests Card 2: 10 of hearts ****");
        System.out.println("  rank: " + sixOfHearts.rank());
        System.out.println("  suit: " + sixOfHearts.suit());
        System.out.println("  pointValue: " + sixOfHearts.pointValue());
        System.out.println("  toString: " + sixOfHearts.toString());
        System.out.println();

        // Test card 3
        System.out.println("**** Tests Card 3: 4 of spades ****");
        System.out.println("  rank: " + threeOfSpades.rank());
        System.out.println("  suit: " + threeOfSpades.suit());
        System.out.println("  pointValue: " + threeOfSpades.pointValue());
        System.out.println("  toString: " + threeOfSpades.toString());
        System.out.println();

        // Test matches() method
        System.out.println("**** Testing Matches Between Card 1 and Card 2 ****");
        boolean equality = aceOfHearts.matches(threeOfSpades);
        System.out.println("Matching: " + equality);
    }
}
