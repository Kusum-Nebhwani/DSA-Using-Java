package Hashing;

import java.util.*;

public class IterationOnHashMap {
    public static void main(String[] args) {
        HashMap<String,Integer> hm = new HashMap<>();


        hm.put("India",150);
        hm.put("China",234);
        hm.put("Nepal",24);
        hm.put("Indonesia",350);

        Set<String> keys = hm.keySet();

        for (String k:
             keys) {
            System.out.println("key = "+ k + ",value = " + hm.get(k));

        }
    }
}
