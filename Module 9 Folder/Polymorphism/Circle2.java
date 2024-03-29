/**
 * This class defines a Circle object.
 *
 * @author Trisha Ganesh
 * @version 07/5/2021
 */

public class Circle2
{
    // instance variables
    private int x;
    private int y;
    private int radius;
    private String circleName;

    // Constructor for objects of class Circle
    public Circle2(int p_x, int p_y, int r, String n)
    {
        // initialize instance variables
        x = p_x;
        y = p_y;
        radius = r;
        circleName = n;
    }

    public int getRadius()
    {
        return radius;
    }

    public String getNameCircle() {
        return circleName;
    }

    // Concatenates a String to show the center x, y point of the circle
    public String getCenter()
    {
        return "center is at (" + x + ", " + y + ")";
    }
}
