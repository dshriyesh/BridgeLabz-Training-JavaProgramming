public class SingleInheritance {
    int prev_balance = 1000;
    int new_balance = 2000;

    void fun() {
        System.out.println("Previous balance is: " + prev_balance);
    }

    public static void main(String[] args) {
        A obj = new A();

        obj.fun();        // child method
        obj.superFun();   // parent method
    }
}

class A extends SingleInheritance {

    A() {
        super();
    }

    void fun() {
        System.out.println("Current balance is: " + new_balance);
    }

    void superFun() {
        super.fun();
    }
}