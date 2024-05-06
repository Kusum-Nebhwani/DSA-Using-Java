package Backtracking;

public class FindSubsets {
    public static void findSubsets(String str,int i, String ans){
         // tc --> o(n * 2^n)
        //sc ---> o(n)

        //base-case
        if(i == str.length()) {
            if (ans.length() == 0) {
                System.out.println("null");
            } else {
                System.out.println(ans);
            }
            return;
        }


        findSubsets(str,i+1,ans+str.charAt(i));// character of string is  part  of subset
        findSubsets(str,i+1,ans);  // character of string is not part  of subset




    }
    public static void main(String[] args) {
        String str = "abc";

        findSubsets(str,0,"");
    }
}
