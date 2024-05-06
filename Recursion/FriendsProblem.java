package Recursion;

public class FriendsProblem {
    public static int noOfWaysFriendsProblem(int n){
        //base case
        if(n==1 || n==2){
            return n;
        }
        //kaam : choices = single : pair ?
        //single
        int single_choice = noOfWaysFriendsProblem(n-1);
        //pair
        int pair_choice = single_choice * noOfWaysFriendsProblem(n-2);
        return single_choice + pair_choice;

    }
    public static void main(String[] args) {
        int n = 3;
        int ans = noOfWaysFriendsProblem(n);
        System.out.println(ans);

    }
}
