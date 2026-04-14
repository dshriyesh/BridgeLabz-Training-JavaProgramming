import java.util.ArrayList;
import java.util.Scanner;

public class CartItem {
    String itemName;
    int price;
    int quantity;

    // Constructor
    CartItem(String itemName, int quantity, int price) {
        this.itemName = itemName;
        this.quantity = quantity;
        this.price = price;
    }

    void display() {
        System.out.println("Item: " + itemName);
        System.out.println("Quantity: " + quantity);
        System.out.println("Price: " + price);
        System.out.println();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<CartItem> cart = new ArrayList<>();

        // Adding items
        cart.add(new CartItem("Laptop", 1, 50000));
        cart.add(new CartItem("Mouse", 2, 500));
        cart.add(new CartItem("Keyboard", 1, 1500));

        // Display before removal
        System.out.println("Cart Items:");
        for (CartItem item : cart) {
            item.display();
        }

        // Remove item
        System.out.print("Enter item name to remove: ");
        String removeItem = sc.nextLine();

        boolean found = false;

        for (int i = 0; i < cart.size(); i++) {
            if (cart.get(i).itemName.equalsIgnoreCase(removeItem)) {
                cart.remove(i);
                found = true;
                System.out.println("Item removed successfully!");
                break;
            }
        }

        if (!found) {
            System.out.println("Item not found in cart!");
        }

        // Display after removal
        System.out.println("\nUpdated Cart:");
        for (CartItem item : cart) {
            item.display();
        }

    }
}