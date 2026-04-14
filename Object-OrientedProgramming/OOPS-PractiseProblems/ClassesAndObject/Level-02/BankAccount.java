import java.util.Scanner;

public class BankAccount {
    String accountHolder;
    int accountNumber;
    int balance;

    // Constructor
    public BankAccount(String accountHolder, int accountNumber) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = 0;
    }

    void depositMoney(int amount) {
        balance += amount;
        System.out.println("Amount deposited successfully!");
    }

    void withdraw(int amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance!");
        } else {
            balance -= amount;
            System.out.println("Amount withdrawn successfully!");
        }
    }

    // Display
    void display() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Balance: " + balance);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account holder name: ");
        String name = sc.nextLine();

        System.out.print("Enter account number: ");
        int accNo = sc.nextInt();

        BankAccount obj = new BankAccount(name, accNo);

        obj.display();

        // Deposit
        System.out.print("\nWant to deposit money? (y/n): ");
        char ch = sc.next().charAt(0);
        if (ch == 'y' || ch == 'Y') {
            System.out.print("Enter amount to deposit: ");
            int amount = sc.nextInt();
            obj.depositMoney(amount);
        }

        // Withdraw
        System.out.print("\nWant to withdraw money? (y/n): ");
        char ch2 = sc.next().charAt(0);
        if (ch2 == 'y' || ch2 == 'Y') {
            System.out.print("Enter amount to withdraw: ");
            int amount = sc.nextInt();
            obj.withdraw(amount);  
        }

        // Display
        System.out.print("\nWant to check account details? (y/n): ");
        char ch3 = sc.next().charAt(0);
        if (ch3 == 'y' || ch3 == 'Y') {
            obj.display();
        }

        sc.close();
    }
}