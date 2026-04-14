
import java.util.Scanner;

public class ItemCost {
    int itemCode;
    String itemName;
    int price;
    int totalSum=0;
    public ItemCost(int itemCode,String itemName,int price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    void display(){
        System.out.println(itemCode+"    "+itemName+"    "+price);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter details : ");

        char choice;
        int sum=0;
        do {
            System.out.print("Enter itemcode: ");
            int itemCode = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter itemName: ");
            String itemName = sc.nextLine();
            System.out.print("Enter price: ");
            int price = sc.nextInt();
            sum+=price;
            ItemCost item = new ItemCost(itemCode, itemName, price);


            System.out.print("Do you want to add more items? (y/n): ");
            choice = sc.next().charAt(0);

        } while(choice == 'y' || choice == 'Y');
        System.out.println("total cost is: "+sum);
    }
}
