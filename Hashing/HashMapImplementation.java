package Hashing;

import java.util.HashMap;

public class HashMapImplementation {
    public static void main(String[] args) {
        HashMap<String,Integer> hm = new HashMap<>();

        //put - O(1)
        hm.put("India",150);
        hm.put("China",234);
        hm.put("Nepal",24);
        hm.put("Indonesia",350);

        System.out.println(hm);

        //containsKey - O(1)
        System.out.println(hm.containsKey("Nepal"));
        System.out.println(hm.containsKey("bhutan"));

        //remove - O(1)
        hm.remove("Nepal");
        System.out.println("Pair removed");
        System.out.println(hm);


        //get - O(1)
        System.out.println(hm.get("China"));

        //size - O(1)
        System.out.println(hm.size());


        //isEmpty()
        System.out.println(hm.isEmpty());

        //clear
        hm.clear();
        System.out.println(hm);




    }
}
