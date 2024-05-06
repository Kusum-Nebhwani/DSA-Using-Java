package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class SortingInArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> li = new ArrayList<>();

        li.add(2);
        li.add(7);
        li.add(90);
        li.add(4);
        li.add(23);
        li.add(34);
        System.out.println("before sorting ArrayList: " + li);
        Collections.sort(li); //-->ascending order
        System.out.println("after sorting in ascending fashion ArrayList: " + li);
        Collections.sort(li,Collections.reverseOrder()); //-->descending order
        System.out.println("after sorting in descending fashion ArrayList: " + li);

    }
}
