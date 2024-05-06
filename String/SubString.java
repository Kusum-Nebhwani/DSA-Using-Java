package String;

public class SubString {
    public static String substring (String str,int si , int ei){
        String subs = "";
        for(int  i = si;i<ei-1;i++){
            subs += str.charAt(i);
        }
        return subs;
    }
    public static void main(String[] args) {
        String s1 = "hello java";
        //-->using above defined function (manually created function call)
        System.out.println(substring(s1,2,5));

        //-->using substring function (inbuilt function call)
        System.out.println(s1.substring(0,5));
    }
}
