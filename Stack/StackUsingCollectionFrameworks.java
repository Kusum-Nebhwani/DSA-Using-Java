package Stack;

import java.util.Stack;

public class StackUsingCollectionFrameworks {
    public static void main(String[] args) {
        Stack <Integer> s = new Stack<>(); //using JCF
        s.push(2);
        s.push(4);
        s.push(7);

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
