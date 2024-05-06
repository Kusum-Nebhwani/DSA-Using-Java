package Sorting;
import java.util.Arrays;  //PACKAGE FOR IMPORTING ARRAY RELATED SORT
import java.util.Collections;

public class InbuiltSort {
    public static void printArray(Integer [] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer [] arr = {1, 4, 5, 3, 2};

        //for sorting in ascending order :-

         /*

          Arrays.sort(arr);
        kusum.BubbleSort.printArray(arr);

        */


        //for sorting in specific range :-

       /*

        Arrays.sort(arr, 0, 3);

        */
        //starting index = 3 , ending index = 3 ( I want to sort till 2 but have to pass 3 (2+1))


        //for sorting in descending order :-
        Arrays.sort(arr, Collections.reverseOrder());
        printArray(arr);

        Arrays.sort(arr,0,3,Collections.reverseOrder());

        printArray(arr);


    }




        
    }

