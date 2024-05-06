package DivideAndConquer;

public class MergeSort {

    public static void printArray(int [] arr){
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void merge(int [] arr,int si,int mid,int ei){

        int [] temp = new int[ei-si+1];
        int i = si; // iterator for left part
        int j = mid + 1; //iterator for right part
        int k = 0; // iterator for temp array

        while(i<=mid && j<=ei){
            if(arr[i] < arr[j]){
                temp[k] = arr[i];
                i++;
            }else{
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        //still my left part is not completed
        while(i<=mid){
            temp[k++] = arr[i++];
        }

        //still my right part is not completed
        while(j<=ei){
            temp[k++] = arr[j++];
        }

        //copy temp arr to original arr{
        for(k = 0,i = si;k< temp.length;k++,i++){
            arr[i] = temp[k];
        }


    }
    public static void mergeSort(int[] arr,int si,int ei){
        //base-case
        if(si>=ei){
            return;
        }
        int mid = si + (ei-si)/2;  //mid
        //kaam ---> divide in left or right part
        mergeSort(arr,si,mid); //left part of array
        mergeSort(arr,mid+1,ei); //right part of array
        merge(arr,si,mid,ei); //merge left and right part of  array


    }

    public static void main(String[] args) {
        int [] arr = {6,3,9,5,2,8};
        mergeSort(arr,0,arr.length-1);
        printArray(arr);

    }
}
