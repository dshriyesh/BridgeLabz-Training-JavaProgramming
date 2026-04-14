// Problem Statement: Write a program to create a Book class with attributes title,
// author, and price. Add a method to display the book details.

import java.util.Scanner;

public class Book {

    String title;
    String author;
    int price;

    Book(String title,String author,int price){
        this.title=title;
        this.author=author;
        this.price=price;
    }

    void display(){
        System.out.println("Title of book is :"+title);
        System.out.println("Author of book is: "+author);
        System.out.println("PRice of book is: "+price);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter details: ");
        System.out.print("Enter title: ");
        String title = sc.nextLine();

        System.out.print("Enter Author: ");
        String author = sc.nextLine();

        System.out.print("Enter price: ");
        int price = sc.nextInt();

        Book obj = new Book(title, author, price);
        obj.display();
    }
}
