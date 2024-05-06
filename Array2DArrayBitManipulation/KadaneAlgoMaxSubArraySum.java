package Array2DArrayBitManipulation;
//kadane's algo (better to take zero than negative)

public class KadaneAlgoMaxSubArraySum {
    public static void max_sub_array_sum_using_kadane(int [] num){
        int cs = 0; // current sum
        int ms = Integer.MIN_VALUE; // maximum sum
        for(int i = 0;i< num.length;i++){
            cs += num[i];
            if(cs<0){
                cs=0;
            }
           ms = Math.max(cs,ms);
        }
        System.out.println("maximum sum: " + ms);

    }

    public static void main(String[] args) {
        int [] num = {2,-3,4,-1,-2,1,5,-3};
        max_sub_array_sum_using_kadane(num);
    }
}
