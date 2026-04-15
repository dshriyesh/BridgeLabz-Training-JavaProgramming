
import java.util.ArrayList;
import java.util.Scanner;

// Hotel Booking System: Create a HotelBooking class with attributes guestName,
// roomType, and nights. Use default, parameterized, and copy constructors to initialize
// bookings.

public class HotelBooking {
    String guestName;
    String roomType;
    int nights;
    public HotelBooking() {
        guestName="no guest name entered";
    }

    public HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    HotelBooking(HotelBooking hb){
        this.guestName=hb.guestName;
        this.roomType=hb.roomType;
        this.nights=hb.nights;
    }

    // displaying guest 
    void displayInde(){
        System.out.println(guestName+" booked "+roomType+" for "+nights+" nights");
    }
    
    public static void main(String[] args) {
        System.out.print("Do you want to add new guest details(y/n): ");
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);

        ArrayList<HotelBooking> list = new ArrayList<>();
        while(ch=='Y'||ch=='y'){
            System.out.print("Enter guest name: ");
            sc.nextLine();
            String name = sc.nextLine();

            System.out.print("Enter room type: ");
            String roomType = sc.nextLine();

            System.out.print("Enter number of nights to stay: ");
            int nights = sc.nextInt();

            HotelBooking obj1 = new HotelBooking(name, roomType, nights);
            sc.nextLine();
            obj1.displayInde();
            list.add(obj1);

            System.out.print("Do you want to add new guest details(y/n): ");
            char newch = sc.next().charAt(0);

            if(newch=='n'||newch=='N') break;
            ch=newch;
        }
        System.out.print("Do you want to add existing guest detail(y/n): ");
        char newch = sc.next().charAt(0);
        if(newch=='y'|| newch=='Y'){
            System.out.println("Enter guest name: ");
            sc.nextLine();
            String exguest=sc.nextLine();

            for(int i=0;i<list.size();i++){
                if(list.get(i).guestName.equals(exguest)){
                    HotelBooking newobj = new HotelBooking(list.get(i));
                    newobj.displayInde();
                }
            }
        }
        else{
            HotelBooking obj1 = new HotelBooking();
        }
    }
}
