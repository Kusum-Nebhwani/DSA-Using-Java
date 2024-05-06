package Queue;
import java.util.*;

public class QueueUsingDeque {
    static class Queue{
        Deque <Integer> dq = new LinkedList<>();

        public void add(int data){
            dq.addLast(data);
        }
        public int remove(){
            return dq.removeFirst();
        }
        public int peek(){
            return dq.getFirst();
        }

    }
    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(3);
        q.add(6);
        q.add(8);
        System.out.println("front: " + q.peek());
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());

    }
}
