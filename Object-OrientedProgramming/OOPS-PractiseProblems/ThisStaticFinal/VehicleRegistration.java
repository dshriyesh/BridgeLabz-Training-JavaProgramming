class Vehicle {

    static int registrationFee = 5000;

    String ownerName;
    String vehicleType;

    final int registrationNumber;

    Vehicle(String ownerName, String vehicleType, int registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    static void updateRegistrationFee(int newFee) {
        registrationFee = newFee;
    }

    void displayDetails() {
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Number: " + registrationNumber);
        System.out.println("Registration Fee: " + registrationFee);
        System.out.println();
    }
}


public class VehicleRegistration {
    public static void main(String[] args) {

        Vehicle v1 = new Vehicle("Shriyesh", "Car", 101);
        Vehicle v2 = new Vehicle("Rahul", "Bike", 102);

        if (v1 instanceof Vehicle) {
            v1.displayDetails();
        }

        if (v2 instanceof Vehicle) {
            v2.displayDetails();
        }

        
        Vehicle.updateRegistrationFee(7000);

        System.out.println("After Updating Registration Fee:\n");

        if (v1 instanceof Vehicle) {
            v1.displayDetails();
        }

        if (v2 instanceof Vehicle) {
            v2.displayDetails();
        }
    }
}
