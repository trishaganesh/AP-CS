/**
 * This class defines a basic Mesa Hill.
 *
 * @author Trisha Ganesh
 * @version 7/3/2021
 */
public class MesaHill extends Hill {
    // instance variables
    private double mesaHillsTemperature;

    // Constructor for objects of class Mountain
    public MesaHill(int l, int w, int m, double temp)
    {
        // call superclass
        super(l, w, m, temp);

        // initialize instance variables
        mesaHillsTemperature = temp;
    }

    public double getNumberOfHills()
    {
        return mesaHillsTemperature;
    }
}
