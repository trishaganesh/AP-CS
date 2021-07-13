/**
 * This class defines a Winter Mountain.
 *
 * @author Trisha Ganesh
 * @version 7/3/2021
 */

public class WinterMountain extends Mountain
{
    // instance variables
    private double temperature;

    // Constructor for objects of class WinterMountain
    public WinterMountain(int l, int w, int m, double temp)
    {
        // call superclass
        super(l, w, m);

        // initialize instance variables
        temperature = temp;
    }

    public double getTemperature()
    {
        return temperature;
    }
}
