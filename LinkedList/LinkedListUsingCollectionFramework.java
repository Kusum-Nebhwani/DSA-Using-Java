package LinkedList;
import java.util.LinkedList;
public class LinkedListUsingCollectionFramework {
    public static void main(String[] args) {
        //create
        LinkedList<Integer> ll = new LinkedList<>();
        //add
        ll.addFirst(0);
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        //print
        System.out.println("Linked List: " + ll);
        //remove
        System.out.println("removed item: " + ll.removeFirst());
        System.out.println("removed item: " + ll.removeLast());
        System.out.println("after removing: "+ll);

    }
}
