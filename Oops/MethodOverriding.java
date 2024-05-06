package Oops;

public class MethodOverriding {
    public static void main(String[] args) {
        Deer de = new Deer();
        de.eat();
    }
}
class Animal___{
    void eat(){
        System.out.println("eats anything");
    }

}
class Deer extends Animal___{
    void eat(){
        System.out.println("eats grass");
    }
}
