package GreedyApproch;

import java.util.*;

public class MinimumAbsoluteDifferencePairs { //o(nlogn)
    public static int minimumAbsoluteDifference(int [] a, int [] b){
        Arrays.sort(a);
        Arrays.sort(b);
        int minDiff = 0;
        for(int i = 0;i<a.length;i++){
           minDiff += Math.abs(a[i]-b[i]);
        }
        return minDiff;
    }
    public static void main(String[] args) {
        int [] a = {4,1,8,7};
        int [] b = {2,3,6,5};
        System.out.println("minimum absolute difference of pairs: " + minimumAbsoluteDifference(a,b));

    }
}
