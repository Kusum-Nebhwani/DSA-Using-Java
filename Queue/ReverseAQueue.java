package Queue;

import java.util.*;

public class ReverseAQueue {
    public static void reverse(Queue <Integer> q){
        Stack<Integer> s = new Stack<>();
        //removing from queue and adding to stack
        while(!q.isEmpty()){
            s.push(q.remove());
        }
        //removing from stack and adding to queue
        while(!s.isEmpty()){
            q.add(s.pop());
        }
    }
    public static void main(String[] args) {
        Queue <Integer> q  = new LinkedList<>();
        q.add(3);
        q.add(8);
        q.add(2);
        q.add(5);
        q.add(6);
        //3,8,2,5,6

        reverse(q);
        //6,5,2,8,3
        //printing reversed queue
        while(!q.isEmpty()){
            System.out.print(q.peek() + " ");
            q.remove();
        }
    }
}
