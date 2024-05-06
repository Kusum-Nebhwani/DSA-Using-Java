package String;
import java.util.*;
public class IntroToStrings {
    public static void print_letters(String str){
        for(int i = 0;i<str.length();i++){
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        char [] arr = {'k', 'u','s','u','m'};
        // 1st method for  declaration
        String str = "Array2DArrayBitManipulation";
        // 2nd method for declaration
        String str1 = new String("abcs");

        System.out.println(str);
        System.out.println(str1);

        //string input

        Scanner sc = new Scanner(System.in);
        String str3 = sc.nextLine();

        //string length function
        System.out.println(str3.length());


        //string concatenation
        String firstName = "Array2DArrayBitManipulation";
        String lastName = "nebhwani";

        String fullName = firstName + " " + lastName;

        System.out.println(fullName);

        

        //string charAt method
        System.out.println(firstName.charAt(4)); // --> m

        print_letters(fullName);







    }
}
