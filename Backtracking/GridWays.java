package Backtracking;

public class GridWays {

    //time complexity : o(2^n+m)
    public static int gridWays(int i,int j,int n, int m){
        //base case
        if(i == n-1 && j == m-1){  //condition of last cell
            return 1;
        }
        else if(i == n || j == m){
            return 0;
        }

        //recursion
        return gridWays(i,j+1,n,m) + gridWays(i+1,j,n,m);


    }
    public static void main(String[] args) {
        int n = 3 , m = 3;

        System.out.println("total no of ways: " +  gridWays(0 , 0, n, m));

    }
}
