package Recursion;

import java.util.Scanner;

public class NthFibonacciNumber {
    public static int nthFibonacciNumber(int n){
        if(n==0 || n==1){
            return n;
        }

        int fib_n = nthFibonacciNumber(n-1) + nthFibonacciNumber(n-2);
        return fib_n;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("enter n: ");
        int n = s.nextInt();
        int result = nthFibonacciNumber(n);
        System.out.println(result);
    }
}
