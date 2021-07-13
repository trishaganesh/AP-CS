/**
 * This class defines a Rectangle object by extending a Circle.
 *
 * @author Trisha Ganesh
 * @version 07/5/2021
 */

public class Rectangle4 {

    // instance variables
    private int length;
    private int width;

    // Constructor for objects of class Rectangle
    public Rectangle4 (int l, int w)
    {
        // initialize instance variables
        length = l;
        width = w;
    }

    // return the height
    public int getLength()
    {
        return length;
    }

    // return the width
    public int getWidth()
    {
        return width;
    }

    // String to display when object is printed.

    public String toString()
    {
        return "Rectangle's dimensions: " + length + " X " + width;
    }
}
