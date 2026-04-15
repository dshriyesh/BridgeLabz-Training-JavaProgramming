// 1. Create a Book class with attributes title, author, and price. Provide both default
// and parameterized constructors.

import java.util.Scanner;

public class Book {
    private String title;
    private String author;
    private int price;

    // Parameterized Constructor
    public Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Default Constructor
    public Book() {
        System.out.println("Please give necessary details!!");
    }

    // Display book details
    public void display() {
        System.out.println("\nBook Details:");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char ch = 'y';

        while (ch == 'y' || ch == 'Y') {

            System.out.print("Enter title: ");
            String title = sc.nextLine();

            System.out.print("Enter author: ");
            String author = sc.nextLine();

            System.out.print("Enter price: ");
            int price = sc.nextInt();
            sc.nextLine();

            Book b1 = new Book(title, author, price);
            b1.display();

            System.out.println("\nWant to add more books (y/n): ");
            char ans = sc.next().charAt(0);
            sc.nextLine(); 

            if (ans == 'n' || ans == 'N') {
                break;
            }
            ch = ans;
        }

        sc.close();
    }
}