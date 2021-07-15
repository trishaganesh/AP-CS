/**
 * The Currency class converts an amount of money from a specific
 * country into the equivalent currency of another country given
 * the current exchange rate.
 *
 * Trisha Ganesh
 * @version 08/16/20
 */
public class CurrencyV1
{
    public static void main(String [ ] args)
    {
        //Declare and initialize local variables
        double startingUsDollars = 6500.00;		// starting US Dollars

        double pesosSpent = 7210.25;           // Mexican Pesos spent
        double pesoExchangeRate = 19.57852;     // 1 US dollar = 19.57852 Pesos
        double dollarsSpentInMexico = 0.0;      // US dollars spent in Mexico
        double dollarsAfterMexico = 0.0;        // US dollars remaining after Mexico
        //remaining variables below here

        // Message to user stating purpose
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("This program converts an amount of money");
        System.out.println("from a specific country into the equivalent");
        System.out.println("currency of another country given the current");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println();

        System.out.println("Starting US Dollars: " + "\t\t\t\t" + startingUsDollars);
        System.out.print("\n");

        //Calculations for Japan
        double moneySpentInYen = 105000.00;              // Yen spent
        double moneySpentInUSDollars = moneySpentInYen * 0.00997;  //money spent in US Dollars
        double usDollarsRemaining = startingUsDollars - moneySpentInUSDollars;	//dollars remaining
        System.out.print("Japan: ");
        System.out.print("\n");
        System.out.println("  " + "Yen spent: " + "\t\t\t\t\t\t" + moneySpentInYen);
        System.out.println("  " + "US Dollars equivalent: " + "\t\t\t" + moneySpentInUSDollars);
        System.out.println("  " + "US Dollars remaining: " + "\t\t\t" + usDollarsRemaining);

        System.out.print("\n");
        //Calculations for Peru
        double moneySpentInSol = 4224.89;      // Sol spent
        double moneySpentInUSDollars2 = moneySpentInSol * 0.2983;  //money spent in US Dollars
        double usDollarsRemaining2 = usDollarsRemaining - moneySpentInUSDollars2;	//dollars remaining
        System.out.print("Peru: ");
        System.out.print("\n");
        System.out.println("  " + "Sol spent: " + "\t\t\t\t\t\t" + moneySpentInSol);
        System.out.println("  " + "US Dollars equivalent: " + "\t\t\t" + moneySpentInUSDollars2);
        System.out.println("  " + "US Dollars remaining: " + "\t\t\t" + usDollarsRemaining2);

        System.out.print("\n");
        //Calculations for Czech Republic
        double moneySpentInKoruna = 5567.56;      // Koruna spent
        double moneySpentInUSDollars3 = moneySpentInKoruna * 0.04841;  //money spent in US Dollars
        double usDollarsRemaining3 = usDollarsRemaining2 - moneySpentInUSDollars3;	//dollars remaining
        System.out.print("Czech Republic: ");
        System.out.print("\n");
        System.out.println("  " + "Koruna spent: " + "\t\t\t\t\t" + moneySpentInKoruna);
        System.out.println("  " + "US Dollars equivalent: " + "\t\t\t" + moneySpentInUSDollars3);
        System.out.println("  " + "US Dollars remaining: " + "\t\t\t" + usDollarsRemaining3);
        System.out.println("====================================================");
        System.out.println("Remaining US Dollars: " + "\t\t\t\t" + usDollarsRemaining3);
        System.out.println("\n");
        // Conversion
        // code goes below here


        // Complete the code below for Souvenir Purchases
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Souvenir Purchases");
        System.out.println(" (all values in US Dollars) ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        //Calculations for Souvenir #1
        int costItem1 = 12;  						//cost per item of first souvenir
        int budget1 = 100;   						//budget for first item
        int totalItems1 = budget1 / costItem1;           //how many items can be purchased
        int fundsRemaining1 = budget1 % costItem1;   //how much of the budget is left

        System.out.println("Item 1");
        System.out.println("   Cost per item: $" + costItem1 );
        System.out.println("   Budget: $"+ budget1);
        System.out.println("   Total items purchased: " +  totalItems1);
        System.out.println("   Funds remaining: $"  +  fundsRemaining1);
        System.out.println();

        //Calculations for Souvenir #2
        double costItem2 = 29.99;  						//cost per item of second souvenir
        int budget2 = 500;   							//budget for second item
        int totalItems2 = (int) (budget2 / costItem2); 	   //how many items can be purchased
        double fundsRemaining2 = budget2 % costItem2;  	//how much of the budget is left

        System.out.println("Item 2");
        System.out.println("   Cost per item: $" + costItem2 );
        System.out.println("   Budget: $" + budget2);
        System.out.println("   Total items purchased: " +  totalItems2);
        System.out.println("   Funds remaining: $" +  fundsRemaining2);

    } // end of main method
} // end of class
