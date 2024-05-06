package GreedyApproch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class IndianCoins {
    public static void minimumNoOfCoinsToMakeChange(int amount,Integer[] coins){
        Arrays.sort(coins, Comparator.reverseOrder());

        int countOfCoins = 0;
        ArrayList <Integer> ans = new ArrayList<>();
        for(int i = 0;i<coins.length;i++) {
            if(coins[i]<=amount){
                while(coins[i]<=amount){
                    countOfCoins++;
                    ans.add(coins[i]);
                    amount -= coins[i];
                }
            }

        }
        System.out.println("total (min) no of coins used: "+countOfCoins);
        System.out.print("coins: ");
        for(int i=0;i<ans.size();i++){
            System.out.print(ans.get(i) + " ");
        }
        System.out.println();



    }
    public static void main(String[] args) {
        Integer [] coins = {1,2,5,10,20,50,100,500,200};
        int amount  =  121;
        minimumNoOfCoinsToMakeChange(amount,coins);

    }
}
