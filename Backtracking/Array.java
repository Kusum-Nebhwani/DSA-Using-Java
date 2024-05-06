package Backtracking;

public class Array {
    public static  void printArray(int [] arr){
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void backtrackingArray(int [] arr,int i,int value){
        //base-case
        if(i== arr.length){
            System.out.println("before base case: ");
            printArray(arr);
            return;
        }
        //recursion
         arr[i] = value;
         backtrackingArray(arr,i+1,value+1);  //recursion call
        arr[i] = arr[i] - 2; //backtracking step

    }
    public static void main(String[] args) {
        int [] arr = new int[5];
        backtrackingArray(arr,0,1);
        System.out.println("after base case: ");
        printArray(arr);


    }

}
