/**
 * Purpose: The Products object class
 *
 * @author Trisha Ganesh
 * @version 7/20/21
 *
 */

public class Products
{
    // instance variables
    private int productNumber, productQuantity;
    private double productPrice;
    private String productName;

    // Constructor for objects of class Products
    public Products(String productName, int productNumber, double productPrice, int productQuantity)
    {
        // initializing instance variables
        this.productName = productName;
        this.productNumber = productNumber;
        this.productPrice = productPrice;
        this.productQuantity = productQuantity;
    }

    //getter method and setter methods for product attributes
    public String getProductName()
    {
        return productName;
    }

    public void setProductName(String name)
    {
        this.productName = name;
    }

    public int getProductNumber()
    {
        return productNumber;
    }

    public void setProductNumber(int productNumber)
    {
        this.productNumber = productNumber;
    }

    public double getProductPrice()
    {
        return productPrice;
    }

    public void setProductPrice(double price)
    {
        this.productPrice = price;
    }

    public int getPriceQuantity()
    {
        return productQuantity;
    }

    public void setPriceQuantity(int quantity)
    {
        this.productQuantity = quantity;
    }

    //to String method
    public String toString()
    {
        String str = String.format("%11s %9.99s %14s %11s", productName, "#" + productNumber,
                "$"+ productPrice, productQuantity);
        return str;
    }
}
