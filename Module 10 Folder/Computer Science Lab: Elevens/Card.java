/**
 * Card.java
 * Card represents a playing card.
 *
 *  < Trisha Ganesh >
 *  < 7/10/2021 >
 */

public class Card {

    private String suit;      // the suit of the card
    private String rank;      // the rank of the card
    private int pointValue;   // the point value of the card

    /**
     * Creates a new Card instance.
     *
     * @param cardRank  a String value
     *                  containing the rank of the card
     * @param cardSuit  a String value
     *                  containing the suit of the card
     * @param cardPointValue an int value
     *                  containing the point value of the card
     */
    public Card(String cardRank, String cardSuit, int cardPointValue)
    {
        rank = cardRank;
        suit = cardSuit;
        pointValue = cardPointValue;
    }

    //Accesses this Card's suit.
    //@return this Card's suit.
    public String suit()
    {
        return suit;
    }

    //Accesses this Card's rank.
    //@return this Card's rank.
    public String rank()
    {
        return rank;
    }

    //Accesses this Card's point value.
    // @return this Card's point value.
    public int pointValue()
    {
        return pointValue;
    }

    /** Compare this card with the argument.
     * @param otherCard the other card to compare to this
     * @return true if the rank, suit, and point value of this card
     *              are equal to those of the argument;
     *         false otherwise.
     */
    public boolean matches(Card otherCard)
    {
        if(rank == otherCard.rank())
        {
            if(suit == otherCard.suit())
            {
                if(pointValue == otherCard.pointValue())
                {
                    return true;
                }
                else
                {
                    return false;
                }
            }
            else
            {
                return false;
            }
        }
        else
        {
            return false;
        }
    }

     // Converts the rank, suit, and point value into a string in the format
    @Override
    public String toString()
    {
        String str = rank + " of " + suit + " (point value = " + pointValue + ")";
        return str;
    }
}
