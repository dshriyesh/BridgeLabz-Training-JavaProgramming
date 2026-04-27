import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        Set<String> treeSet = new TreeSet<>();
        treeSet.add("Apple");
        treeSet.add("Banana");
        treeSet.add("Cherry");

        // Enhanced for loop
        for (String fruit : treeSet) {
            System.out.println(fruit);
        }
    }
}
