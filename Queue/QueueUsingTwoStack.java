package Queue;

import java.util.Stack;

public class QueueUsingTwoStack {
    static class QueuePush{
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();

        public static boolean isEmpty(){
            return s1.isEmpty();
        }

        public static int peek(){ //O(1)
             if(s1.isEmpty()){
                System.out.println("queue is empty!");
                return -1;
            }
            return s1.peek();
        }

        public static void add(int data){ //O(n)
            while(!s1.isEmpty()){
                    s2.push(s1.pop());
                }
                s1.push(data);

            while(!s2.isEmpty()){
                s1.push(s2.pop());
            }

        }

        public static int remove(){ //O(1)
            if(s1.isEmpty()){
                System.out.println("queue is empty!");
                return -1;
            }

            return s1.pop();
        }

    }
    static class QueuePop {
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();

        public static boolean isEmpty() {

            return s1.isEmpty() && s2.isEmpty();
        }

        public static void add(int data) {
            s1.push(data);
        }

        public static int remove() {
            if (isEmpty()) {
                System.out.println("empty queue!");
                return -1;
            }
            int front = -1;
            //case 1
            if (s2.isEmpty()) {
                while (!s1.isEmpty()) {
                    front = s1.pop();
                    if (s1.isEmpty()) {
                        break;
                    }

                    s2.push(front);
                }
            }




            return front;
        }

        public static int peek(){
            if(isEmpty()){
                System.out.println("empty queue!");
            }
            int front = -1;
            if (s2.isEmpty()) {
                while (!s1.isEmpty()) {
                    front = s1.pop();


                    s2.push(front);
                }
            }
            return front;
        }
    }



    public static void main(String[] args) {
        QueuePush q = new QueuePush();
        QueuePop q1 = new QueuePop();

        System.out.println("queue from push O(n): ");
        q.add(3);
        q.add(5);
        q.add(6);
        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
        System.out.println("queue from pop O(n): ");
        q1.add(3);
        q1.add(5);
        q1.add(6);
        while (!q1.isEmpty()) {
            System.out.println(q1.peek());
            q1.remove();
        }



    }
}
