package Stack;

import java.util.Stack;

public class ValidParenthesis {
    public static boolean isValid(String str){
        Stack<Character> s = new Stack<>();
        //time complexity -- O(n)
        for(int i = 0;i<str.length();i++){
            char curChar = str.charAt(i);
            if(curChar == '(' || curChar == '{' || curChar == '['){
                s.push(curChar);
            }
            else{
                if(s.isEmpty()){
                    return false;
                }
                if((s.peek() == '(' && curChar == ')')  //()
                        || (s.peek() == '{' && curChar == '}') //{}
                        || (s.peek() == '[' && curChar == ']')){ //[]
                    s.pop();
                }
                else{
                    return false;
                }
            }
        }
        if(s.isEmpty()){
            return true;
        }
        else {
            return false;
        }
    }
    public static void main(String[] args) {
        String str = "({}]([[]))";
        System.out.println("string is valid or not: " + isValid(str));

    }
}
