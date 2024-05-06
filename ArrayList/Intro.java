package ArrayList;
import java.util.ArrayList;

public class Intro {
    public static void main(String[] args) {
        //array creation
        int [] arr = new int[5];

        //ArrayList
        ArrayList <Integer> list = new ArrayList<>();
        ArrayList <String> list1 = new ArrayList<>();
        ArrayList <Boolean> list2 = new ArrayList<>();
        ArrayList <Float> list3 = new ArrayList<>();
        ArrayList <Character> list4 = new ArrayList<>();
        ArrayList <Double> list5 = new ArrayList<>();


        // add element -- o(1)
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println("ArrayList: " + list);

        //get element - o(1)
        int element  = list.get(4); //o/p = 5
        System.out.println("get element at index 4: " + element);


        //remove element -0(n)
        list.remove(3);
        System.out.println("after removing element at index 3: " + list);


        //set element -0(n)
        list.set(2,14);
        System.out.println("after set element 14 at index 2 operation: " + list);

        //contains element -o(n)
        System.out.println("element 2 contains or not ? : " + list.contains(2));
        System.out.println("element 3 contains or not ? : " + list.contains(3));


        //another type of add function - 0(n)
        list.add(3,23);
        System.out.println("after adding 23 at index 3 again: " + list);

        //size method
        System.out.println("Size of ArrayList: " + list.size());

        //iterating through list
        System.out.print("printing using iteration: ");
        for(int i = 0;i<list.size();i++){
            System.out.print( list.get(i) + " ");
        }

    }
}
