/**
 * The purpose of this program to understand how class hierarchies work. We have many classes
 * which inherit traits from the main superclass: Terrain. Then, there are other subclasses below
 * Terrain that inherit from Terrain, and is a superclass for another class.
 *
 * @author Trisha Ganesh
 * @version 7/3/2021
 */

public class GameTerrainTester
{
    public static void main(String []args)
    {

        Terrain land1 =  new Terrain(150, 240);
        Forest land2 = new Forest (400, 400, 180);
        Mountain land3 =  new Mountain(600, 200, 12);
        WinterMountain land4 =  new WinterMountain(500, 500, 30, 12.34);
        Hill land5 = new Hill(453, 344, 21, 21.23);
        MesaHill land6 = new MesaHill(265, 322, 51, 15.63);

        // Terrain
        System.out.println(land1.getTerrainSize());
        System.out.println();

        // Forest
        System.out.println("Forest " + land2.getTerrainSize() + " and has " +
                land2.getNumberOfTrees() + " trees");
        System.out.println();

        // Mountain
        System.out.println("Mountain " + land3.getTerrainSize() + " and has " +
                land3.getNumberOfMountains() + " mountains");
        System.out.println();

        // Winter Mountain
        System.out.println("Winter Mountain " + land4.getTerrainSize() + " and has " +
                land4.getNumberOfMountains() + " mountains" + " and temperature " +
                land4.getTemperature() + " degrees");
        System.out.println();

        // Hill
        System.out.println("Hill " + land5.getTerrainSize() + " and has " +
                land5.getNumberOfMountains() + " hills" + " and temperature " +
                land5.getHillsTemperature() + " degrees");
        System.out.println();
        //Mesa Hill
        System.out.println("Mesa Hill " + land6.getTerrainSize() + " and has " +
                land6.getNumberOfMountains() + " mesa hills" + " and temperature " +
                land6.getHillsTemperature() + " degrees");
        System.out.println();
    }
}
