package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class FirstNonRepeatingLetterUsingQueue {
    public static void firstNonRepeatingLetter(String str){
        int [] freq = new int[26];
        Queue<Character> q = new LinkedList<>();

        for(int i = 0;i<str.length();i++){
            char curr = str.charAt(i);
            q.add(curr);
            freq[curr - 'a'] ++;

            while(!q.isEmpty() && freq[q.peek() - 'a'] > 1){
                q.remove();
            }
            if(q.isEmpty()){
                System.out.print(-1 + " ");
            }else{
                System.out.print(q.peek()+ " ");
            }
        }
        System.out.println();


    }
    public static void main(String[] args) {
        String str = "xxyzzyabay";
        firstNonRepeatingLetter(str);

    }
}
