package Array2DArrayBitManipulation;

public class PA3 {
    public static void floyd_triangle_pattern(int r,int c){
        int count  = 1;
        for(int i = 1;i<=r;i++){
            for(int j = 1;j<=i;j++){
                System.out.print(" "+count + " ");
                count = count + 1;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        floyd_triangle_pattern(5,5);
    }
}
