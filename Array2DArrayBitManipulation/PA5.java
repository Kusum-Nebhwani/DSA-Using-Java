package Array2DArrayBitManipulation;

public class PA5 {
    public static void butterfly_pattern(int n){

    //first half
        for(int i = 1;i<=4;i++){
            for(int j = 1;j<=i;j++){
                //stars
                System.out.print("*");
            }
            for(int j = 1;j<=2 * (n-i);j++){
                //spaces
                System.out.print(" ");
            }
            for(int j =1;j<=i;j++){
                //stars
                System.out.print("*");
            }
            System.out.println();
        }

    //second half
        for(int i = n;i>=1;i--){
            for(int j = 1;j<=i;j++){
                //stars
                System.out.print("*");
            }
            for(int j = 1;j<=2 * (n-i);j++){
                //spaces
                System.out.print(" ");
            }
            for(int j =1;j<=i;j++){
                //stars
                System.out.print("*");
            }
            System.out.println();

        }





    }

    public static void main(String[] args) {
        butterfly_pattern(4);
    }
}
