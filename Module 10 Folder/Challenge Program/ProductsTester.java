/**
 * Purpose: The purpose of this program is to understand how we can use merge, insertion, and selection sort methods
 * to sort product attributes in ascending and descending order.
 *
 * @author Trisha Ganesh
 * @version 7/20/21
 *
 */

public class ProductsTester
{
    public static void main(String[] args)
    {
        //Array of 10 product objects
        Products[] products = new Products[10];
        Products[] sorted = new Products[10];

        products[0] = new Products("Book", 335, 10.99, 7);
        products[1] = new Products("Snack", 944, 5.50, 1);
        products[2] = new Products("Notebook", 689, 10.10, 6);
        products[3] = new Products("Paper", 107, 0.59, 20);
        products[4] = new Products("Pen", 87, 1.45, 7);
        products[5] = new Products("Pencil", 146, .70, 9);
        products[6] = new Products("LunchBox", 295, 15.99, 1);
        products[7] = new Products("Eraser", 778, 11.50, 3);
        products[8] = new Products("Scissors", 50, 7.50, 2);
        products[9] = new Products("Backpack", 545, 7.19, 1);

        //calling method to print table before sorting
        System.out.println("    <<<< Before Sorting >>>> \n");
        printResults(products);

        //calling method to print table after merge sorting in ascending order
        System.out.println("\n     <<<< After Merge Sorting >>>>");
        System.out.println("<<<< ascending by the product number of the product >>>>\n");
        mergeSorting(products, 0, products.length - 1);
        printResults(products);

        //calling method to print table after insertion sorting in ascending order
        System.out.println("\n     <<<< After Insertion Sorting >>>>");
        System.out.println("<<<< ascending by the name of the product >>>>\n");
        sorted = insertionProductName(products, 1);
        printResults(sorted);

        //calling method to print table after insertion sorting in descending order
        System.out.println("\n     <<<< After Insertion Sorting >>>>");
        System.out.println("<<<< descending by the name of the product >>>>\n");
        sorted = insertionProductName(products, 2);
        printResults(sorted);

        //calling method to print table after selection sorting in ascending order of price
        System.out.println("\n     <<<< After Selection Sorting >>>>");
        System.out.println("<<<< ascending by the price of the product >>>>\n");
        sorted = selectionProductPrice(products, 1);
        printResults(sorted);

        //calling method to print table after selection sorting in descending order of price
        System.out.println("\n     <<<< After Selection Sorting >>>>");
        System.out.println("<<<< descending by the price of the product >>>>\n");
        sorted = selectionProductPrice(products, 2);
        printResults(sorted);

        //calling method to print table after selection sorting in ascending order of quantity
        System.out.println("\n     <<<< After Selection Sorting >>>>");
        System.out.println("<<<< ascending by the quantity of the product >>>>\n");
        sorted = selectionProductQuantity(products, 1);
        printResults(sorted);

        //calling method to print table after selection sorting in descending order of quantity
        System.out.println("\n     <<<< After Selection Sorting >>>>");
        System.out.println("<<<< descending by the quantity of the product >>>>\n");
        sorted = selectionProductQuantity(products, 2);
        printResults(sorted);
    }

    //merge sort method for product sorting
    public static void mergeSorting(Products[] element, int lowerValue, int higherValue)
    {
        if(lowerValue == higherValue)
            return;

        int midValue = (lowerValue + higherValue) / 2;

        mergeSorting(element, lowerValue, midValue);
        mergeSorting(element, midValue + 1, higherValue);
        mergeProductNumbers(element, lowerValue, midValue, higherValue);
    }

    //merge sort method for product number
    public static void mergeProductNumbers(Products[] element, int lowerValue, int midValue, int higherValue)
    {
        Products[] location = new Products[higherValue - lowerValue + 1];

        int index = lowerValue, n = midValue + 1, number = 0;

        while(index <= midValue || n <= higherValue)
        {
            if(index > midValue)
            {
                location[number] = element[n];
                n++;
            }
            else if(n > higherValue)
            {
                location[number] = element[index];
                index++;
            }
            else if(element[index].getProductNumber() < element[n].getProductNumber())
            {
                location[number] = element[index];
                index++;
            }
            else
            {
                location[number] = element[n];
                n++;
            }
            number++;
        }

        for(int v = lowerValue; v <= higherValue; v++)
            element[v] = location[v - lowerValue];
    }

    //insertion sort method for name of product
    public static Products[] insertionProductName(Products[] element, int orderName)
    {
        Products[] location = new Products[element.length];

        for(int index = 0 ; index < element.length ; index++)
        {
            Products next = element[index];
            int insertIndex = 0;
            int o = index;
            while(o > 0 && insertIndex == 0)
            {
                if(orderName == 1)
                {
                    if(next.getProductName().compareTo(location[o - 1].getProductName()) > 0)
                    {
                        insertIndex = o;
                    }
                    else
                    {
                        location[o] = location[o - 1];
                    }
                    o--;
                }
                else if (orderName == 2)
                {
                    if(next.getProductName().compareTo(location[o - 1].getProductName()) < 0)
                    {
                        insertIndex = o;
                    }
                    else
                    {
                        location[o] = location[o - 1];
                    }
                    o--;
                }
            }
            location[insertIndex] = next;
        }
        return location;
    }

    //selection sort method for price of product
    public static Products[] selectionProductPrice(Products[] element, int orderPrice)
    {
        for (int index = element.length - 1 ; index >= 0 ; index--)
        {
            int posMax = 0;

            for (int p = 0 ; p <= index ; p++ )
            {
                if(orderPrice == 1)
                {
                    if (element[p].getProductPrice() > element[posMax].getProductPrice())
                    {
                        posMax = p;
                    }
                }
                else if(orderPrice == 2)
                {
                    if (element[p].getProductPrice() < element[posMax].getProductPrice())
                    {
                        posMax = p;
                    }
                }
            }
            double price = element[index].getProductPrice();
            element[index].setProductPrice(element[posMax].getProductPrice());;
            element[posMax].setProductPrice(price);
        }
        return element;
    }

    //selection sort method for quantity of product
    public static Products[] selectionProductQuantity(Products[] element, int orderQuantity)
    {
        for (int index = element.length - 1 ; index >= 0 ; index--)
        {
            int posMax = 0;

            for (int q = 0 ; q <= index ; q++)
            {
                if(orderQuantity == 1)
                {
                    if (element[q].getPriceQuantity() > element[posMax].getPriceQuantity())
                    {
                        posMax = q;
                    }
                }
                else if(orderQuantity == 2)
                {
                    if (element[q].getPriceQuantity() < element[posMax].getPriceQuantity())
                    {
                        posMax = q;
                    }
                }
            }
            int quantity = element[index].getPriceQuantity();
            element[index].setPriceQuantity(element[posMax].getPriceQuantity());
            element[posMax].setPriceQuantity(quantity);
        }
        return element;
    }

    //print Results
    public static void printResults(Products[] element) {
        System.out.printf("%10s %11s %14s %12s %n", "Product", "Product", "Product", "Product");
        System.out.printf("%10s %13s %11.7s %14s %n", "Name", "Number(#)", "Price", "Quantity");
        System.out.println("---------------------------------------------------------------");
        for(Products products : element)
            System.out.printf("%11s %9.99s %14s %11s \n", products.getProductName(),
                    "#" + products.getProductNumber(), "$" + products.getProductPrice(),
                    products.getPriceQuantity());
        System.out.println();
    }
}
