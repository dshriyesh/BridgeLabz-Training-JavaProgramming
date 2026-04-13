import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the base of the triangle (inches): ");
        double base = input.nextDouble();
        
        System.out.print("Enter the height of the triangle (inches): ");
        double height = input.nextDouble();

        double areaInches = 0.5 * base * height;

        double areaCm = areaInches * (2.54 * 2.54);


        System.out.printf("The area of the triangle in square inches is %.2f %n" +
                          "and in square centimeters is %.2f", areaInches, areaCm);
    }
}
