/**
 * @purpose "CheeseCake" Object class
 *
 * @author Trisha Ganesh
 * @version 6/20/2021
 *
 */

public class CheeseCakeV1
{
    private int myQuantity, myServings, myCreamCheese, myVanilla;
    private double mySugar;
    private String myFlavor;

    //constructor
    public CheeseCakeV1(String flavor, int quantity)
    {
        //code for constructor
        myFlavor = flavor;
        myQuantity = quantity;
    }

    public void calcTotalServings()
    {
       //code for method to calculate total servings
        myServings = myQuantity * 16;
    }

    public void calcCreamCheese()
    {
        //code for method to calculate cream cheese
        myCreamCheese = myQuantity * 32;
    }


    public void calcVanilla()
    {
        //code for method to calculate vanilla
        myVanilla = myQuantity * 1;
    }


    public void calcSugar()
    {
        //code for method to calculate sugar
        mySugar = (double) myQuantity * 1/3;
    }

    //code using getter method (quantity)
    public int getQuantity()
    {
        return myQuantity;
    }
    //code using getter method (flavor)
    public String getFlavor()
    {
        return myFlavor;
    }

    //code using getter method (sugar)
    public double getSugar()
    {
        return mySugar;
    }

    //code using getter method (cream cheese)
    public int getCreamCheese()
    {
        return myCreamCheese;
    }

    //code using getter method (Vanilla)

    public int getVanilla()
    {
        return myVanilla;
    }

    //code using getter method (Servings)
    public int getServings()
    {
        return myServings;
    }

    //toString() method which returns a String
    public String toString()
    {
        //printf to format data
        return String.format("%-9s %-10.1f", getFlavor(), getQuantity());
    }
}
