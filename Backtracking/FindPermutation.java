package Backtracking;

public class FindPermutation {
    public static void findPermutations(String str , String ans){

        //tc --> o(n * n!)
        //sc --> o(n)

        //base-case
        if(str.length()==0 ){
            System.out.println(ans);
            return;

        }

        //recursion
        for(int i = 0;i<str.length();i++){
            char curr = str.charAt(i);
            //str = "abide"  --> str(ab) + str(de) = "abde" ---> i eliminated
            String NewStr = str.substring(0,i) + str.substring(i+1);
            findPermutations(NewStr,ans+curr);

        }
    }
    public static void main(String[] args) {
        findPermutations("pqr","");

    }
}
