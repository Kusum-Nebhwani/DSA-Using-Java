package Sorting;

import Sorting.BubbleSort;

//specially used where no are small(range)
public class CountSort {
    public static void countSort_ascending(int[] arr) {
        // for calculating range
        int range = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            range = Math.max(range, arr[i]);
        }

        //count array
        int[] count = new int[range + 1];

        //iterating original array

        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }

        //iterating count array for sorting
        int j = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                arr[j] = i;
                j++;
                count[i]--;
            }

        }
    }
    public static void countSort_descending(int[] arr) {
        // for calculating range
        int range = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            range = Math.max(range, arr[i]);
        }

        //count array
        int[] count = new int[range + 1];

        //iterating original array

        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }

        //iterating count array for sorting
        int j = 0;
        for (int i = count.length-1; i >= 0; i--) {
            while (count[i] > 0) {
                arr[j] = i;
                j++;
                count[i]--;
            }

        }
    }

    public static void main(String[] args) {
        int[] arr = {3,6,2,1,8,7,4,5,3,1};
        countSort_ascending(arr);
        BubbleSort.printArray(arr);
        countSort_descending(arr);
        BubbleSort.printArray(arr);
    }
}




