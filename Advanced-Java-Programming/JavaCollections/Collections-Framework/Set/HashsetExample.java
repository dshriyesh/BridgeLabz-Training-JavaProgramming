import java.util.HashSet;
import java.util.Set;

public class HashsetExample {
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Cherry");

        // Enhanced for loop
        for (String fruit : hashSet) {
            System.out.println(fruit);
        }
    }
}
