import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CheckedExceptionDemo {

    //IOException
    public static void readFile() throws IOException {
        FileReader fr = new FileReader("file.txt");
        System.out.println("File opened successfully");
        fr.close();
    }

    //SQLException
    public static void connectDB() throws SQLException {
        Connection con = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/test", "root", "1234");
        System.out.println("Database connected successfully");
    }

    //ClassNotFoundException
    public static void loadClass() throws ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        System.out.println("Driver class loaded");
    }

    public static void main(String[] args) {

        // ClassNotFoundException
        try {
            loadClass();
        } catch (ClassNotFoundException e) {
            System.out.println("ClassNotFoundException handled");
        }

        // IOException
        try {
            readFile();
        } catch (IOException e) {
            System.out.println("IOException handled");
        }

        // SQLException
        try {
            connectDB();
        } catch (SQLException e) {
            System.out.println("SQLException handled");
        }

        System.out.println("All checked exceptions handled properly");
    }
}