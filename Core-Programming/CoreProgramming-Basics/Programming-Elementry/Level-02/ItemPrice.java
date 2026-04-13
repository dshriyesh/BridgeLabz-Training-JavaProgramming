// Write a program to input the unit price of an item and the quantity to be bought. Then,
// calculate the total price.
import java.util.Scanner;
public class ItemPrice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the unit price of the item (INR): ");
        double unitPrice = input.nextDouble();

        System.out.print("Enter the quantity: ");
        int quantity = input.nextInt();

        // Calculate total price
        double totalPrice = unitPrice * quantity;

        System.out.printf("The total purchase price is INR %.2f if the quantity %d and unit price is INR %.2f%n", 
                          totalPrice, quantity, unitPrice);
    }
}
