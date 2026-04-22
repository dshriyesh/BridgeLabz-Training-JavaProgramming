import java.util.Collections;
import java.util.PriorityQueue;

public class KLargest {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int[] arr = {3,2,1,5,6,4};
        int k=2;
        for(int num : arr){
            pq.add(num);
        }

        for(int i = 1; i < k; i++){
            pq.poll();
        }

        System.out.println("Kth largest is: "+pq.peek());
    }
}
