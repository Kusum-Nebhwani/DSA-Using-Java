package Array2DArrayBitManipulation;

public class PA8 {
    public  static void diamond(int n){
        //first half
        for(int  i = 1;i<=n;i++){
            //spaces
            for(int j = n-i;j>=0;j--){
                System.out.print(" ");
            }
            //star
            for(int j = 1;j<=(i + (i-1));j++){
                System.out.print("*");


            }
            //spaces
            for(int j = n-i;j>=0;j--){
                System.out.print(" ");
            }
            System.out.println();
        }
        for(int  i = n;i>=1;i--){
            //spaces
            for(int j = n-i;j>=0;j--){
                System.out.print(" ");
            }
            //star
            for(int j = 1;j<=(i + (i-1));j++){
                System.out.print("*");


            }
            //spaces
            for(int j = n-i;j>=0;j--){
                System.out.print(" ");
            }
            System.out.println();
        }




    }

    public static void main(String[] args) {
        diamond(4);
    }
}
