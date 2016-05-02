
/*
Task 1 - GreenSandwich:Create a class named “Green GreenSandwich” . Data fields include a String for the ingredient ( such as “Grilled Veggies”) ,
        a String for bread type (such as “wheat”) and a double for price ( such as $4.99) and a method to display sandwich type and price.
        Include set and get methods , and anything else you need, save the file as GreenSandwich.java

        Create an application named TestSandwich, instantiate the three GreenSandwich objects.
        First object displays a ‘Default Type’ GreenSandwich.
        For second and third GreenSandwich objects get the inputs from the keyboard and display the type and price.
*/

public class GreenSandwich
{
    private String ingredient;
    private String breadType;
    private double sandwichPrice;

    public GreenSandwich(String ingredient, String breadType, double sandwichPrice){
        this.ingredient = ingredient;
        this.breadType = breadType;
        this.sandwichPrice = sandwichPrice;
    }
    public GreenSandwich(){

    }
    public void setMainIngredient(String ingredient)
    {
        this.ingredient = ingredient;
    }
    public String getMainIngredient()
    {
        return ingredient;
    }
    public void setBreadType(String bread)
    {
        this.breadType = bread;
    }
    public String getBreadType()
    {
        return breadType;
    }
    public void setSandwichPrice(double price)
    {
        this.sandwichPrice = price;
    }
    public double getSandwichPrice()
    {
        return sandwichPrice;
    }
}