package Sorting;

public class BubbleSort {
    public static void bubbleSort_Ascending(int [] arr){
        //loop for counting number of turns
        for(int turns = 0 ; turns< arr.length - 1;turns++){
            // loop for swapping
            int swap = 0;
            for(int j = 0;j<arr.length-1-turns;j++){

                if(arr[j]  > arr[j+1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swap++;

                }


            }
            if(swap==0){ //it improves the complexity of code by already checking if array is sorted or not
                break;
            }
        }

    }
    public static void bubbleSort_Descending(int [] arr){
        //loop for counting number of turns
        for(int turns = 0 ; turns< arr.length - 1;turns++){
            // loop for swapping
            int swap = 0;
            for(int j = 0;j<arr.length-1-turns;j++){

                if(arr[j]  < arr[j+1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swap++;

                }


            }
            if(swap==0){ //it improves the complexity of code by already checking if array is sorted or not
                break;
            }
        }
    }
    public static void printArray(int [] arr){
        for(int i = 0;i< arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int [] arr = {3,6,2,1,8,7,4,5,3,1};
        bubbleSort_Ascending(arr);
        printArray(arr);
        bubbleSort_Descending(arr);
        printArray(arr);
    }
}
