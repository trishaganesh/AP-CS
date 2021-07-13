/**
 * The purpose of this program is to demonstrate the understanding of overriding methods in java with
 * object declarations and the static method
 * to print various values.
 *
 * @author Trisha Ganesh
 * @version 07/5/2021
 */

public class ShapesTester4 {

    public static void main(String[] args) {

        System.out.println("My shapes: ");
        System.out.println();
        Rectangle4 one = new Rectangle4(12, 20);
        Box4 two = new Box4(4, 4, 4);
        Box4 three = new Box4(4, 12, 8);
        Cube4 four = new Cube4(4, 4, 4);
        IsoscelesTrapezoid4 five = new IsoscelesTrapezoid4(5, 6, 9);
        Trapezoid4 six = new Trapezoid4(4, 12, 8);

        showEffectBoth(one);
        showEffectBoth(two);
        showEffectBoth(three);
        showEffectBoth(four);
        showEffectBoth(five);
        showEffectBoth(six);
        System.out.println();
        System.out.println("Test for Equality: ");

        //Checks Rectangle with Box.
        System.out.print("\n");
        System.out.print(one.toString());
        if (one.equals(two)) {
            System.out.print(" are the same size as ");
        } else {
            System.out.print(" are not the same size as ");
        }
        System.out.print(two.toString());
        System.out.print("\n");

        //Checks Cube with Box.
        System.out.print("\n");
        System.out.print(four.toString());
        if (four.equals(three)) {
            System.out.print(" are the same size as ");
        } else {
            System.out.print(" are not the same size as ");
        }
        System.out.print(three.toString());
        System.out.println("\n");

        //Checks Box with Cube.
        System.out.print(two.toString());
        if (two.equals(four)) {
            System.out.print(" is not same size as ");
        }
        else {
            System.out.print(" are the same size as ");
        }
        System.out.print(four.toString());
        System.out.println("\n");

        //Checks Isosceles Trapezoid with Trapezoid
        System.out.println(five.toString());
        if (five.equals(six)) {
            System.out.println(" is the same size as");
        }
        else {
            System.out.println("are not the same size as ");
        }
        System.out.println(six.toString());

        System.out.println();
        //Checks Box with Trapezoid
        System.out.println(three.toString());
        if (three.equals(six)) {
            System.out.println(" is not same size as");
        }
        else {
            System.out.println(" are the same size as ");
        }
        System.out.println(six.toString());
        System.out.println("\n");
    }

    private static void showEffectBoth(Rectangle4 shape)
    {
        System.out.println(shape);
    }
}
