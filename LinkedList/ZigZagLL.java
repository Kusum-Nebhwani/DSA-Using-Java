package LinkedList;

public class ZigZagLL extends SinglyLinkedList {
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

    public void zigZag(){
        //find mid
        Node slow = head;
        Node fast = head.next;

        while(fast!=null && fast.next!=null){
            slow = slow.next;  //+1
            fast = fast.next.next; //+2

        }
        Node midNode = slow;

        //find half reverse
        Node prev = null;
        Node curr = midNode.next;
        midNode.next = null;
        Node next;

        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;

        }


        //alternate merging --- zigzag merge
        Node leftHead = head;
        Node rightHead = prev;
        Node nextLeft;
        Node nextRight;

        while(leftHead!= null && rightHead!=null){
            nextLeft = leftHead.next;
            leftHead.next = rightHead;
            nextRight = rightHead.next;
            rightHead.next = nextLeft;
            leftHead = nextLeft;
            rightHead = nextRight;
        }





    }

    public static void main(String[] args) {
        ZigZagLL zl = new ZigZagLL();
        zl.addFirst(5);
        zl.addFirst(4);
        zl.addFirst(3);
        zl.addFirst(2);
        zl.addFirst(1);
        //1-2-3-4-5
        zl.printLinkedList();
        zl.zigZag();
        zl.printLinkedList();


    }
}
