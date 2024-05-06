package Heaps;

import java.util.PriorityQueue;

public class SlidingWindowMaximum {
    static  class Pair implements Comparable<Pair> {

        int value;
        int idx;

        public Pair(int v,int i){
            this.idx = i;
            this.value = v;
        }


        @Override
        public int compareTo(Pair p){
            return p.value - this.value;

        }
    }
    public static int [] maxSlidingWindow(int [] arr,int k){
        int [] res = new int[arr.length - k + 1];
        PriorityQueue <Pair> pq = new PriorityQueue<>();

        for(int i = 0;i<k;i++){
            pq.add(new Pair(arr[i],i));
        }

        res[0] = pq.peek().value;

        for(int i = k;i<arr.length;i++){
            while (pq.size()>0 && pq.peek().idx <=(i-k)){
                pq.remove();
            }
            pq.add(new Pair(arr[i],i));

            res[i-k+1] = pq.peek().value;
        }

        return res;

    }
    public static void main(String[] args) {
        int [] arr = {1,3,-1,-3,5,3,6,7};
        int k = 3;

        int [] res = maxSlidingWindow(arr,k);

        for(int i = 0;i<res.length;i++){
            System.out.print(res[i] + " ");
        }
    }
}
