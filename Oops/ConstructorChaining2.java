package Oops;

public class ConstructorChaining2 {
    public static void main(String[] args) {
    Prototype p = new Prototype();
    }
}
//constructor chaining using super keyword
class Demo_{

    Demo_(){
        this(4);
        System.out.println("this is default constructor");
    }
    Demo_(int roll_no){
        this("Array2DArrayBitManipulation", 29);
        System.out.println("this is single parametrised constructor");
    }
    Demo_(String name,int roll_no){

        System.out.println("this is double parametrised constructor");
    }
}

class Prototype extends Demo_{
    Prototype(){
        this("java","python");
        System.out.println("this is default constructor of child  class");
    }
    Prototype(String s1,String s2){
        super(); //calls the cain of super class
        System.out.println("this is parametrised constructor of child class");

    }
}

