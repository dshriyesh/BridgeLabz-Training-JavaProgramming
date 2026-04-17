import java.util.*;

class Library {

    String name;
    ArrayList<Book> list;

    Library(String name) {
        this.name = name;
        this.list = new ArrayList<>();
    }
}

class Book {
    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    void display() {
        System.out.println("Book : " + title + " | Author : " + author);
    }
}

public class LibraryManagement {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Library> arr = new ArrayList<>();

        System.out.print("Do You Want To enter new library name(y/n) : ");
        char ch = sc.next().charAt(0);
        sc.nextLine();

        while (ch == 'y' || ch == 'Y') {

            createLibrary(sc, arr);

            System.out.print("Do You Want To enter new library name(y/n) : ");
            char newch = sc.next().charAt(0);
            sc.nextLine();

            if (newch == 'Y' || newch == 'y') {
                ch = newch;
            } else
                break;
        }

        System.out.print("Do You Want To perform any action ('search', 'delete', 'create'): ");
        String str = sc.next();
        sc.nextLine();

        if (str.equals("search")) {

            System.out.print("Enter library name : ");
            String lib = sc.nextLine();

            System.out.print("Enter book name : ");
            String b = sc.nextLine();

            searchBook(lib, b, arr);

        } else if (str.equals("delete")) {

            System.out.print("Enter library name : ");
            String lib = sc.nextLine();

            System.out.print("Enter book name : ");
            String b = sc.nextLine();

            deleteBook(lib, b, arr);

        } else if (str.equals("create")) {

            createLibrary(sc, arr);

        } else {
            System.out.println("Invalid action!!");
        }
    }

    // CREATE
    public static void createLibrary(Scanner sc, ArrayList<Library> arr) {

        System.out.print("Enter library name: ");
        String libraryName = sc.nextLine();

        Library l1 = new Library(libraryName);

        System.out.print("Do you want to enter new Books(y/n): ");
        char bookCh = sc.next().charAt(0);
        sc.nextLine();

        while (bookCh == 'Y' || bookCh == 'y') {

            System.out.print("Enter book name: ");
            String bookName = sc.nextLine();

            System.out.print("Enter author name: ");
            String author = sc.nextLine();

            Book book = new Book(bookName, author);
            l1.list.add(book);

            System.out.print("Do you want to enter new Books(y/n): ");
            char newch = sc.next().charAt(0);
            sc.nextLine();

            if (newch == 'Y' || newch == 'y')
                bookCh = newch;
            else
                break;
        }

        arr.add(l1);
        System.out.println("Library created successfully!");
    }

    // SEARCH
    public static void searchBook(String libraryName, String bookName, ArrayList<Library> arr) {

        boolean libraryFound = false;
        boolean bookFound = false;

        for (int i = 0; i < arr.size(); i++) {

            if (arr.get(i).name.equals(libraryName)) {
                libraryFound = true;

                for (int j = 0; j < arr.get(i).list.size(); j++) {

                    if (arr.get(i).list.get(j).title.equals(bookName)) {
                        arr.get(i).list.get(j).display();
                        bookFound = true;
                        break;
                    }
                }

                if (!bookFound) {
                    System.out.println("No such book found!");
                }
                break;
            }
        }

        if (!libraryFound) {
            System.out.println("No such library found!");
        }
    }

    // DELETE
    public static void deleteBook(String libraryName, String bookName, ArrayList<Library> arr) {

        boolean libraryFound = false;
        boolean bookFound = false;

        for (int i = 0; i < arr.size(); i++) {

            if (arr.get(i).name.equals(libraryName)) {
                libraryFound = true;

                for (int j = 0; j < arr.get(i).list.size(); j++) {

                    if (arr.get(i).list.get(j).title.equals(bookName)) {
                        arr.get(i).list.remove(j);
                        System.out.println("Book deleted successfully!");
                        bookFound = true;
                        break;
                    }
                }

                if (!bookFound) {
                    System.out.println("No such book found!");
                }
                break;
            }
        }

        if (!libraryFound) {
            System.out.println("No such library found!");
        }
    }
}