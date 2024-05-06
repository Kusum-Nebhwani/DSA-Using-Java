package ArrayList;

import java.util.ArrayList;

public class SwapTwoNumbersInArrayList {
    public static void swappingTwoNumbersInArrayList(ArrayList <Integer> list, int idx1,int idx2){
        //swapping instructions
        int temp = list.get(idx1);
        list.set(idx1,list.get(idx2));
        list.set(idx2,temp);


    }
    public static void main(String[] args) {
        ArrayList<Integer> li = new ArrayList<>();

        li.add(2);
        li.add(7);
        li.add(90);
        li.add(4);
        li.add(23);
        li.add(34);
        System.out.println("before swapping ArrayList: " + li);
        swappingTwoNumbersInArrayList(li,2,4);
        System.out.println("after swapping ArrayList: " + li);





    }
}
