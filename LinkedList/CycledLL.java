package LinkedList;

public class CycledLL {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;

    public static boolean isCycleExistOrNot(){  ////floyd's cycle finding algo
        Node slow = head;
        Node fast = head;

        while(fast.next!=null && fast!=null){
            slow = slow.next; //+1
            fast = fast.next.next; //+2
            if(slow == fast){
                return true; //cycle exist
            }
        }
        return false; //cycle doesn't exist
    }

    public static void removeCycle(){
        //detect cycle
        Node slow = head;
        Node fast = head;
        boolean cycle = false;
        while(fast.next!=null && fast!= null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                cycle = true;
                break;
            }

        }
        if(cycle == false){
            return;
        }

        //find meeting point

        slow = head;
        Node prev = null;
        while (slow != fast){
            prev = fast; // last node
            slow = slow.next; //+1
            fast = fast.next; //+1
        }

        //remove cycle --> last.next=null
        prev.next = null;
    }

    public static void main(String[] args) {
       head = new Node(1);
       head.next = new Node(2);
       head.next.next = new Node(3);
       head.next.next.next = new Node(4);
       head.next.next.next.next = new Node(5);
       head.next.next.next.next.next= head.next.next;

       //1-2-3-4-5-3 --->linked list
        System.out.println("cycle or not: " + isCycleExistOrNot());
        removeCycle();
        System.out.println("cycle or not: " + isCycleExistOrNot());



    }
}
