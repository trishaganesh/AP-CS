/**
 * This class defines an Isosceles Trapezoid object by extending a Trapezoid.
 *
 * @author Trisha Ganesh
 * @version 07/5/2021
 */

public class IsoscelesTrapezoid4 extends Trapezoid4
{

    // instance variables
    private int height;

    public IsoscelesTrapezoid4 (int l, int w, int h)
    {
        // call superclass
        super(l, w, h);

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
        return "Isosceles trapezoid's dimensions: " + getLength() + " X " + getWidth() + " X " + getHeight();
    }
}

