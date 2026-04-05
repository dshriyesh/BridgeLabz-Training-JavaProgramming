// Extend or Create a UnitConvertor utility class similar to the one shown in the notes to do
// the following. Please define static methods for all the UnitConvertor class methods. E.g.
// public static double convertFarhenheitToCelsius(double farhenheit) =>
// a. Method to convert Fahrenheit to Celsius and return the value. Use the following code
// double farhenheit2celsius = (farhenheit - 32) * 5 / 9;
// b. Method to convert Celsius to Fahrenheit and return the value. Use the following code
// double celsius2farhenheit = (celsius * 9 / 5) + 32;
// c. Method to convert pounds to kilograms and return the value. Use the following code
// double pounds2kilograms = 0.453592;
// d. Method to convert kilograms to pounds and return the value. Use the following code
// double kilograms2pounds = 2.20462;
// e. Method to convert gallons to liters and return the value. Use following code to convert
// double gallons2liters = 3.78541;
// f. Method to convert liters to gallons and return the value. Use following code to convert
// double liters2gallons = 0.264172;

import java.util.Scanner;

public class TemperatureConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Fahrenheit: ");
        double f = scanner.nextDouble();
        System.out.println(f + " Fahrenheit = " + convertFahrenheitToCelsius(f) + " Celsius");

        System.out.print("Enter Celsius: ");
        double c = scanner.nextDouble();
        System.out.println(c + " Celsius = " + convertCelsiusToFahrenheit(c) + " Fahrenheit");

        System.out.print("Enter Pounds: ");
        double lbs = scanner.nextDouble();
        System.out.println(lbs + " lbs = " + convertPoundsToKilograms(lbs) + " kg");

        System.out.print("Enter Kilograms: ");
        double kg = scanner.nextDouble();
        System.out.println(kg + " kg = " + convertKilogramsToPounds(kg) + " lbs");

        System.out.print("Enter Gallons: ");
        double gal = scanner.nextDouble();
        System.out.println(gal + " gal = " + convertGallonsToLiters(gal) + " L");

        System.out.print("Enter Liters: ");
        double liters = scanner.nextDouble();
        System.out.println(liters + " L = " + convertLitersToGallons(liters) + " gal");

        scanner.close();
    }

    public static double convertFahrenheitToCelsius(double fahrenheit) {
        double result = (fahrenheit - 32) * 5 / 9;
        return result;
    }

    public static double convertCelsiusToFahrenheit(double celsius) {
        double result = (celsius * 9 / 5) + 32;
        return result;
    }

    public static double convertPoundsToKilograms(double pounds) {
        double pounds2kilograms = 0.453592;
        return pounds * pounds2kilograms;
    }

    public static double convertKilogramsToPounds(double kilograms) {
        double kilograms2pounds = 2.20462;
        return kilograms * kilograms2pounds;
    }

    public static double convertGallonsToLiters(double gallons) {
        double gallons2liters = 3.78541;
        return gallons * gallons2liters;
    }

    public static double convertLitersToGallons(double liters) {
        double liters2gallons = 0.264172;
        return liters * liters2gallons;
    }
}
