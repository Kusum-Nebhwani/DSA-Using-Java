package Stack;

import java.util.Stack;

public class DuplicateParenthesis {
    public static boolean isDuplicate(String str){
        //time complexity -- O(n)
        Stack<Character> s = new Stack<>();
        for(int i = 0;i<str.length();i++){
            char ch = str.charAt(i);
            //closing
            if(ch == ')'){
                int count = 0;
                while( s.pop()!= '('){
                    count ++;
                }
                if(count<1){
                    return true; //duplicate found
                }

            }else{   //operator,operand,opening
                s.push(ch);
            }

        }

            return false;
    }
    public static void main(String[] args) {
        String str1 = "(((a+b)+(c+d)+(e)))"; //true
        String str2 = "((a+b)+(c+d))"; //false
        System.out.println("duplicate exists or not: " + isDuplicate(str1));
        System.out.println("duplicate exists or not: " + isDuplicate(str2));


    }
}
