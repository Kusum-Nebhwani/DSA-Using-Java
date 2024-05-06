package LinkedList;

public class CircularLinkedList {


    public class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }

    }
    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = newNode;
            tail = newNode;
            newNode.next = head;

            return;
        }
        newNode.next = tail.next;
        tail.next = newNode;
        head = newNode;
    }

    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = newNode;
            tail = newNode;
            newNode.next = newNode;
            return;
        }
        newNode.next = tail.next;
        tail.next = newNode;
        tail=newNode;

    }
    public int removeFirst(){
        Node temp = head;
        if(size == 0){
            System.out.println("circular linked list is empty");
            return Integer.MIN_VALUE;
        }
        if(head.next == head){
            int val = head.data;
            head = null;
            tail = null;
            size = 0;
            return val;
        }

        size--;
        int val = head.data;
        while(temp.next!=head){
            temp = temp.next;
        }
        temp.next = head.next;
        head = head.next;
        return val;

    }
    public int removeLast(){
       Node temp = head;
       Node preTemp = null;

        if(head == null){
            System.out.println("circular linked list is empty");
            return Integer.MIN_VALUE;
        }
        if(head.next == head){
            int val = head.data;
            head = null;
            size = 0;
            tail = null;
            return val;
        }
        while(temp.next!=head){
            preTemp = temp;
            temp = temp.next;
        }
        int val = preTemp.data;
        preTemp.next = temp.next;
        size--;
        return val;
    }

    public void printCircularLinkedList(){
        Node temp = head;
        if(head ==  null){
            System.out.println("circular linked list is empty!");
            return;
        }
        do{
            System.out.print(temp.data + "->");
            temp = temp.next;
        }while(temp.next!=head.next);

        System.out.println("head");
    }

    public static void main(String[] args) {
        CircularLinkedList cll = new CircularLinkedList();
        cll.addLast(3);
        cll.addFirst(4);
        cll.addLast(5);
        cll.addFirst(2);
        cll.printCircularLinkedList();
        System.out.println("size of cll: " + cll.size);
        System.out.println("removed item: " + cll.removeFirst());
        System.out.println("removed item: " + cll.removeLast());
        System.out.println("removed item: " + cll.removeLast());


        cll.printCircularLinkedList();


    }
}
