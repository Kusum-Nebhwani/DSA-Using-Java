package Recursion;
import java.util.*;

public class Factorial {

    public static int factorialCalculator(int n){
        if(n == 0){
            return 1;
        }
        return n * factorialCalculator(n-1);
    }


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("enter n: ");
        int n = s.nextInt();

       int factorial =  factorialCalculator(n);
        System.out.println("factorial of " + n + " is " +factorial);
    }
}
