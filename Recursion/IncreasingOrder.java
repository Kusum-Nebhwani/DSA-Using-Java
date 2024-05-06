package Recursion;
import java.util.*;

public class IncreasingOrder {

    public static void increasingOrder(int n){
        if(n == 1){
            System.out.print(n + " ");
            return;
        }
        increasingOrder(n-1);
        System.out.print(n + " ");


    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("enter n: ");
        int n = s.nextInt();
        increasingOrder(n);
    }
}
