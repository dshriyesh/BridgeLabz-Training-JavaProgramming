public class ProductInventory {
    public static void main(String[] args) {
        Product p1=new Product("soap",10);
        p1.displayProductDetails();
        Product p2=new Product("butter", 35);
        p2.displayProductDetails();
        Product.displayTotalProduct();

    }
}

class Product{
    String productName;
    int price;
    static int totalProducts;
    public Product(String productName,int price){
        this.productName = productName;
        this.price=price;
        Product.totalProducts++;
    }

    void displayProductDetails(){
        System.out.println("Product Name: "+productName);
        System.out.println("Product Price: "+price);
    }


    static void displayTotalProduct(){
        System.out.println(Product.totalProducts);
    }
    
}