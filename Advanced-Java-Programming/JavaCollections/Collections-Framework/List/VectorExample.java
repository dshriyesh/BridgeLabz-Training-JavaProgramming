import java.util.List;
import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        List<String> vector = new Vector<>();
        vector.add("Apple");
        vector.add("Banana");
        vector.add("Cherry");

        // Enhanced for loop
        for (String fruit : vector) {
            System.out.println(fruit);
        }
    }
}
