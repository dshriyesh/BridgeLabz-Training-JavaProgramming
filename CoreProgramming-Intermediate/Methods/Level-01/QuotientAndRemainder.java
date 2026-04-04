import java.util.Scanner;

public class QuotientAndRemainder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int n1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int n2 = scanner.nextInt();

        

        int[] results = computaion(n1, n2);

        System.out.println("Quotient: " + results[0]);
        System.out.println("Remainder: " + results[1]);

    }

    public static int[] computaion(int n1, int n2) {
        int smallest = n1;
        int largest = n2;

        int rem = n1%n2;
        int quotient = n1/n2;

        return new int[]{quotient, rem};
    }
}
