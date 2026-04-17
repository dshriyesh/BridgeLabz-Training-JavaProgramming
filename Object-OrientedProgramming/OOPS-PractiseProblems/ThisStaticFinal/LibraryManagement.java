class Book{
    static String libraryName="Central library";
    String title;
    String author;
    final int  isbn;

    Book (String title,String author,int isbn){
        this.title = title;
        this.author = author;
        this.isbn=isbn;
    }

    static void displayLibraryName(){
        System.out.println("Library name is: "+libraryName);
    }

    void displayDetails(){
        System.out.println("Title is : "+title);
        System.out.println("Author is : "+author);
        System.out.println("Book id is : "+isbn);
        System.out.println();
    }
}

public class LibraryManagement {
    public static void main(String[] args) {
        Book b1 = new Book("Harry potter", "J.K. Rowling", 2);
        if(b1 instanceof Book){
            b1.displayDetails();
            b1.displayLibraryName();
        }
    }
}
