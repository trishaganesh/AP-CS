/**
 * This class defines a Forest.
 *
 * @author Trisha Ganesh
 * @version 7/3/2021
 */

public class Forest extends Terrain
{
    // instance variables
    private int numberOfTrees;

    // Constructor for objects of class Forest
    public Forest(int l, int w, int t)
    {
        // call superclass
        super(l, w);

        // initialize instance variables
        numberOfTrees = t;
    }

    public int getNumberOfTrees()
    {
        return numberOfTrees;
    }
}
