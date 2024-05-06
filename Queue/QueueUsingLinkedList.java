package Queue;

public class QueueUsingLinkedList {
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;

        }
    }
    static class Queue{
        static Node head = null; //front
        static Node tail = null; //rear

        public static boolean isEmpty(){
            return head == null && tail == null;
        }

        public static void enqueue(int data){
            Node newNode  = new Node(data);
            if(head == null){
                head = tail = newNode;
                return;
            }
            tail.next = newNode;
            tail = newNode;
        }

        public static int dequeue(){
            if(isEmpty()){
                System.out.println("empty queue!");
                return -1;
            }
            int front = head.data;
            //removing single element
            if(tail == head){
                tail = head = null;
            }
            else{
                head = head.next;
            }
            return front;
        }

        public static int peek(){
            if(isEmpty()){
                System.out.println("empty queue!");
                return -1;
            }
            return head.data;
        }
        public static void printQueue(Queue q) {
            while (!q.isEmpty()) {
                System.out.println(q.peek());
                q.dequeue();
            }
        }


    }
    public static void main(String[] args) {
       Queue q = new Queue();
       q.enqueue(2);
       q.enqueue(5);
       q.enqueue(6);
       q.printQueue(q);

    }
}
