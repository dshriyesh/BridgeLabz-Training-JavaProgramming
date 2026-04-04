// Write a program to calculate various trigonometric functions using Math class given an angle
// in degrees
// Hint =>
// a. Method to calculate various trigonometric functions, Firstly convert to radians and then
// use Math function to find sine, cosine and tangent.
// public double[] calculateTrigonometricFunctions(double angle)

import java.util.*;

public class TrignometricFunctions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the angle in degrees: ");
        double degrees = scanner.nextDouble();

        double[] results = calculateTrigonometricFunctions(degrees);

        System.out.println("Sine: " + results[0]);
        System.out.println("Cosine: " + results[1]);
        System.out.println("Tangent: " + results[2]);

        scanner.close();
    }

    public static double[] calculateTrigonometricFunctions(double angle) {
        // Convert degrees to radians
        double radians = Math.toRadians(angle);

        // Calculate sine, cosine, and tangent
        double sinVal = Math.sin(radians);
        double cosVal = Math.cos(radians);
        double tanVal = Math.tan(radians);

        return new double[]{sinVal, cosVal, tanVal};
    }
}
