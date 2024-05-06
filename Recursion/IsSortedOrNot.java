package Recursion;

public class IsSortedOrNot {
    public static boolean isSortedOrNot(int [] arr,int i){
        if(i == arr.length-1){
            return true;
        }
        if(arr[i]> arr[i+1]){
            return false;
        }


        return  isSortedOrNot(arr,i+1);
    }
    public static void main(String[] args) {
        int [] arr = {4,2,8,10,14};
        System.out.println("array is sorted or not: " + isSortedOrNot(arr,0));


    }
}
