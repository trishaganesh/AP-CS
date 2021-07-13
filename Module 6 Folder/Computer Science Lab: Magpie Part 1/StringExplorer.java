/**
 * A program to allow students to try out different
 * String methods.
 *
 * 
 *
 * @author Trisha Ganesh
 * @version 6/19/2021
 */
public class StringExplorer
{

    public static void main(String[] args) {

        String sample = "The quick brown fox jumped over the lazy dog.";
        System.out.println("sample = " + sample);
        System.out.println();

        //  Demonstrate the indexOf method.
        int position = sample.indexOf("quick");
        System.out.println("sample.indexOf(\"quick\") = " + position);

        int notFoundPos  = sample.indexOf("slow");
        System.out.println("sample.indexOf(\"slow\") = " + notFoundPos);

        position = sample.indexOf("o");
        System.out.println("sample.indexOf(\"o\") = "+ position);
        position = sample.indexOf("o", position + 1);
        System.out.println("sample.indexOf(\"o\", position + 1) = " + position);

        System.out.println();

        //  Demonstrate the toLowerCase method.
        String lowerCase = sample.toLowerCase();
        System.out.println("sample.toLowerCase() = " + lowerCase);
        System.out.println("After toLowerCase(), sample = " + sample);
        System.out.println();

        boolean isEqual = sample.equals(sample.toLowerCase());
        System.out.println("sample.equals(sample.toLowerCase() = "+ isEqual);

        // Assign a new value to sample. Use a phrase of your choosing.
        // Pad the beginning and end of the string literal with spaces.
        sample = " The students were eager to learn.";
        System.out.println("sample = " + sample);
        System.out.println();

        //  Add examples below for the following methods:
        //    trim()
        String str = sample;
        System.out.println(str.trim());
        //    length()
        int lengthOfStr = str.length();
        System.out.println("The length: " + lengthOfStr);
        //    indexOf with one and two parameters
        int foundInx = str.indexOf("eager", 5);
        System.out.println(foundInx);
        //    substring() with one and two parameters
        String newStr = str.substring(5, 9);
        System.out.println(newStr);
        //    compareTo()

        int a = str.compareTo("STUDENTS");
        System.out.println("Comparing the String sample to another using compareTo: " + a);
        //    equals()
        if(str.equals(" The students were eager to learn."))
            System.out.println("The Strings match.");
        else
            System.out.println("The Strings don't match.");
        //    compareToIgnoreCase()
        int compare = str.compareToIgnoreCase("the students were eager to learn.");
        System.out.println("The difference between the strings is: " + compare);

        String lowerCaseString = str.toLowerCase();
        System.out.println(lowerCaseString);

    }
}
