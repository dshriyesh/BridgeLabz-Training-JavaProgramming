// Write a program that takes the base and height in cm to find the area of a triangle in square
// inches and square centimeters
import java.util.Scanner;
public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the base (cm): ");
        double base = input.nextDouble();

        System.out.print("Enter the height (cm): ");
        double height = input.nextDouble();

        // area of triangle
        double areaCm2 = 0.5 * base * height;

        // Convert to sq inches (1 sq in = 6.4516 sq cm)
        double areaIn2 = areaCm2 / 6.4516;

        System.out.printf("The Area of the triangle in sq in is %.2f and sq cm is %.2f%n", 
                          areaIn2, areaCm2);
    }
}
