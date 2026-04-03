import java.util.Scanner;
public class DiscountFee2 {
 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Fee: ");
        int fee = sc.nextInt();
        System.out.print("Enter Discount : ");
        int discountPercent = sc.nextInt();

        int discount =(fee/discountPercent);

        System.out.println("The discount amount is INR: "+discount+ " and final discounted fee is INR: "+(fee-discount));

 }   
}
