/**
 * This class defines a Mountain.
 *
 * @author Trisha Ganesh
 * @version 7/3/2021
 */

public class Mountain extends Terrain
{
    // instance variables
    private int numberOfMountains;

    // Constructor for objects of class Mountain
    public Mountain(int l, int w, int m)
    {
        // call superclass
        super(l, w);

        // initialize instance variables
        numberOfMountains = m;
    }

    public int getNumberOfMountains()
    {
        return numberOfMountains;
    }
}
