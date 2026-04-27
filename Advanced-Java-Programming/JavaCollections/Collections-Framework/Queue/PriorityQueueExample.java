import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        Queue<String> priorityQueue = new PriorityQueue<>();
        priorityQueue.add("Apple");
        priorityQueue.add("Banana");
        priorityQueue.add("Cherry");

        // Enhanced for loop
        for (String fruit : priorityQueue) {
            System.out.println(fruit);
        }
    }
}
