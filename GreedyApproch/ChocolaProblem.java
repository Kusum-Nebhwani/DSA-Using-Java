package GreedyApproch;

import java.util.Arrays;
import java.util.Comparator;

public class ChocolaProblem {
    public static void main(String[] args) {
        int n = 4;
        int m = 6;

        Integer [] costVer = {2,1,3,1,4};
        Integer [] costHor = {4,1,2};

        Arrays.sort(costHor, Comparator.reverseOrder());
        Arrays.sort(costVer, Comparator.reverseOrder());

        int h = 0,v =0;
        int hp = 1,vp = 1;
        int cost = 0;

        while(h<costHor.length && v<costVer.length){
            //vertical cost< horizontal cost
            if(costVer[v]<= costHor[h]){ //horizontal cut
                cost+=(costHor[h] * vp);
                hp++;
                h++;
            }else{ //vertical cut
                cost+=(costVer[v] * hp);
                vp++;
                v++;

            }
        }
        //left out horizontal or vertical cut
        while (h<costHor.length){
            cost+=(costHor[h] * vp);
            hp++;
            h++;
        }
        while (v<costVer.length){
            cost+=(costVer[v] * hp);
            vp++;
            v++;
        }
        System.out.println("min cost of cuts: " + cost);

    }
}
