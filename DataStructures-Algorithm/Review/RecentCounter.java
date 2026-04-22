import java.util.LinkedList;
import java.util.Queue;

class RecentCounter {

    Queue<Integer> q = new LinkedList<>();

    public RecentCounter() {}

    public int ping(int t) {
        q.offer(t);

        while (!q.isEmpty() && q.peek() < t - 3000) {
            q.poll();
        }

        return q.size();
    }

    public static void main(String[] args) {

        RecentCounter rc = new RecentCounter();

        System.out.println(rc.ping(1));    
        System.out.println(rc.ping(100));  
        System.out.println(rc.ping(3001)); 
        System.out.println(rc.ping(3002)); 
    }
}