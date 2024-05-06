package Queue;

import java.util.*;

public class DequeUsingCollectionFramework {
    public static void main(String[] args) {
        Deque<Integer> dq = new LinkedList<>();
        System.out.println("after insertion: ");
        dq.addFirst(1); //1
        dq.addFirst(4); //4,1
        dq.addFirst(7); //7,4,1
        dq.addLast(9); //7,4,1,9
        dq.addLast(11); //7,4,1,9,11
        dq.addFirst(3); //3,7,4,1,9,11
        System.out.println(dq);
        System.out.println("after deletion: ");
        dq.removeFirst(); //3
        dq.removeLast(); //11
        System.out.println(dq);
        System.out.println("first el: " + dq.getFirst()); //7
        System.out.println("last el: " + dq.getLast()); //9

    }
}
