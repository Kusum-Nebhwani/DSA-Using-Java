package GreedyApproch;

import java.util.*;

public class FractionalKnapsack {
    public static int maximumTotalValue(int [] weight,int [] value,int W){
        double [][] ratio = new double[value.length][2];
        for(int i = 0;i<value.length;i++){
            ratio[i][0] =  i; //idx
            ratio[i][1] = value[i]/(double)weight[i]; //ratio
        }

        //ascending order sort
        Arrays.sort(ratio,Comparator.comparingDouble(o->o[1]));

        int capacity = W;
        int finalValue = 0;
        for(int i = ratio.length-1;i>=0;i--){
            int idx = (int)ratio[i][0];
            if(capacity>=weight[idx]){
                //include full item
                finalValue += value[idx];
                capacity -= weight[idx];

            }else{
                //include fractional item
                finalValue += (ratio[i][1] * capacity);
                capacity = 0;
                break;
            }
        }
        return finalValue;
    }

    public static void main(String[] args) {
        int [] value = {60,100,120};
        int [] weight = {10,20,30};
        int W = 50;

        int finalValue = maximumTotalValue(weight,value,W);
        System.out.println(finalValue);
    }
}
