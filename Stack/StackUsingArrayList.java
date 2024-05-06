package Stack;
import java.util.ArrayList;
import java.util.Stack;

public class StackUsingArrayList {
    static class stack{
        static ArrayList <Integer> stack = new ArrayList<>();


        //isEmpty()
        public static Boolean isEmpty(){
            return (stack.size() == 0);
        }

        //push
        public static void push(int data){
            stack.add(data);
        }

        //pop
        public static int pop(){
            if(isEmpty()){
                return -1;
            }
            int top = stack.get(stack.size()-1);
            stack.remove(stack.size()-1);
            return top;
        }

        //peek
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return stack.get(stack.size()-1);
        }

        public static void traverse(){
            while(!isEmpty()){
                System.out.println(peek());
                pop();
            }
        }

    }
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(2);
        s.push(5);
        s.push(6);
        s.pop();


        while(!s.isEmpty()){
                System.out.println(s.peek());
                s.pop();
            }






    }
}
