/**
 * This class defines a Box object by extending a Rectangle.
 *
 * @author Trisha Ganesh
 * @version 07/5/2021
 */

public class Box4 extends Rectangle4
{
    // instance variables
    private int height;

    // Constructor for objects of class Box
    public Box4(int l, int w, int h)
    {
        // call superclass
        super(l, w);

        // initialize instance variables
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
        return "Box's dimensions: " + getLength() + " X " + getWidth() + " X " + getHeight();
    }
}
