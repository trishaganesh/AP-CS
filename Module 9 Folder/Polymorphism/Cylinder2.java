/**
 * This class defines a Cylinder object by extending a Circle.
 *
 * @author Trisha Ganesh
 * @version 07/5/2021
 */

public class Cylinder2 extends Circle2
{
    // instance variables
    private int height;
    private String cylinderName;

    // Constructor for objects of class Cylinder
    public Cylinder2(int x, int y, int rad, int h, String cy)
    {
        // call superclass
        super(x, y, rad, cy);

        // initialize instance variables
        height = h;
        cylinderName = cy;
    }

    public String getNameCylinder() {
        return cylinderName;
    }

    public int getHeight()
    {
        return height;
    }
}
