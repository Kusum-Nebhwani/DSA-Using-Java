package Array2DArrayBitManipulation;

public class EvenOddBitManipulation {
    public static void evenOrOdd(int n){
        int bitmask = 1;
        if((n & bitmask) == 0){
            System.out.println("even number");

        }
        else{
            System.out.println("odd number");
        }
    }
    public static void main(String[] args) {
        evenOrOdd(4);
        evenOrOdd(7);
    }
}
