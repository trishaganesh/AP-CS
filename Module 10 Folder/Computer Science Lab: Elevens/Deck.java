import java.util.List;
import java.util.ArrayList;

/**
 * The Deck class represents a shuffled deck of cards.
 * It provides several operations including
 *      initialize, shuffle, deal, and check if empty.
 *
 *
 * < Trisha Ganesh >
 * < 7/10/2021 >
 */

public class Deck
{
    private List<Card> cards;    //contains all the cards in the deck

    private int size;   // size is the number of not-yet-dealt cards.
    // Cards are dealt from the top (highest index) down.
    // The next card to be dealt is at size - 1.


    //Creates a new Deck instance.
    //It pairs each element of ranks with each element of suits, and produces one of the corresponding card.
    public Deck(String[] ranks, String[] suits, int[] values)
    {
        cards = new ArrayList<>();
        for(int index = 0; index < suits.length; index++)
        {
            for(int v = 0; v < ranks.length; v++)
            {
                Card card = new Card(ranks[v],suits[index],values[v]);
                cards.add(card);
            }
        }
        size = cards.size();
        shuffle();
    }

    //Determines if this deck is empty (no undealt cards).
    //return true if this deck is empty, false otherwise.
    public boolean isEmpty()
    {
        //if statement to check if deck is empty
        if(size == 0 || cards.isEmpty())
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    //Accesses the number of undealt cards in this deck.
    // return the number of undealt cards in this deck.
    public int size()
    {
        return cards.size();
    }

    //Randomly permute the given collection of cards and reset the size to represent the entire deck.
    public void shuffle()
    {
        /* *** TO BE IMPLEMENTED IN ACTIVITY 4 *** */

    }


    //Deals a card from this deck.
    //return the card just dealt, or null if all the cards have been previously dealt.
    public Card deal()
    {
        size--;
        Card card = cards.get(size);
        return card;
    }

    //Generates and returns a string representation of this deck.
    //return a string representation of this deck
    @Override
    public String toString()
    {
        String rtn = "size = " + size + "\nUndealt cards: \n";
        //for loop
        for (int k = size - 1; k >= 0; k--) {
            rtn = rtn + cards.get(k);
            if (k != 0) {
                rtn = rtn + ", ";
            }
            if ((size - k) % 2 == 0) {
                // Inserting the carriage that returns for the entire deck is visible
                rtn = rtn + "\n";
            }
        }

        rtn = rtn + "\nDealt cards: \n";
        //for loop
        for (int k = cards.size() - 1; k >= size; k--) {
            rtn = rtn + cards.get(k);
            if (k != size) {
                rtn = rtn + ", ";
            }
            if ((k - cards.size()) % 2 == 0) {
                // Inserting the carriage that returns for the entire deck is visible
                rtn = rtn + "\n";
            }
        }

        rtn = rtn + "\n";
        return rtn;
    }
}
