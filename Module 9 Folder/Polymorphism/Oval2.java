/**
 * This class defines an Oval object by extending Circle.
 *
 * @author Trisha Ganesh
 * @version 07/5/2021
 */

public class Oval2 extends Circle2
{
    // instance variables
    private int radius2;
    private String OvalName;

    // Constructor for objects of class Oval
    public Oval2(int x, int y, int rad1, int rad2, String ovalN)
    {
        // call superclass
        super(x, y, rad1, ovalN);

        // initialize instance variables
        radius2 = rad2;
        OvalName = ovalN;
    }

    public String getNameOval() {
        return OvalName;
    }

    public int getRadius2()
    {
        return radius2;
    }
}
