package Recursion;

public class FirstOccurrenceOfKey {
    public static int firstOccurrence(int[]arr,int key,int i){
        if(i==arr.length-1){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
       return firstOccurrence(arr, key, i+1);
    }
    public static void main(String[] args) {
        int [] arr = {8,3,6,9,5,7,2,5,1,3};
        int result = firstOccurrence(arr,5,0);
        if(result == -1){
            System.out.println("key not found");
        }
        else{
            System.out.println("first occurrence of key: " + result);
        }

    }
}
