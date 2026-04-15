// Library Book System: Create a Book class with attributes title, author, price, and
// availability. Implement a method to borrow a book.

import java.util.ArrayList;
import java.util.Scanner;

class Book {
    String title;
    String author;
    double price;
    boolean available;

    
    Book() {
        title = "Unknown";
        author = "Unknown";
        price = 0.0;
        available = true;
    }

    
    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.available = true;
    }

    // Method to borrow book
    void borrowBook() {
        if (available) {
            available = false;
            System.out.println("Book \"" + title + "\" has been borrowed.");
        } else {
            System.out.println("Book \"" + title + "\" is already borrowed.");
        }
    }

    // Display book details
    void display() {
        System.out.println("Title: " + title +
                ", Author: " + author +
                ", Price: " + price +
                ", Available: " + available);
    }
}

public class LibrarySystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();

        // Adding books
        System.out.print("Enter number of books: ");
        int n = sc.nextInt();
        sc.nextLine(); // fix buffer

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for book " + (i + 1));

            System.out.print("Title: ");
            String title = sc.nextLine();

            System.out.print("Author: ");
            String author = sc.nextLine();

            System.out.print("Price: ");
            double price = sc.nextDouble();
            sc.nextLine();

            books.add(new Book(title, author, price));
        }

        // Display all books
        System.out.println("\n--- Book List ---");
        for (Book b : books) {
            b.display();
        }

        // Borrow a book
        System.out.print("\nEnter book title to borrow: ");
        String search = sc.nextLine();

        boolean found = false;

        for (Book b : books) {
            if (b.title.equalsIgnoreCase(search)) {
                b.borrowBook();
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Book not found.");
        }

        sc.close();
    }
}