package Recursion;

public class LastOccurrenceOfKey{
    public static int lastOccurrence(int [] arr,int key,int i){
        if(i==arr.length-1){
            return -1;
        }
        int isFound = lastOccurrence(arr,key,i+1);
        if(isFound == -1 && arr[i] == key){
            return i;
        }
        return isFound;
    }
    public static void main(String[] args) {
        int [] arr = {8,3,6,9,5,7,2,5,1,3};
        int result = lastOccurrence(arr,5,0);
        if(result == -1){
            System.out.println("key not found");
        }
        else{
            System.out.println("last occurrence of key: " + result);
        }

    }
}
