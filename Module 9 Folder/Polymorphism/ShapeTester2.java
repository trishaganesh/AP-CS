import java.util.ArrayList;

/**
 * The purpose of this program is to demonstrates polymorphism with
 * object declarations and the static method
 * to print various values.
 *
 * @author Trisha Ganesh
 * @version 07/5/2021
 */

public class ShapeTester2
{
    //showCenter method
    public static void showCenter(Circle2 shape) {

        System.out.println("For this " + shape.getNameCircle() + " the " + shape.getCenter() + ".");
    }

    public static void main(String[] args) {

        //ArrayList
        ArrayList<Circle2> shape = new ArrayList<>();
        //add shape
        shape.add(new Circle2(2, 4, 6, "Circle2"));
        shape.add(new Cylinder2(10, 15, 4, 5, "Cylinder2"));
        shape.add(new Oval2(25, 10, 4, 12, "Oval2"));
        shape.add(new OvalCylinder2(40, 10, 4, 12, 5, "OvalCylinder2"));

        //for each loop
        for (Circle2 circle : shape) {
            showCenter(circle);
        }
    }
}

