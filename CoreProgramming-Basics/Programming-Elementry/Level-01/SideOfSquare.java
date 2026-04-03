import java.util.Scanner;

public class SideOfSquare {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the perimeter of the square: ");
        double perimeter = input.nextDouble();

        double side = perimeter / 4;

        System.out.printf("The length of the side is %.2f %nwhose perimeter is %.2f", 
                          side, perimeter);
    }
}
