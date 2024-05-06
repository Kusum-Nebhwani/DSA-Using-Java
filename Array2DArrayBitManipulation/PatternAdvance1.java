package Array2DArrayBitManipulation;

public class PatternAdvance1 {
    public static void inverted_rotated_half_pyramid(int n){
        for(int i = 1;i<=n;i++){
            for(int k = 1;k<=n-i;k++){
                System.out.print(" ");
            }
            for(int j = 1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        inverted_rotated_half_pyramid(4);
    }
}
