/**
 * @purpose: Tester to find the average of 3 students ages
 *
 * @author Trisha Ganesh
 * @version 02/07/2021
 */

public class AgeTesterV8
{
    //main method
    public static void main (String[] args) {
        // Define and initialize variables
        int ageTwoYearsAgo1 = 14;
        int ageNow1 = 16;
        int ageTwoYearsAgo2 = 13;
        int ageNow2 = 15;
        int ageTwoYearsAgo3 = 12;
        int ageNow3 = 14;

        AgeV8 number1 = new AgeV8("Student1");

        double average1 = number1.calculateAverageAge(ageNow1, ageTwoYearsAgo1);

        AgeV8 number2 = new AgeV8("Student2", ageNow2);

        double average2 = number2.calculateAverageAge(ageTwoYearsAgo2);

        AgeV8 number3 = new AgeV8("Student3", ageNow3);

        double average3 = number3.calculateAverageAge(ageTwoYearsAgo3);

        // Display output
        System.out.println("\t\t\t\t\t\t\t\t\tAges\t\t\t\t\t\t");
        System.out.println("Student" + "\t\t\t" + "Age 2 Years ago \t\t\t Age Now \t\t\t\t  Average \t\t\t\t");
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println("John" + "\t\t\t\t " + ageTwoYearsAgo1 + "\t\t\t\t\t\t " + "  " + ageNow1 + "\t\t\t\t\t "  + "  " + average1 + "\t\t\t\t\t");
        System.out.println("Alisa" + "\t\t\t\t " + ageTwoYearsAgo2 + "\t\t\t\t\t\t " + "  " + ageNow2 + "\t\t\t\t\t "  + "  " + average2 + "\t\t\t\t\t");
        System.out.println("Jessica" + "\t\t\t\t " + ageTwoYearsAgo3 + "\t\t\t\t\t\t " + "  " + ageNow3 + "\t\t\t\t\t "  + "  " + average3 + "\t\t\t\t\t");
    }
}
