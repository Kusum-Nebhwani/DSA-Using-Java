package Oops;

public class ConstructorChaining1 {
    public static void main(String[] args) {
        Demo d = new Demo();
    }
}


//constructor chaining using this keyword
class Demo{
    Demo(){
        this(4);
        System.out.println("this is default constructor");
    }
    Demo(int roll_no){
        this("Array2DArrayBitManipulation", 29);
        System.out.println("this is single parametrised constructor");
    }
    Demo(String name,int roll_no){

        System.out.println("this is double parametrised constructor");
    }
}
