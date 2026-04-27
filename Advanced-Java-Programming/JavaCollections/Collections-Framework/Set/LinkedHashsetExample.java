import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashsetExample {
    public static void main(String[] args) {
        Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("Apple");
        linkedHashSet.add("Banana");
        linkedHashSet.add("Cherry");

        // Enhanced for loop
        for (String fruit : linkedHashSet) {
            System.out.println(fruit);
        }
    }    
}
