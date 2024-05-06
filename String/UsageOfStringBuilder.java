package String;

public class UsageOfStringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("");
        for (char ch = 'a'; ch <= 'z'; ch++) {

            //complexity --> o(26)
            sb.append(ch);
        }
        System.out.println(sb);

    }


}
