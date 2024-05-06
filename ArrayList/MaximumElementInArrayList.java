package ArrayList;

import java.util.*;

public class MaximumElementInArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> li = new ArrayList<>();

        li.add(2);
        li.add(7);
        li.add(90);
        li.add(4);
        li.add(23);
        li.add(34);
        System.out.println("ArrayList: " + li);

        int max = Integer.MIN_VALUE;
        for(int i = 0;i< li.size();i++){
          max = Math.max(max,li.get(i));
        }

        System.out.println("Maximum element: " + max);
    }
}
