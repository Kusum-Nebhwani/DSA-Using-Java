package GreedyApproch;

import java.util.*;

public class MaximumLengthChainOfPairs {
    public static int maximumChainLengthOfPairs(int [][] pairs){ //o(nlogn)
        Arrays.sort(pairs,Comparator.comparingDouble(o->o[1]));
        //sorting based on second number of pairs

        int chainLen = 1;
        int chainEnd = pairs[0][1]; //chain's end point or last selected pair's end

        for(int i = 1;i<pairs.length;i++){
            if(pairs[i][0] > chainEnd){
                chainLen++;
                chainEnd = pairs[i][1];
            }
        }
        return chainLen;
    }
    public static void main(String[] args) {
        int [][] pairs = {{5,24},{39,64},{5,28},{27,40},{50,90}};
        System.out.println("maximum chain length of pairs: "+maximumChainLengthOfPairs(pairs));
    }
}
