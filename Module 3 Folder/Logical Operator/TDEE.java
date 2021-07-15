/**
 * @purpose: Trying to use the the BMR, gender, and Activity Factor to calculate TDEE
 *
 * @author Trisha Ganesh
 * @version 02/07/2021
 */

import java.util.Scanner;

public class TDEE {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        //User Input
        System.out.print("Please enter your name:  ");
        String Name = in.nextLine();

        System.out.print("Please enter your gender (M/F): ");
        String Gender = in.nextLine().toUpperCase();

        System.out.print("Please enter your BMR: ");
        String BMR = in.nextLine();

        System.out.println("\n");
        System.out.println("Select Your Activity Level");
        System.out.println("[A] Resting (Sleeping, Reclining)");
        System.out.println("[B] Sedentary (Restricted Mobility)");
        System.out.println("[C] Light  (Sitting, Standing)");
        System.out.println("[D] Moderate (Light Manual labor, Dancing, Riding Bike");
        System.out.println("[E]Very Active (Team Sports, Hard Manual Labor");
        System.out.println("[F] Extremely Active (Full-time Athlete, Heavy Manual Labor");
        System.out.print("\n" + "Enter the letter corresponding to your activity level: ");
        String activityLevelSelection = in.nextLine().toUpperCase();

        double ActivityFactor = 0.0;

        //Determine Activity Factor
        if (activityLevelSelection.equals("A")) {
        ActivityFactor = 1.0;
        } else if (activityLevelSelection.equals("B")) {
        ActivityFactor = 1.3;
        } else if (activityLevelSelection.equals("C") && Gender.equals("M")) {
        ActivityFactor = 1.6;
        } else if (activityLevelSelection.equals("C") && Gender.equals("F")) {
        ActivityFactor = 1.5;
        } else if (activityLevelSelection.equals("D") && Gender.equals("F")) {
        ActivityFactor = 1.6;
        } else if (activityLevelSelection.equals("D") && Gender.equals("M")) {
        ActivityFactor = 1.7;
        } else if (activityLevelSelection.equals("E") && Gender.equals("M")) {
        ActivityFactor = 2.1;
        } else if (activityLevelSelection.equals("E") && Gender.equals("F")) {
        ActivityFactor = 1.9;
        } else if (activityLevelSelection.equals("F") && Gender.equals("F")) {
        ActivityFactor = 2.2;
        } else if (activityLevelSelection.equals("F") && Gender.equals("M"))
        ActivityFactor = 2.4;

        //calculate TDEE
        int bmrParsed = Integer.parseInt(BMR);
        double TDEE =  ActivityFactor * bmrParsed;

        //Print output
        System.out.println("\n\n");
        System.out.println("Your results: ");
        System.out.println("Name: " + Name + "\t\t\t\t" + "Gender: " + Gender);
        System.out.println("BMR: " + BMR + " calories" + "\t\t\t\t" + "ActivityFactor: " + activityLevelSelection);
        System.out.println("TDEE: " + TDEE + " calories");
    }
}
