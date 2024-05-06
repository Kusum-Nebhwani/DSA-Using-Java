package ArrayList;

import java.util.ArrayList;

public class ContainerWithMaximumWater {
    //brute force approach
    //tc = O(n^2)
    public static int storedWater(ArrayList<Integer> height){


        int maxWater = 0;

        for(int i = 0;i<height.size();i++){
            for(int j = i+1;j<height.size();j++){
                int h = Math.min(height.get(i),height.get(j)); // water height  (min of both lines
                int w = j-i; //width of container (i2-i1)
                int currWater = h*w;
                maxWater = Math.max(maxWater,currWater);

            }
        }
        return maxWater;

    }
    public static void main(String[] args) {
        ArrayList <Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

        System.out.println("maximum water stored: " + storedWater(height));


    }
}
