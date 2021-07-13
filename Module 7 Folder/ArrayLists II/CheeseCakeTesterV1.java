/**
 * @The purpose of this program is two print results for 6 different types of cheesecakes by implementing
 * various formulas to help calculate the ingredients for all 6 cheesecakes. After, we print both the data and ingredient
 * calculations.
 *
 * @author Trisha Ganesh
 * @version 6/20/2021
 *
 */

import java.util.ArrayList;
    public class CheeseCakeTesterV1
    {
        public static void main(String[] args) {

            String cheeseCakeName1 = "Blueberry";
            int quantity1 = 5;

            String cheeseCakeName2 = "Strawberry";
            int quantity2 = 6;

            String cheeseCakeName3 = "Cherry";
            int quantity3 = 4;

            String cheeseCakeName4 = "Jalapeno";
            int quantity4 = 1;

            String cheeseCakeName5 = "Dill Pickle";
            int quantity5 = 2;

            String cheeseCakeName6 = "Fig";
            int quantity6 = 3;

            double mySugar = 0.00;
            int quantity;

            //initializing and declareing an ArrayList and adding in objects as elements
            ArrayList<CheeseCakeV1> cake = new ArrayList<CheeseCakeV1>();
            // add CheeseCake to the ArrayList
            cake.add(new CheeseCakeV1(cheeseCakeName1, quantity1));
            cake.add(new CheeseCakeV1(cheeseCakeName2, quantity2));
            cake.add(new CheeseCakeV1(cheeseCakeName3, quantity3));
            cake.add(new CheeseCakeV1(cheeseCakeName4, quantity4));
            cake.add(new CheeseCakeV1(cheeseCakeName5, quantity5));
            cake.add(new CheeseCakeV1(cheeseCakeName6, quantity6));

            //calls several method for each object to perform calculations
            for (CheeseCakeV1 dataRecord : cake) {
                //invoke methods
                dataRecord.calcTotalServings();
                dataRecord.calcCreamCheese();
                dataRecord.calcVanilla();
                dataRecord.calcSugar();
            }

            //printing the format of the table
            System.out.println(" |       Cheese Cake Data           |             Ingredient Calculations                             |");
            System.out.println(" | Index | Quantity |  Flavor       | Cream Cheese | Servings |     Sugar       |     Vanilla         |");
            System.out.println(" |-------|----------|---------------|--------------|----------|-----------------|---------------------|");

            CheeseCakeV1 dataRecord;

            //using a for loop to print out the objects' data
            for (int index = 0; index < cake.size(); index++) {
                // print each CheeseCake's data
                dataRecord = cake.get(index);
                System.out.printf("%5s %10s %14s %13.5s %11.5s %14.5s %21.7s", index, dataRecord.getQuantity(),
                        dataRecord.getFlavor(), dataRecord.getCreamCheese() + "oz", dataRecord.getServings(),
                        + dataRecord.getSugar(), dataRecord.getVanilla() + " tsps");
                System.out.println();
            }
        }
    }
