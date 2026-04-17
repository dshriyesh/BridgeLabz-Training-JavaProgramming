class Product {

    static int discount;

    String productName;
    int price;
    int quantity;

    final int productId;

    public Product(int productId, String productName, int price, int quantity, int discount) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        Product.discount = discount;
    }

    static void updateDiscount(int newDiscount) {
        discount = newDiscount;
    }

    int calculateDiscountedPrice() {
        return price - (price * discount / 100);
    }

    void display() {
        System.out.println("Product name is: " + productName);
        System.out.println("Product Id is: " + productId);
        System.out.println("Product price is: " + price);
        System.out.println("Product quantity is: " + quantity);
    }
}

public class ShoppingCart {
    public static void main(String[] args) {

        Product p1 = new Product(3, "Soap", 20, 1, 5);

        if (p1 instanceof Product) {
            p1.display();

            int newPrice = p1.calculateDiscountedPrice();
            System.out.println("Price after Discount: " + newPrice);

            System.out.println();

            Product.updateDiscount(10);

            int updatedPrice = p1.calculateDiscountedPrice();
            System.out.println("Price after Updated Discount: " + updatedPrice);
        }
    }
}