package Array2DArrayBitManipulation;

public class BitManipulation{
    public static int getIthBit(int n,int i){
        int bitmask = 1 << i;
        if((n & bitmask)  ==  0){
            return 0;

        }
        else{
            return 1;
        }

    }
    public static int setIthBit(int n,int i){
        int bitmask = 1 << i;
        return n | bitmask;
    }
    public static int clearIthBit(int n,int i){
        int bitmask = ~(1<<i);
        return n & bitmask;
    }
    public static int updateIthBit(int n , int i ,int newBit){
       //-->first approach (simple approach)
        //if(newBit==0){
        //     return clearIthBit(n,i);
        // }
        // else{
        //     return setIthBit(n,i);
        // }

        //-->second approach
         n = clearIthBit( n,i);
        int bitmask = newBit<<i;
        return n | bitmask;


    }
    public static int clearRangeOfBits(int n,int i,int j){
       int a = (-1)<<(j+1);
       int b = (1<<i)-1;
       int bitmask = a | b;
        System.out.println(bitmask);
       return n & bitmask;

    }

    public static int clearLastIthBits(int n , int i){
        int bitmask = (-1) << i;
        n = n & bitmask;
        return n;
    }

    public static boolean isPowerOfTwoOrNot (int n){
        return (n & (n-1)) == 0;
   }

   public static  int countSetBits(int n){
        int  count = 0;
        while(n>0){
            if((n&1) !=0){
                count ++ ;
            }
            n = n>>1;
        }
        return  count;
   }
   public static int fastExponentiation(int a , int n){
        int ans = 1;
        while(n>0){
            if((n&1) !=0){
                //lsb = 1
                ans *= a;

            }
            a *=a;
            n = n>>1;
        }
        return ans;
   }
   public static int modularExponentiation(int a, int n,int x){
        int ans = 1;
       while(n>0){
           if((n&1) !=0){
               //lsb = 1
               ans *= a;

           }
           a *=a;
           n = n>>1;
       }
       return ans % x ;

   }
    public static void main(String[] args) {
        System.out.println(5&6); //binary and
        System.out.println(5|6); //binary or
        System.out.println(~5);  //binary not
        System.out.println(5^6); //binary xor
        System.out.println(5<<2); //binary left shift
        System.out.println(5>>2); //binary right shift


        System.out.println("getting ith bit : " +  getIthBit(4,2));
        System.out.println("after setting ith bit we get: " + setIthBit(3,3));
        System.out.println("after clearing ith bit we get: " + clearIthBit(10,  2));
        System.out.println("after updating ith bit we get: " + updateIthBit(10,2,1));
        System.out.println("after clearing last ith bits we get: " + clearLastIthBits(15,2));
        System.out.println("after clearing range of bits we get: " + clearRangeOfBits(10,2,4));
        System.out.println("two's power or not : " + isPowerOfTwoOrNot(5));
        System.out.println("no of set bits: " + countSetBits(15));
        System.out.println("fast exponentiation: " + fastExponentiation(5,5));
        System.out.println("modulo exponentiation: " + modularExponentiation(2,3,5));

    }


}
