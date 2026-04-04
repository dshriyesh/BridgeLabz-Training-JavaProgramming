// 13. Rewrite the program number 12 with the for loop instead of a while loop to find the sum of n
// Natural Numbers.

import java.util.Scanner;

public class SumOfNaturalforLoop {
    public static void main(String[] args) {
      Scanner var1 = new Scanner(System.in);
      System.out.print("Enter a natural number (n): ");
      int var2 = var1.nextInt();
      if (var2 >= 1) {
         int var3 = var2 * (var2 + 1) / 2;
         int var4 = 0;

         for(int var5 = 1; var5 <= var2; ++var5) {
            var4 += var5;
         }

         System.out.println("Sum using Formula: " + var3);
         System.out.println("Sum using While Loop: " + var4);
         if (var3 == var4) {
            System.out.println("Success! Both results are identical.");
         } else {
            System.out.println("Error: The results do not match.");
         }
      } else {
         System.out.println("The number " + var2 + " is not a natural number.");
      }
 
    }
}
