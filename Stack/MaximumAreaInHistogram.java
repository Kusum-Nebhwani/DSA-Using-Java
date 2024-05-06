package Stack;

import java.util.Stack;

public class MaximumAreaInHistogram {
    public static int [] nextSmallerRight(int [] height){
        int [] nextSmallerRight = new int[height.length];
        Stack<Integer> s = new Stack<>();
        for(int i = height.length-1;i>=0;i--){
            while(!s.isEmpty() && height[s.peek()]>=height[i]){
                s.pop();
            }
            if(s.empty()){
                nextSmallerRight[i] = -1;
            }
            else{
                nextSmallerRight[i] = s.peek();
            }
            s.push(i);
        }
        return nextSmallerRight;
    }
    public static int [] nextSmallerLeft(int [] height){
        int [] nextSmallerLeft = new int[height.length];
        Stack<Integer> s = new Stack<>();
        for(int i = 0;i<height.length;i++){
            while(!s.isEmpty() && height[s.peek()]>=height[i]){
                s.pop();
            }
            if(s.empty()){
                nextSmallerLeft[i] = -1;
            }
            else{
                nextSmallerLeft[i] = s.peek();
            }
            s.push(i);
        }
        return nextSmallerLeft;
    }
    public static int maximumAreaRectangle(int [] height){
        //tc--- O(n)
        int maxArea = 0;
        //next smaller left index
        int [] nextSmallerLeft = nextSmallerLeft(height);
        //next smaller right index
        int [] nextSmallerRight = nextSmallerRight(height);

        for(int i = 0;i<height.length;i++){
            int h = height[i];  //height
            int w = nextSmallerRight[i] - nextSmallerLeft[i] - 1; //width
            int currArea = h * w;
            maxArea = Math.max(currArea,maxArea);

        }
        return maxArea;

    }

    public static void main(String[] args) {
        int [] height = {1,3,6,7,5,2,3};
        System.out.println("maximum area in histogram: " + maximumAreaRectangle(height));


    }
}
