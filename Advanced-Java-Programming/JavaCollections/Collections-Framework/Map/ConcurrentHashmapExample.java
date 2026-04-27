import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashmapExample {
    public static void main(String[] args) {
         Map<Integer, String> concurrentHashMap = new ConcurrentHashMap<>();
        concurrentHashMap.put(1, "Apple");
        concurrentHashMap.put(2, "Banana");
        concurrentHashMap.put(3, "Cherry");

        for (Map.Entry<Integer, String> entry : concurrentHashMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }        
    }
}
