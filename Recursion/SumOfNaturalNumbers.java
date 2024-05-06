package Recursion;

import java.util.Scanner;


// time complexity --> O(n) and space complexity --> O(n)

public class SumOfNaturalNumbers {
    public static int sumOfNaturalNumbers(int n){
        if(n == 0){
            return 0;
        }
        return n + sumOfNaturalNumbers(n-1);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("enter n: ");
        int n = s.nextInt();
        int sum = sumOfNaturalNumbers(n);
        System.out.println("sum: " + sum);

    }
}
