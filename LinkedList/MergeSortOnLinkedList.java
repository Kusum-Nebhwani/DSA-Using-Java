package LinkedList;

public class MergeSortOnLinkedList {

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
    private Node merge(Node head1,Node head2){

        Node mergedLL = new Node(-1);
        Node temp = mergedLL;
        while(head1 !=null && head2 !=null){
            if(head1.data <= head2.data){
                temp.next = head1;
                head1 = head1.next;
            }
            else{
                temp.next = head2;
                head2 = head2.next;
            }
            temp = temp.next;
        }

        //if my left part is not completed
        while (head1!=null){
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }

        //if my right part is not completed
        while (head2!=null){
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }

        return mergedLL.next;
    }

    public Node getMidNode() {
        Node slow = head;
        Node fast = head.next;
        while(fast!=null && fast.next!=null){
            slow = slow.next; //+1
            fast = fast.next.next; //+2
        }
        return slow; //mid node
    }

    public Node mergeSort(Node head){
        //base case
        if(head == null || head.next == null){
            return head;
        }
        //find mid
        Node mid = getMidNode();

        //left & right merge sort
        Node rightHead = mid.next;


        mid.next = null;

       Node newLeft = mergeSort(head); //left part
       Node newRight= mergeSort(rightHead); //right part

        //merge
        return merge(newLeft,newRight);

    }

    public static void main(String[] args) {
        MergeSortOnLinkedList ms = new MergeSortOnLinkedList();

    }
}
