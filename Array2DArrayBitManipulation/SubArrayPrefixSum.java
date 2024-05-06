package Array2DArrayBitManipulation;

public class SubArrayPrefixSum {
    //max / min sub_array sum -->prefix sum method

    public static void max_min_sub_Array_prefix_Sum(int [] num) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int sum =0;
        int[] prefix = new int[num.length];
        prefix[0] = num[0];
        for (int i = 1; i <prefix.length; i++) {
            prefix[i] = prefix[i - 1] + num[i];
        }
        for (int i = 0; i < num.length; i++) {
            int start = i;
            for (int j = i; j < num.length; j++) {
                int end = j;


                sum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];
                if (sum > max) {
                    max = sum;
                }
                if (sum < min) {
                    min = sum;
                }

            }
        }

            System.out.println("maximum sum of sub_array: " + max);
            System.out.println("minimum sum of sub_array: " + min);

    }

    public static void main(String[] args) {
        int[] num = {2, 4, 6, 8, 10};
        max_min_sub_Array_prefix_Sum(num);
    }
}




























































