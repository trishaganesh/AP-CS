/**
 * This program uses methods and a default constructor
 * to calculate the average and difference between 2 numbers
 *
 * @author Trisha Ganesh
 * @version 2/07/2021
 */

public class Main {

    //main method
    public static void main(String[] args)
    {
        // Define and initialize variables
        int age1 = 11;
        int age2 = 15;
        double average = 0.0;
        int diff = 0;

        AgeV3 number = new AgeV3();
        average = number.calculateAgeAverage(age1, age2);
        diff = number.calculateAgeDifference(age1, age2);

        // Display output
        System.out.println("\t\t\t\t\t\tAges\t\t\t\t");
        System.out.println("Age 1 \t\t\t Age 2 \t\t\t Average \t\t\t Difference");
        System.out.println("-----------------------------------------------------------------------");
        System.out.println(" " + age1 + "\t\t\t\t" + "  " + age2 + "\t\t\t"  + "  " + average + "\t\t\t\t\t" + diff);

    }
}
