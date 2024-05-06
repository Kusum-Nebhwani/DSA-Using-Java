package Queue;

import java.util.*;

public class QueueUsingCollectionFramework {
    public static void main(String[] args) {
        Queue <Integer> q = new LinkedList<>(); // or new ArrayDeque<>()
        q.add(2);
        q.add(9);
        q.add(7);
        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }

    }
}
