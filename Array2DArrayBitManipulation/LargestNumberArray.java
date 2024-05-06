package Array2DArrayBitManipulation;

public class LargestNumberArray {
    public static int largest_number_in_Array(int [] arr){
        int largest = Integer.MIN_VALUE; // -infinity
        for(int i = 0;i<arr.length;i++){
            if(arr[i] > largest){
                largest = arr[i];
            }

        }
        return largest;
    }
    public static int smallest_number_in_Array(int [] arr){
        int smallest = Integer.MAX_VALUE; // +infinity
        for(int i = 0;i<arr.length;i++){
            if(smallest>arr[i]){
            smallest  = arr[i];
            }
        }
        return smallest;
    }

    public static void main(String[] args) {
        int [] arr = {27,21,65,73,81,90,12,4,6,5};

        System.out.println("largest number in array: " + largest_number_in_Array(arr));
        System.out.println("smallest number in array: " + smallest_number_in_Array(arr));
    }
}
