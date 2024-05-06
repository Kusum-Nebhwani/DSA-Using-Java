package Searching;

public class LinearSearchArray {
    public static int Linear_Search(int[] arr, int k) {
        for (int i = 0; i < arr.length; i++) {
           if(arr[i] == k){
               return i;
           }

        }
        return 0;

    }




    public static void main(String[] args) {
        int[] arr =  {2,5,10,6,45,78,3,9,20,17};
        int key = 78;
        int index = Linear_Search(arr,key);
        if(index == 0){
            System.out.println("element not found");

        }
        else{
            System.out.println("element found at " + index + " index");
        }


    }
}
