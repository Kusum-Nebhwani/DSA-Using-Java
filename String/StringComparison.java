package String;

public class StringComparison {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "hello";
        String s3 = new String("hello");

        if(s1==s2){
            System.out.println("equal");
        }
        else{
            System.out.println("not equal");
        }
        if(s1==s3){
            System.out.println("equal");
        }
        else{
            System.out.println("not equal");
        }


        if(s1.equals(s3)){   //---> equals() function for comparing the value of strings
            System.out.println("strings' values are equal");
        }
        else {
            System.out.println("not equal");
        }

    }
}
