class BankAccount {

    static String bankName = "State Bank of India";
    static int totalAccounts = 0;

    final int accountNumber;

    String accountHolderName;
    double balance;

    BankAccount(String accountHolderName, int accountNumber, double balance) {
        this.accountHolderName = accountHolderName;  
        this.accountNumber = accountNumber;     
        this.balance = balance;

        totalAccounts++;
    }

    // Method to display account details
    void displayDetails() {
        System.out.println("Bank Name: " + bankName);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
        System.out.println();
    }

    static void getTotalAccounts() {
        System.out.println("Total Accounts Created: " + totalAccounts);
    }

    public static void main(String[] args) {

        BankAccount acc1 = new BankAccount("Shriyesh", 101, 5000);
        BankAccount acc2 = new BankAccount("Rahul", 102, 10000);

        if (acc1 instanceof BankAccount) {
            acc1.displayDetails();
        }

        if (acc2 instanceof BankAccount) {
            acc2.displayDetails();
        }

        BankAccount.getTotalAccounts();
    }
}