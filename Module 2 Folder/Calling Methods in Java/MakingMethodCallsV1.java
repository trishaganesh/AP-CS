/**
 * Without modifying any of the method signatures, method calls were added to the
 * already created methods in the main() below
 *
 * @author Trisha Ganesh
 * @version 2/07/2021
 */

    public class MakingMethodCallsV1
    {
        public static void addTheseTwo()
        {
            System.out.println("Ten plus five equals " + (10 + 5));
        }

        public static void multiplyTheseTwo(int a, int b)
        {
            System.out.println("Ten times five equals " + (a * b));
        }

        public static int divideTheseTwo(int a, int b)
        {
            return (a / b);
        }

        public static void main(String[] args)
        {
            int a = 10;
            int b = 5;

            addTheseTwo();

            multiplyTheseTwo(a,b);

            int answer = divideTheseTwo(a,b);
            System.out.println("Ten divided by five equals" + answer);
        }
    }//end of main method
