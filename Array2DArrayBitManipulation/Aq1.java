package Array2DArrayBitManipulation;

//array question 1
public class Aq1 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};

        boolean repeat = false;
        for(int i = 0;i<nums.length - 1;i++){
            for(int j = i+1;j<nums.length;j++){
               if(nums[i] == nums[j]){
                   repeat = true;

                }
            }
        }
        System.out.println(repeat);
    }
}
