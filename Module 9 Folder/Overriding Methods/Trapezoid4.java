/**
 * This class defines a Trapezoid object.
 *
 * @author Trisha Ganesh
 * @version 07/5/2021
 */

public class Trapezoid4 extends Rectangle4 {

    // instance variables
    private int length;
    private int width;
    private int height;

    // Constructor for objects of class Rectangle
    public Trapezoid4 (int l, int w, int h)
    {
        // initialize instance variables
       super(l, w);

        height = h;
    }

    // return the height
    public int getHeight()
    {
        return height;
    }

    // String to display when object is printed.

    public String toString()
    {
        return "Trapezoid's dimensions: " + getLength() + " X " + getWidth() + " X " + getHeight();
    }
}

