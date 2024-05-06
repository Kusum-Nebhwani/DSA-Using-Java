package Heaps;
import java.util.PriorityQueue;
public class Priority_Queue {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue();


        //add --> O(log n)
        pq.add(1);
        pq.add(7);
        pq.add(4);
        pq.add(3);


        while(!pq.isEmpty()){
            //peek --> O(1)
            System.out.print(pq.peek() + " ");
            //remove --> O(log n)
            pq.remove();
        }


    }
}
