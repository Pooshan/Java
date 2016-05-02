import java.util.Scanner;

public class TestSandwich
{
    public static void main(String[] args)
    {
        String s;
        String s1;
        String s2;

        GreenSandwich test001 = new GreenSandwich();
        test001.setBreadType("White");
        test001.setMainIngredient("Green Veggi");
        test001.setSandwichPrice(3.33);


        Scanner in = new Scanner(System.in);

        GreenSandwich greenSandwich2 = new GreenSandwich();
        System.out.println("Enter a your choice");
        s = in.nextLine();
        greenSandwich2.setBreadType(s);
        greenSandwich2.setSandwichPrice(4.49);


        GreenSandwich greenSandwich3 = new GreenSandwich();
        System.out.println("Enter a your choice");
        s1 = in.nextLine();
        greenSandwich3.setBreadType(s1);
        greenSandwich3.setSandwichPrice(5.12);

        System.out.println("Default Bread type is " + test001.getBreadType());
        System.out.println("Default ingredient is " + test001.getMainIngredient());
        System.out.println("Price of Default Sandwich is: $" + test001.getSandwichPrice());

        System.out.println("Your Sandwich1 type: "+greenSandwich2.getBreadType()+" and Price is : $"+greenSandwich2.getSandwichPrice());

        System.out.println("Your Sandwich2 type: "+greenSandwich3.getBreadType()+" and Price is : $"+greenSandwich3.getSandwichPrice());

    }
}
