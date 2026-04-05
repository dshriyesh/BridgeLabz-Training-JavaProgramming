// Extend or Create a UnitConvertor utility class similar to the one shown in the notes to do
// the following. Please define static methods for all the UnitConvertor class methods. E.g.
// public static double convertYardsToFeet(double yards) =>
// a. Method to convert yards to feet and return the value. Use following code to convert
// double yards2feet = 3;
// b. Method to convert feet to yards and return the value. Use following code to convert
// double feet2yards = 0.333333;
// c. Method to convert meters to inches and return the value. Use following code to convert
// double meters2inches = 39.3701;
// d. Method to convert inches to meters and return the value. Use following code to convert
// double inches2meters = 0.0254;
// e. Method to convert inches to centimeters and return the value. Use the following code
// double inches2cm = 2.54;

import java.util.Scanner;

public class UnitConvertorTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter yards: ");
        double yards = scanner.nextDouble();
        System.out.println(yards + " yards = " + convertYardsToFeet(yards) + " feet");

        System.out.print("Enter feet: ");
        double feet = scanner.nextDouble();
        System.out.println(feet + " feet = " + convertFeetToYards(feet) + " yards");

        System.out.print("Enter meters: ");
        double meters = scanner.nextDouble();
        System.out.println(meters + " m = " + convertMetersToInches(meters) + " inches");

        System.out.print("Enter inches: ");
        double inches = scanner.nextDouble();
        System.out.println(inches + " inches = " + convertInchesToMeters(inches) + " m");
        System.out.println(inches + " inches = " + convertInchesToCm(inches) + " cm");

    }

    public static double convertYardsToFeet(double yards) {
        double yards2feet = 3;
        return yards * yards2feet;
    }

    public static double convertFeetToYards(double feet) {
        double feet2yards = 0.333333;
        return feet * feet2yards;
    }

    public static double convertMetersToInches(double meters) {
        double meters2inches = 39.3701;
        return meters * meters2inches;
    }

    public static double convertInchesToMeters(double inches) {
        double inches2meters = 0.0254;
        return inches * inches2meters;
    }

    public static double convertInchesToCm(double inches) {
        double inches2cm = 2.54;
        return inches * inches2cm;
    }
}
