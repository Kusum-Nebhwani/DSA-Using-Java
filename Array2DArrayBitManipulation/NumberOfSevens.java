package Array2DArrayBitManipulation;

public class NumberOfSevens {
    public static int numberOfSevens(int [][] arr){
        int count_seven = 0;
        for(int i = 0;i< arr.length;i++){
            for(int j = 0;j< arr[0].length;j++){
                if(arr[i][j] == 7){
                    count_seven++;

                }
            }
        }
        return count_seven;
    }
    public static void main(String[] args) {
        int [][] arr = {{4,7,8},{8,8,7}};

        System.out.println("count of 7's: "+ numberOfSevens(arr));
    }
}
