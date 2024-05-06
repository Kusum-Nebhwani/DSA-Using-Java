package Recursion;

public class XToThePowerN {
    public static int xToThePowerN(int x,int n){ // O(n)
        if(n==0){
            return 1;

        }
        return x * xToThePowerN(x,n-1);

    }
    public static int xToThePowerNOptimised(int x,int n){ //o(log n)
        if(n==0){
            return 1;
        }
        int halfPower = xToThePowerNOptimised(x,n/2);
        int halfPowerSq =  halfPower * halfPower;
        //n is odd
        if(n % 2 != 0){
            halfPowerSq = x * halfPowerSq;
        }
        return halfPowerSq;
    }



    public static void main(String[] args) {
        int x = 2;
        int n = 5;

        int result = xToThePowerN(x,n);
        System.out.println(result);
        int ans = xToThePowerNOptimised(x,n);
        System.out.println(ans);
    }
}
