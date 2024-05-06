package LinkedList;

public class DoublyLinkedList {
    public class Node{
        int data;
        Node prev;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }

    }
    public static Node head;
    public static Node tail;
    public static int size;
    //add
    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;

        if(head == null){
            head = tail =  newNode;
            return;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;

    }
    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;

        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }
    public void addAtSpecificPosition(int index, int data){
        if(index == 0){
           addFirst(data);
           return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;
        while(i<index-1){
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        newNode.prev = temp;
        temp.next = newNode;



    }


    //remove
    public int removeFirst(){
        if(size == 0){
            System.out.println("dll is empty!");
            return Integer.MIN_VALUE;
        }
        if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        head.prev = null;
        size--;
        return val;
    }
    public int removeLast(){
        if(size==0){
            System.out.println("dll is empty!");
            return Integer.MIN_VALUE;
        }
        if(size == 1){
            int val = tail.data;
            head = tail = null;
            size = 0;
            return val;
        }

        int val = tail.data;
        tail.prev = null;
        tail = tail.next;
        size--;
        return val;
    }
    public void reverse(){
        Node curr = head;
        Node prev = null;
        Node next;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            curr.prev = next;
            prev = curr;
            curr = next;
        }
        head = prev;
    }
    public void printDoublyLinkedList(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data + "<->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.addFirst(4);
        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);

        dll.addLast(5);
        dll.addLast(6);
        dll.printDoublyLinkedList();
        System.out.println("size of doubly linked list: " + dll.size);
        System.out.println("removed item: " + dll.removeFirst());
        System.out.println("removed item: " + dll.removeLast());
        dll.printDoublyLinkedList();
        System.out.println("after removing updated size of doubly linked list: " + dll.size);

        dll.addAtSpecificPosition(3,7);
        dll.printDoublyLinkedList();
        System.out.println("after reversing doubly linked list: ");
        dll.reverse();
        dll.printDoublyLinkedList();

    }
}
