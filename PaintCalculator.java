
import javax.swing.*;


public class PaintCalculator
{
    public static void main(String[] args)
    {
        String length1 = JOptionPane.showInputDialog(null, "Please enter the length of the wall in feet.inches: "
                , "LENGTH IN FEET.INCHES", JOptionPane.QUESTION_MESSAGE);
        double length = Double.parseDouble(length1);
        String width1 = JOptionPane.showInputDialog(null, "Please enter the width of the wall in feet.inches: "
                , "WIDTH IN FEET.INCHES", JOptionPane.QUESTION_MESSAGE);
        double width = Double.parseDouble(width1);
        String height1 = JOptionPane.showInputDialog(null, "Please enter the height of the wall in feet.inches: "
                , "HEIGHT IN FEET.INCHES", JOptionPane.QUESTION_MESSAGE);
        double height = Double.parseDouble(height1);
        int surfaceArea = calculateSurfaceArea(length, width, height);
        int gallonsPaint = calculateGallonsPaint(surfaceArea);
        double paintCost = computePaintCost(gallonsPaint);
        System.out.println("The surface area of the room is: " + surfaceArea + ".");
        System.out.println("It will require " + gallonsPaint + " gallon(s) of paint.");
        System.out.println("The cost of the paint will be " + paintCost);
    }
    public static int calculateSurfaceArea(double length, double width, double height)
    {
        int newLength = (int) ((((length / 12) * 12) * 12) + (length % 12));
        int newWidth = (int) ((((width / 12) * 12) * 12) + (width % 12));
        int newHeight = (int) ((((height / 12) * 12) * 12) + (height % 12));
        int areaCeiling = newLength * newWidth;
        int areaWall1 = newLength * newHeight;
        int areaWall2 = newWidth * newHeight;
        return areaCeiling + areaWall1 + areaWall1 + areaWall2 + areaWall2;
    }
    public static int calculateGallonsPaint(int surfaceArea)
    {
        int paintCoverage = 350;
        int convertSquareFeet = 144;
        int areaSquareInches = surfaceArea / convertSquareFeet;
        return areaSquareInches / paintCoverage;
    }
    public static double computePaintCost(int gallonsPaint)
    {
        double costPaintGal = 32.00;
        return gallonsPaint * costPaintGal;
    }
}