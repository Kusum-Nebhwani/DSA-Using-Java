package Queue;

public class QueueUsingArray {
    static  class Queue {
        static int queue[];
        static int size;
        static int rear;

        Queue(int n) {
            queue = new int[n];
            size = n;
            rear = -1; //queue is empty
        }

        //isEmpty()
        public static boolean isEmpty() {
            return rear == -1;
        }

        //add
        public static void enqueue(int data) {
            if (rear == size - 1) { //queue is full
                System.out.println("Queue is full!");
                return;
            }
            rear = rear + 1;
            queue[rear] = data;
        }

        //remove
        public static int dequeue() {
            if (isEmpty()) {
                System.out.println("Queue is empty!");
                return -1;
            }
            int front = queue[0];
            for (int i = 0; i<rear; i++) {
                queue[i] = queue[i + 1];
            }
            rear = rear - 1;
            return front;
        }

        //peek
        public static int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty!");
                return -1;
            }
            int front = queue[0];
            return front;
        }

        public static void printQueue(Queue q) {
            while (!q.isEmpty()) {
                System.out.println(q.peek());
                q.dequeue();
            }
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.enqueue(4);
        q.enqueue(5);
        q.enqueue(2);
        q.printQueue(q);


    }
}
