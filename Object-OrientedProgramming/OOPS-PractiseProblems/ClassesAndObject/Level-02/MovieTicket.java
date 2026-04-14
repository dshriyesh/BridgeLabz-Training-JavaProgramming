import java.util.Scanner;

public class MovieTicket {
    String movieName;
    int seatNumber;
    int price;

    // Method to book ticket
    void bookTicket(String movieName, int seatNumber, int price) {
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.price = price;

        System.out.println("Ticket booked successfully!");
    }

    // Method to display details
    void displayTicket() {
        System.out.println("\n--- Ticket Details ---");
        System.out.println("Movie Name: " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        MovieTicket ticket = new MovieTicket();

        // Booking
        System.out.print("Enter movie name: ");
        String name = sc.nextLine();

        System.out.print("Enter seat number: ");
        int seat = sc.nextInt();

        System.out.print("Enter ticket price: ");
        int price = sc.nextInt();

        ticket.bookTicket(name, seat, price);

        // Display
        ticket.displayTicket();

        sc.close();
    }
}