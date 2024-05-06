package Stack;

import java.util.Stack;

public class PushAtBottomInStack {
    public static void pushAtBottom(Stack <Integer> s,int data){
        //base case
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBottom(s,data);
        s.push(top);
    }
    public static void main(String[] args) {
        Stack <Integer> s = new Stack<>();
        s.push(2);
        s.push(5);
        s.push(4);

        pushAtBottom(s,7);
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }
}
