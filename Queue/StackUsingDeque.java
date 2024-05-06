package Queue;

import java.util.*;

public class StackUsingDeque {
    static class Stack{
        Deque <Integer> dq = new LinkedList<>();

        public void push(int data){
            dq.addLast(data);
        }
        public int pop(){
            return dq.removeLast();
        }
        public int peek(){
            return dq.getLast();
        }
    }
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(4);
        s.push(7);
        s.push(2);
        System.out.println("top: " + s.peek());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
    }
}
