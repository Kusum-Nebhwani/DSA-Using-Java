package Oops;// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    public static int [] rotatedArray(int[] arr,int k ){
        int [] temp = new int[arr.length];
        for(int i=0;i<k;i++){
            arr[0] = arr[arr.length - i - 1];
            for(int j = 1;j<arr.length;j++){
                arr[j] = arr[j-1];
            }

        }
        return temp;
    }
    public static void printArray(int [] arr){
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int [] arr = {3,5,7,1};
        int k = 2;
       int [] ans =  rotatedArray(arr,k);
       printArray(ans);

    }
}
