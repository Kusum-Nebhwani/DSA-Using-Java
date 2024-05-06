package Recursion;

public class TilingProblem {
    public static int tilingProblem(int n){ //2 x n --> floor size
        //base case
        if(n==0||n==1){
            return 1;
        }
        int vertically = tilingProblem(n-1);
        int horizontally = tilingProblem(n-2);

        return vertically + horizontally;

    }
    public static void main(String[] args) {
        System.out.println("no of ways for tile arrangement: " + tilingProblem(5));

    }
}
