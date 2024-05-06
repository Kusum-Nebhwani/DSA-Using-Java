package Array2DArrayBitManipulation;

public class SubArray {

    // max / min sub_array  sum  //loop vala method
    public static void print_sub_array(int[] num) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;


            for (int i = 0; i < num.length; i++) {

                for (int j = i; j < num.length; j++){
                    int sum = 0;

                    for(int k = i;k<=j;k++){
                        sum +=num[k];
                        System.out.print(sum + " ");
                    if (sum > max) {
                        max = sum;
                    }
                    if (sum < min) {
                        min = sum;
                    }

                }
                    System.out.println();
            }
                System.out.println();


        }

        System.out.println("maximum sum of sub_array: " + max);
        System.out.println("minimum sum of sub_array: " + min);
    }
    public static void main(String[] args) {
        int [] num = {2,4,6,8,10};
        print_sub_array(num);
    }
}










































































































































































































































































