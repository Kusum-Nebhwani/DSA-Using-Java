package ArrayList;
import java.util.ArrayList;

public class ReverseArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> li = new ArrayList<>();

        li.add(2);
        li.add(7);
        li.add(90);
        li.add(4);
        li.add(23);
        li.add(34);
        System.out.println("ArrayList: " + li);
        System.out.print("after reversing ArrayList: ");
        for(int i = li.size()-1;i>=0;i--){
            System.out.print(li.get(i) + " ");
        }

    }
}
