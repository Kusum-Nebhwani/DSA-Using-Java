package Array2DArrayBitManipulation;

public class PA7 {
    public static void hollow_Rhombus(int n){

            for(int i = 1;i<=n;i++){
                //spaces
                for(int j = n-i;j>=0;j--){
                    System.out.print(" ");
                }
                //hollow rectangle - stars
                for(int j = 1;j<=n;j++) {
                    if (i == 1 || j == 1 || j == n || i== n) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                //spaces
                for(int j = 1;j<i ;j++){
                    System.out.print(" ");
                }
                System.out.println();
            }
        }

    public static void main(String[] args) {
        hollow_Rhombus(5);
    }

    }

