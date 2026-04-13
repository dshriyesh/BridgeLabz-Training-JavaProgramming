// Rewrite program factorial of number using for loop
import java.util.Scanner;
public class FactorialOfNumberForLoop {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        int prod=1;
        for(int i=num;i>=1;i--){
            prod=prod*i;
        }
        System.out.println("factorial of the given number is "+prod);
    }
}
