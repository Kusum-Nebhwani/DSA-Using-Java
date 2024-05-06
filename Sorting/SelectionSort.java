package Sorting;

import Sorting.BubbleSort;

public class SelectionSort {
    public static void selectionSort_ascending(int [] arr){
        //outer loop -> for turns
        for(int i = 0;i<arr.length-1;i++){
            int minPos = i;  // minimum element's position = current value's position
            //inner loop -> from where our unsorted array starts
            for(int j = i+1;j<= arr.length-1;j++){
                //compare
                if(arr[minPos] > arr[j]){
                    minPos = j;
                }
            }

            //swapping in outer loop
            int temp = arr[i];
            arr[i] = arr[minPos];
            arr[minPos] = temp;


        }

    }
    public static void selectionSort_descending(int [] arr){
        //outer loop -> for turns
        for(int i = 0;i<arr.length-1;i++){
            int maxPos = i;  // minimum element's position = current value's position
            //inner loop -> from where our unsorted array starts
            for(int j = i+1;j<= arr.length-1;j++){
                //compare
                if(arr[maxPos] < arr[j]){
                    maxPos = j;
                }
            }

            //swapping in outer loop
            int temp = arr[i];
            arr[i] = arr[maxPos];
            arr[maxPos] = temp;


        }

    }

    public static void main(String[] args) {
        int [] arr = {5,4,1,3,2};
        selectionSort_ascending(arr);
        BubbleSort.printArray(arr);
        selectionSort_descending(arr);
        BubbleSort.printArray(arr);
    }
}
