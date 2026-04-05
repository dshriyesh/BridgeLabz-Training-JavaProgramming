// Extend or Create a UnitConvertor utility class similar to the one shown in the notes to do
// the following. Please define static methods for all the UnitConvertor class methods. E.g.
// public static double convertKmToMiles(double km) =>
// a. Method To convert kilometers to miles and return the value. Use the following code
// double km2miles = 0.621371;
// b. Method to convert miles to kilometers and return the value. Use the following code
// double miles2km = 1.60934;
// c. Method to convert meters to feet and return the value. Use the following code to convert
// double meters2feet = 3.28084;
// d. Method to convert feet to meters and return the value. Use the following code to convert
// double feet2meters = 0.3048;

import java.util.Scanner;

public class UnitConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter kilometers to convert to miles: ");
        double km = scanner.nextDouble();
        System.out.println(km + " km = " + convertKmToMiles(km) + " miles");

        System.out.print("Enter miles to convert to kilometers: ");
        double miles = scanner.nextDouble();
        System.out.println(miles + " miles = " + convertMilesToKm(miles) + " km");

        System.out.print("Enter meters to convert to feet: ");
        double meters = scanner.nextDouble();
        System.out.println(meters + " m = " + convertMetersToFeet(meters) + " feet");

        System.out.print("Enter feet to convert to meters: ");
        double feet = scanner.nextDouble();
        System.out.println(feet + " feet = " + convertFeetToMeters(feet) + " m");

        scanner.close();
    }

    public static double convertKmToMiles(double km) {
        double km2miles = 0.621371;
        return km * km2miles;
    }

    public static double convertMilesToKm(double miles) {
        double miles2km = 1.60934;
        return miles * miles2km;
    }

    public static double convertMetersToFeet(double meters) {
        double meters2feet = 3.28084;
        return meters * meters2feet;
    }

    public static double convertFeetToMeters(double feet) {
        double feet2meters = 0.3048;
        return feet * feet2meters;
    }
}
