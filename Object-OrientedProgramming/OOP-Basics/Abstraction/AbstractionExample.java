// Abstract class
abstract class Bank {
    abstract void getInterestRate(); // abstract method
}

// Child class 1
class SBI extends Bank {
    void getInterestRate() {
        System.out.println("SBI Interest Rate: 6%");
    }
}

// Child class 2
class HDFC extends Bank {
    void getInterestRate() {
        System.out.println("HDFC Interest Rate: 7%");
    }
}

// Main class
public class AbstractionExample {
    public static void main(String[] args) {
        Bank obj;

        obj = new SBI();
        obj.getInterestRate();

        obj = new HDFC();
        obj.getInterestRate();
    }
}