package Oops;

public class SingleLevelInheritance {
    public static void main(String[] args) {
        Dog tommy = new Dog();
        tommy.get_color("brown");
        tommy.eat();
        tommy.breathe();
        tommy.bark();


    }
}
// base class / parent class / superclass
class Animal{
    String skin_color;
    void eat(){
        System.out.println("eats");
    }
    void breathe(){
        System.out.println("breathes");
    }
    void get_color(String skin_color){
        this.skin_color = skin_color;
        System.out.println("skin color: " + skin_color);

    }
}
// derives class / child class / subclass
class Dog extends Animal {
    void bark(){
        System.out.println("barks");
    }


}

