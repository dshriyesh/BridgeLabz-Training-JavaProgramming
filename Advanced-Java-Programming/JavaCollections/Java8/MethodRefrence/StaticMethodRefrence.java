import java.util.Arrays;
import java.util.List;

public class StaticMethodRefrence {
     public static void printUpper(String s) {
        System.out.println(s.toUpperCase());
    }

    public static void main(String[] args) {
        List<String> list = Arrays.asList("java", "python", "go");

        // Lambda
        list.forEach(s -> printUpper(s));

        // Method Reference
        list.forEach(StaticMethodRefrence::printUpper);
    }
}
