/**
 * This class defines an Oval Cylinder object that extends an Oval.
 *
 * @author Trisha Ganesh
 * @version 07/5/2021
 */

public class OvalCylinder2 extends Oval2
{
    // instance variables
    private int height;
    private String OvalCylinder;

    // Constructor for objects of class OvalCylinder
    public OvalCylinder2(int x, int y, int rad1, int rad2, int h, String OvalCylinderN)
    {
        // call superclass
        super(x, y, rad1, rad2, OvalCylinderN);

        // initialize instance variables
        height = h;
        OvalCylinder = OvalCylinderN;
    }

    public String getNameOvalCylinder() {
        return OvalCylinder;
    }

    public int getHeight()
    {
        return height;
    }
}
