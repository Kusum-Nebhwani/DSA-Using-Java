package ArrayList;

import java.util.ArrayList;

public class MultiDimensionalArrayList {
    public static void main(String[] args) {

        // 3D arraylist
        ArrayList<ArrayList> mainList = new ArrayList<>();
        ArrayList<Integer> l1 = new ArrayList<>();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add(5);
        mainList.add(l1);
        ArrayList<Integer> l2 = new ArrayList<>();
        l1.add(2);
        l1.add(4);
        l1.add(6);
        l1.add(8);
        l1.add(10);
        mainList.add(l2);
        ArrayList<Integer> l3 = new ArrayList<>();
        l1.add(3);
        l1.add(6);
        l1.add(9);
        l1.add(12);
        l1.add(15);
        mainList.add(l3);


        //printing 3D arraylist
        for(int i = 0;i<mainList.size();i++)
        {
            ArrayList <Integer> currList = mainList.get(i); //retrieved list
            //for iterating through current list
            for(int j = 0;j<currList.size();j++)
            {
                System.out.print(currList.get(j) + " ");

            }

            System.out.println();


        }



    }
}
