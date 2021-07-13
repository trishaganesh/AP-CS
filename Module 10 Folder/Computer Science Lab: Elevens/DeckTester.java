/**
 * This is a class that tests the Deck class.
 *
 *  < Trisha Ganesh >
 *  < 7/10/2021 >
 */

public class DeckTester
{
    public static void main(String[] args)
    {
        /* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
        String[] ranks = {"ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "jack"};
        String[] suits = {"hearts", "spades"};
        int[] pointValues = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        Deck myDeck = new Deck(ranks, suits, pointValues);

        System.out.println("**** Original Deck Methods ****");
        System.out.println("  toString: \n" + myDeck.toString());
        System.out.println("  isEmpty: " + myDeck.isEmpty());
        System.out.println("  size: " + myDeck.size());
        System.out.println();
        System.out.println();
        System.out.println("**** Deal a Card ****");
        System.out.println("  deal: " + myDeck.deal());
        System.out.println();
        System.out.println();
        System.out.println("**** Deck Methods After 1 Card Dealt ****");
        System.out.println("  toString: \n" + myDeck.toString());
        System.out.println("  isEmpty: " + myDeck.isEmpty());
        System.out.println("  size: " + myDeck.size());
        System.out.println();
        System.out.println();

        /* *** TO BE IMPLEMENTED IN ACTIVITY 4 *** */

    }
}
