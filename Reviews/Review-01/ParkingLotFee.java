import java.util.Scanner;

public class ParkingLotFee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input - step-1

            // Vehicle type input
        System.out.print("Enter vehicle type ('2' for Two-wheeler, '4' for Four-wheeler): ");
        int vehicleType = sc.nextInt();

            // Hours input
        System.out.print("Enter number of hours parked: ");
        float hours = sc.nextFloat();

        // output - step1
        System.out.println("Basic fare : ");
        basicFeeCalculatorDisplay(basicFeeCalculator(vehicleType, hours),vehicleType);

        //Input Step-2
        System.out.println("Enter vehicle entries ('2' for Two-wheeler, '4' for Four-wheeler) '0' to stop: ");
        float[] arr =multipleVehicleFare(sc,0,0,0,0,0);
        float totalMulti2W = arr[0];
        float totalMulti4W =arr[1];
        float aggregateSum = arr[2];
        float total2Wheeler=arr[3];
        float total4Wheeler=arr[4];

        //output- step-2 Multiple vehicles
        System.out.println("Aggregate data of multiple vehicles: ");
        displayMultiVehicleFare(totalMulti2W,totalMulti4W,aggregateSum);

        // output step-3 Enhanced Receipt
        displayEnhanced(aggregateSum,total2Wheeler,total4Wheeler);

        // Step-5 Zone input
        System.out.print("Enter zone (1 for General, 2 for Premium): ");
        int zone = sc.nextInt();

        // Step-4 Service call
        float serviceFee = parkingService(vehicleType, hours, zone);

        System.out.println("Parking Service Receipt:");
        basicFeeCalculatorDisplay(serviceFee, vehicleType);
    }

    // Step-1
    public static float basicFeeCalculator(int vehicleType, float hours){
        if(vehicleType == 2){
            if(hours<=1.0) return 20;
            return hours*20;
        }
        if(hours <= 1.0) return 40;
        return hours*40;
    }
    // step-2 & 3 multiple vehicle entries
    public static float[] multipleVehicleFare(Scanner sc,float totalMulti2W,float totalMulti4W,float aggregateSum,float total2Wheeler, float total4Wheeler){
    while(true){
        System.out.print("Enter vehicle type: ");
        int vehicle = sc.nextInt();
        if(vehicle==0) break;

        System.out.print("Enter zone (1 General / 2 Premium): ");
        int zone = sc.nextInt();

        System.out.print("Enter hour: ");
        float hourMulti= sc.nextFloat();

        float currentCharge = zoneFeeCalculator(vehicle, hourMulti, zone);

        if(vehicle == 2){
            totalMulti2W += currentCharge;
            total2Wheeler++;
        }
        if(vehicle == 4){
            totalMulti4W += currentCharge;
            total4Wheeler++;
        }

        aggregateSum += currentCharge;
    }
    return new float[]{totalMulti2W,totalMulti4W,aggregateSum,total2Wheeler,total4Wheeler};
}

    // Step-4 Parking Service
    public static float parkingService(int vehicleType, float hours, int zone){
        return zoneFeeCalculator(vehicleType, hours, zone);
    }

    // Step-5 Zone based calculator
    public static float zoneFeeCalculator(int vehicleType, float hours, int zone){
    float rate = 0;
    float min = 0;

    // General Zone
    if(zone == 1){
        if(vehicleType == 2){
            rate = 20;
            min = 20;
        } else {
            rate = 50;
            min = 20;
        }
    }

    // Premium Zone
    if(zone == 2){
        if(vehicleType == 2){
            rate = 40;
            min = 40;
        } else {
            rate = 100;
            min = 40;
        }
    }

    float fee = hours * rate;
    return Math.max(fee, min);   
}

    // step-2 multiple vehicle entries display
    public static void displayMultiVehicleFare(float totalMulti2W,float totalMulti4W,float aggregateSum){
       System.out.println("2 Wheeler vehicle total fare: "+totalMulti2W);
       System.out.println("4 Wheeler vehicle total fare: "+totalMulti4W);
       System.out.println("Total aggregate fare: "+aggregateSum);
    }

    // step-3 multiple vehicle enhanced entries display
    public static void displayEnhanced(float aggregateSum,float total2Wheeler, float total4Wheeler){
    float totalVehicles = total2Wheeler + total4Wheeler;

    System.out.println("Two-Wheeler count: "+total2Wheeler);
    System.out.println("Four-Wheeler count: "+total4Wheeler);
    System.out.println("Total vehicle count: "+totalVehicles);
    System.out.println("total fare recived: "+aggregateSum);

    if(totalVehicles > 0){
        System.out.println("Average fare per vehicle: "+(aggregateSum/totalVehicles));
    } else {
        System.out.println("Average fare per vehicle: 0");
    }
}
    public static void basicFeeCalculatorDisplay(float fee, int vehicleType) {
    String vehicle = (vehicleType == 2) ? "Two-wheeler" : "Four-wheeler";

    System.out.println("Vehicle: " + vehicle);
    System.out.println("Total Fare: " + fee);
    }

}