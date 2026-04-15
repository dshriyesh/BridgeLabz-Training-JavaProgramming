
import java.util.Scanner;

// Car Rental System: Create a CarRental class with attributes customerName,
// carModel, and rentalDays. Add constructors to initialize the rental details and
// calculate total cost.

class CarRental{
    String customerName;
    String carModel;
    int rentalDays;

    public CarRental(String customerName , String carModel,int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays=rentalDays;
    }

    void display(){
        System.out.println(customerName+" rented "
                            +carModel+" for "+rentalDays+" days"
        );
    }
    
}
public class CarRentalSystem {
    public static void main(String[] args) {
        System.out.print("Enter customer name: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        System.out.print("Enter car model: ");
        String model = sc.nextLine();

        System.out.println("Enter rental days: ");
        int days = sc.nextInt();

        CarRental obj = new CarRental(name, model, days);
        obj.display();
        int costPerDay = 200;
        System.out.println("total cost: "+(costPerDay*obj.rentalDays));
    }
}
