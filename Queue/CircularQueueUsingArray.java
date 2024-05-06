package Queue;

public class CircularQueueUsingArray {
    static  class Queue {
        static int circularQueue[];
        static int size;
        static int rear;
        static int front;

        Queue(int n) {
            circularQueue = new int[n];
            size = n;
            rear = -1; //queue is empty
            front = -1;
        }

        //isEmpty()
        public static boolean isEmpty() {
            return rear == -1 && front == -1;
        }
        public static boolean isFull() {
            return (rear+1)%size == front;
        }


        //add
        public static void enqueue(int data) {
            if (isFull()) { //queue is full
                System.out.println("Queue is full!");
                return;
            }
            //add 1st element
            if(front == -1){
                front = 0;
            }
            rear = (rear + 1)  % size;
            circularQueue[rear] = data;
        }

        //remove
        public static int dequeue() {
            if (isEmpty()) {
                System.out.println("Queue is empty!");
                return -1;
            }

            int result = circularQueue[front];
            //remove last element
            if(rear == front){
                rear = front = -1;
            }
            else{
                front = (front + 1)  % size;
            }
            return result;
        }

        //peek
        public static int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty!");
                return -1;
            }

            return circularQueue[front];
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
        System.out.println("removed: " + q.dequeue());
        q.enqueue(6);
        q.printQueue(q);


    }

}
