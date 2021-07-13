/**
 * This class defines a Cube object by extending a Box.
 *
 * @author Trisha Ganesh
 * @version 07/5/2021
 */

public class Cube4 extends Box4 {

    private int height;

    public Cube4(int l, int w, int h) {
        // call superclass
        super(l, w, h);

        height = h;
    }

    // String to display when object is printed.
    public String toString()
    {
        return "Cube's dimensions: " + getLength() + " X " + getWidth() + " X " + getHeight();
    }
}
