package String;

public class StringCompression {
    public static String compressed (String str){
        StringBuilder sb = new StringBuilder(" ");
        //time complexity --> 0(n) without string builder
        for(int i = 0;i<str.length();i++){
            Integer count = 1;
            while(i<str.length()-1 && str.charAt(i) == str.charAt(i+1)){
                count++;
                i++;
            }
            sb.append(str.charAt(i));
            if(count > 1){
                sb.append(count.toString());
            }

        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "aaabbccc";
        System.out.println(compressed(str));
    }
}
