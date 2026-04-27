import java.util.Map;
import java.util.TreeMap;

public class Treemap {
    public static void main(String[] args) {
         Map<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(3, "Cherry");
        treeMap.put(1, "Apple");
        treeMap.put(2, "Banana");

        for (Map.Entry<Integer, String> entry : treeMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}
