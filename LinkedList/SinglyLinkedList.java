package LinkedList;



public class SinglyLinkedList {
    public static  class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next  = null;
        }
    }
    public  static Node head;
    public static Node tail;
    public static int size;

    public void  addFirst(int data){
        //tc = O(1)
        //step -1 --> create a new node
        Node newNode = new Node(data);
        size++;

        if(head == null){
            head = tail = newNode;
            return;
        }
        //step2 --> add head to the next of new node
        newNode.next = head;
        //step3 --> head = new node
        head = newNode;
    }
    public void addLast(int data){
                                //tc = O(1)
        //step -1 --> create a new node
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        //step2 --> add  new node to the next of tail
        tail.next = newNode;
        //step3 --> tail = new node
        tail = newNode;
    }

    public void addAtSpecificPosition(int index,int data){
        //tc = O(n)
        if(index == 0){
            addFirst(data);
            return;
        }
        Node newNode= new Node(data);
        size++;
        Node temp = head;
        int i = 0;
        while(i<index-1){
            temp = temp.next;
            i++;
        }
        //i == idx-1 , temp->prev
        newNode.next = temp.next;
        temp.next = newNode;

    }

    public int removeFirst(){
        if(size == 0){
            System.out.println("ll is empty");
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
        size--;
        return val;

    }
    public int removeLast(){
        if(size == 0){
            System.out.println("ll is empty");
            return  Integer.MIN_VALUE;
        }
        if(size == 1){
            int val = tail.data;
            head = tail = null;
            size = 0;
            return val;
        }
        //prev == i == size - 2
        Node prev = head;
        for(int i = 0;i<size-2;i++){
            prev = prev.next;
        }
        int val = tail.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }
    public int iterativeSearch(int key){
        //tc = O(n)
        int i = 0;
        Node temp = head;
        while(temp!=null){
            if(temp.data == key){
                return i;
            }
            i++;
            temp = temp.next;
        }
        return -1;
    }
   public int helperRecursion(Node head,int key) {

       //base case
       if (head == null) {
           return -1;
       }
       if (head.data == key) {
           return 0;
       }
       int index = helperRecursion(head.next, key);
       if (index == -1) {
           return -1;
       } else {
           return index + 1;
       }
   }

    public int recursiveSearch(int key) {
        //tc = O(n) and sc = O(n)
        return helperRecursion(head, key);
    }

    public void printLinkedList(){
        //tc = O(n)
        Node temp = head;
        if(size == 0){
            System.out.println("LL is empty");
            return;
        }
        while(temp!=null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.print("null");
        System.out.println();
    }
    public  void reverseLinkedList(){
        //tc = O(n)
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;

        }
        head = prev;
    }

    public void deleteNthNodeFromLast(int n){
        int size = 0; //size of ll
        Node temp = head;

        while (temp!=null){
            temp = temp.next;
            size++;
        }

        if(n == size){
            head = head.next; //remove first node from last
        }

        int i = 1;
        int iToFind = size - n; // just before nth node
        Node prev = head;
        while(i< iToFind){
            prev = prev.next;
            i++;

        }
        prev.next = prev.next.next;
        return;
    }

    public boolean checkIfPalindromeOrNot(){
        if(head == null && head.next == null){
            return true;
        }

        //1.find mid
        Node midNode = findMidNode(head);

        //2.find reverse half
        Node prev = null ;
        Node curr = midNode;
        Node next;

        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }


        //3.check if left half == right half
        Node left = head; // left half head
        Node right = prev; //right half head

        while(right!=null){
            if(left.data != right.data){
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;

    }
    public Node findMidNode(Node head){
        //slow fast approach
       Node slow = head;
       Node fast = head;
        while(fast != null && fast.next!=null){
            slow = slow.next; //+1
            fast = fast.next.next;//+2
        }
        Node mid = slow;
        return  mid;
    }


    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();

        sll.addFirst(2);
        sll.addFirst(1);
        sll.addFirst(0);
        sll.addLast(4);
        sll.addAtSpecificPosition(2,2);

        System.out.println("before deletion: ");
        sll.printLinkedList();
        System.out.println("deleted element from first in a linked list: " + sll.removeFirst());
        System.out.println("after deletion: ");
        sll.printLinkedList();

        System.out.println("before deletion: ");
        sll.printLinkedList();
        System.out.println("deleted element from last in a linked list: " + sll.removeLast());
        System.out.println("after deletion: ");
        sll.printLinkedList();

        System.out.println("size of linked list: " + sll.size);

        System.out.println("key found at index: " + sll.iterativeSearch(2));
        System.out.println("key found at index: " + sll.recursiveSearch(3));

        System.out.println("reversed linked list: ");
        sll.reverseLinkedList();
        sll.printLinkedList();

        System.out.println("before deleting nth node from last: ");
        sll.printLinkedList();
        sll.deleteNthNodeFromLast(3);
        System.out.println("before deleting nth node from last: ");
        sll.printLinkedList();

        sll.reverseLinkedList();
        sll.printLinkedList();

        sll.addFirst(1);
        sll.addLast(2);
        sll.addLast(3);

        sll.printLinkedList();

        System.out.println("palindrome or not? " + sll.checkIfPalindromeOrNot());


        sll.addFirst(5);
        sll.addFirst(4);
        sll.addFirst(3);




        sll.printLinkedList();






    }
}
