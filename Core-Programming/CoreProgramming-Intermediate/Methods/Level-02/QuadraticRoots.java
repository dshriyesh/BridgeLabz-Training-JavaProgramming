// Write a program Quadratic to find the roots of the equation ax . Use Math
// functions Math.pow() and Math.sqrt()
// Hint =>
// a. Take a, b, and c as input values to find the roots of x.
// b. The roots are computed using the following formula
// If delta is positive the find the two roots using formulae
// root1 of x = (− b + delta)/(2 * a)
// root1 of x = (− b − delta)/(2 * a)
// If delta is zero then there is only one root of x
// root of x = − b/(2 * a)
// If delta is negative return empty array or nothing
// c. Write a Method to find find the roots of a quadratic equation and return the roots

import java.util.Scanner;

public class QuadraticRoots {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of a: ");
        double a = sc.nextDouble();

        System.out.print("Enter value of b: ");
        double b = sc.nextDouble();

        System.out.print("Enter value of c: ");
        double c = sc.nextDouble();

        if (a == 0) {
            System.out.println("Not a quadratic equation!");
            return;
        }

        double[] roots = findRoots(a, b, c);

        // Output
        if (roots.length == 2) {
            System.out.println("Two real roots:");
            System.out.println("Root 1 = " + roots[0]);
            System.out.println("Root 2 = " + roots[1]);
        } else if (roots.length == 1) {
            System.out.println("One real root:");
            System.out.println("Root = " + roots[0]);
        } else {
            System.out.println("No real roots (discriminant is negative).");
        }
    }
        public static double[] findRoots(double a, double b, double c) {
        double delta = Math.pow(b, 2) - 4 * a * c;

        // If discriminant > 0 → two roots
        if (delta > 0) {
            double root1 = (-b + Math.sqrt(delta)) / (2 * a);
            double root2 = (-b - Math.sqrt(delta)) / (2 * a);
            return new double[]{root1, root2};
        }
        // If discriminant == 0 → one root
        else if (delta == 0) {
            double root = -b / (2 * a);
            return new double[]{root};
        }
        // If discriminant < 0 → no real roots
        else {
            return new double[]{};
        }
    }
}
