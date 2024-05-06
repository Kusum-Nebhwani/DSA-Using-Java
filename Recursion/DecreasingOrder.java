package Recursion;

import java.util.*;

public class DecreasingOrder {
    //through recursion
   public static void decreasingOrder(int n){
        if(n == 1){
            System.out.print(n);
            return;
        }

        System.out.print(n + " ");
        decreasingOrder(n-1);
    }


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("enter n: ");
        int n = s.nextInt();
        decreasingOrder(n);





    }
}
