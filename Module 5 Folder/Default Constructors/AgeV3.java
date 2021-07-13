/**
 * This program uses methods and a default constructor
 * to calculate the average and difference between 2 numbers
 *
 * @author Trisha Ganesh
 * @version 2/07/2021
 */

public class AgeV3 {
    // default constructor
    public AgeV3() {

    }
    public double calculateAgeAverage(int age1, int age2)
    {
        return (age1 + age2) / 2;
    }

    public int calculateAgeDifference(int age1, int age2)
    {
        return age2 - age1;
    }

}
