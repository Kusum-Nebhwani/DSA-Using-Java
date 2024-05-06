package Sorting;

import Sorting.BubbleSort;

public class InsertionSort {
    public static void insertionSort_ascending(int [] arr){
        //outer loop
        for(int i = 1;i< arr.length;i++){
            int current = arr[i];
            int previous = i-1;
            //for finding the correct position
            while (previous >= 0 && arr[previous] > current){
                arr[previous + 1] = arr[previous];
                previous -- ;
            }

            //placing the value on its correct position
            arr[previous + 1] = current;
        }
    }
    public static void insertionSort_descending(int [] arr){
        //outer loop
        for(int i = 1;i< arr.length;i++){
            int current = arr[i];
            int previous = i-1;
            //for finding the correct position
            while (previous >= 0 && arr[previous] < current){
                arr[previous + 1] = arr[previous];
                previous -- ;
            }

            //placing the value on its correct position
            arr[previous + 1] = current;
        }
    }

    public static void main(String[] args) {
        int [] arr = {5,4,1,3,2};
        insertionSort_descending(arr);
        BubbleSort.printArray(arr);
        insertionSort_ascending(arr);
        BubbleSort.printArray(arr);
    }
}
