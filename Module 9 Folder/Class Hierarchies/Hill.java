/**
 * This class defines a basic Hill.
 *
 * @author Trisha Ganesh
 * @version 7/3/2021
 */

public class Hill extends Mountain {
    // instance variables
    private double hillsTemperature;

    // Constructor for objects of class Mountain
    public Hill(int l, int w, int m, double temp)
    {
        // call superclass
        super(l, w, m);

        // initialize instance variables
        hillsTemperature = temp;
    }

    public double getHillsTemperature()
    {
        return hillsTemperature;
    }
}
