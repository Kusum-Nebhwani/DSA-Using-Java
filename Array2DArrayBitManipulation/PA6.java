package Array2DArrayBitManipulation;

public class PA6 {
    public static void solid_rhombus(int n){
        for(int i = 1;i<n;i++){
            //spaces
            for(int j = n-i;j>=0;j--){
                System.out.print(" ");
            }
            //stars
            for(int j = 1;j<=n;j++){
                System.out.print("*");
            }
            //spaces
            for(int j = 1;j<i ;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {solid_rhombus(5);
    }
}
