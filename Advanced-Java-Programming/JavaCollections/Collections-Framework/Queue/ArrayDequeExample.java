import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeExample {
    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<>();
        deque.add("Apple");
        deque.add("Banana");
        deque.add("Cherry");

        // Enhanced for loop
        for (String fruit : deque) {
            System.out.println(fruit);
        }
    }
}
