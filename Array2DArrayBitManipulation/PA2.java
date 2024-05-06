package Array2DArrayBitManipulation;

public class PA2 {
    public static void inverted_half_pyramid(int r,int c){
        for(int i =0;i<r;i++){
            for(int j = 1;j<=c-i;j++){
                System.out.print(j);
            }
            System.out.println();

        }
    }

    public static void main(String[] args) {
        inverted_half_pyramid(5,5);
    }
}
