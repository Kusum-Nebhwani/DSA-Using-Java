package Searching;

public class BinarySearchArray {
    public static int binary_search(int [] num , int key){
        int left = 0; int right = num.length-1;
        while(left<=right){
            //comparisons
            int mid = (left + right) /2;
            if(key == num[mid]){
               return mid;
            }
            if(key > num[mid]){
               left = mid + 1;
            }
            else{
                right = mid - 1;
            }}
        return 0;


    }

    public static void main(String[] args) {
        int [] num = {5,9,17,23,25,45,59,63,71,89}; //sorted array
        int key = 59;
        if(binary_search(num,key) == 0 ){
            System.out.println("key not found");
        }
        else{
            System.out.println("key found at " + binary_search(num,key) + " index");
        }

    }
}
