package String;

public class LargestString {
    public static String largestString(String [] fruits){
        String largest_String = fruits[0];
        //-->checks lexicographically, time complexity = O(x + n)
        // where x = no of letters in a string and n = no of strings
        for(int i = 0;i<fruits.length;i++){
            if(largest_String.compareTo(fruits[i])<0){
                largest_String = fruits[i];

            }
        }
        return largest_String;
    }
    public static void main(String[] args) {
        String [] fruits = { "apple","mango","banana"};
        System.out.println(largestString(fruits)); //--> mango
    }
}
