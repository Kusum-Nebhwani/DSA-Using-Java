package Heaps;

import java.util.ArrayList;

public class MaxHeapImplementation {
    static class MaxHeap {
        ArrayList<Integer> arr = new ArrayList<>();

        public  void add(int data){
            //step 1 --> insert element at last index
            arr.add(data);

            int x = arr.size()-1; //child
            int par = (x-1)/2;   //parent

            //step 2 ---> fix the heap
            while(arr.get(x) >  arr.get(par)){
                //swap
                int temp = arr.get(x);
                arr.set(x,arr.get(par));
                arr.set(par,temp);

                x = par;
                par = (x - 1)/2;
            }

        }

        public int peek(){
            return  arr.get(0);
        }

        private void heapify(int i){
            int left = 2*i + 1;
            int right = 2*i + 2;
            int maxIdx = i;

            if(left < arr.size()&& arr.get(maxIdx) < arr.get(left)){
                maxIdx = left;
            }



            if(right < arr.size()&& arr.get(maxIdx) < arr.get(right)){
                maxIdx = right;
            }

            if(maxIdx!=i){
                //swap
                int temp = arr.get(i);
                arr.set(i,arr.get(maxIdx));
                arr.set(maxIdx,temp);

                heapify(maxIdx);
            }

        }

        public int remove(){

            int data = arr.get(0);

            //step 1: swap 1st and last idx
            int temp = arr.get(0);
            arr.set(0,arr.get(arr.size()-1));
            arr.set(arr.size()-1,temp);


            //step 2: delete last element
            arr.remove(arr.size()-1);

            //step 3: heapify
            heapify(0);

            return data;
        }

        public boolean isEmpty(){
            return arr.size() == 0;
        }

    }
    public static void main(String[] args) {
        MaxHeap h = new MaxHeap();

        h.add(2);
        h.add(5);
        h.add(3);
        h.add(1);

        while(!h.isEmpty()){
            System.out.print(h.peek() + " ");
            h.remove();
        }


    }
}
