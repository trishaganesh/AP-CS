/**
 * This is the Fibonacci object class.
 *
 * @author Trisha Ganesh
 * @version 07/09/2021
 */

public class Fibonacci
{
    public Fibonacci()
    {
        // Constructor for objects of Fibonacci class
    }

    //Creating a method for the Fibonacci numbers.
    //returning number value
    public int fibonacciValue(int number)
    {
        //base case
        if(number == 0 || number == 1)
        {
            return number;
        }
        else
        {
            return fibonacciValue(number - 1) + fibonacciValue(number - 2);
        }
    }
}
