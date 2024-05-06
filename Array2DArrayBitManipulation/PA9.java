package Array2DArrayBitManipulation;

public class PA9 {
    public static void palindrome_pattern_with_numbers(int n){

            for(int i = 1;i<=n;i++){
                //spaces
                for(int j = n-i;j>=0;j--){
                    System.out.print(" ");
                }
                //numbers - desc
                for(int j = i;j>=1;j--){
                    System.out.print(j);

                }
                //numbers - asc
                for(int j = 2;j<=i;j++){
                    System.out.print(j);
                }
                System.out.println();
            }

        }

    public static void main(String[] args) {
        palindrome_pattern_with_numbers(5);
    }
    }

