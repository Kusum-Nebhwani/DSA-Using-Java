package Oops;

public class MultilevelInheritance {
    public static void main(String[] args) {
        Dogs doggy = new Dogs();
        doggy.legs = 4;
        System.out.println("doggy have " + doggy.legs + " legs");
        doggy.breathe();
        doggy.eat();
        doggy.bark();
        doggy.skin_color="brown";
        System.out.println("doggy is of " + doggy.skin_color + " color");

    }
}
class Animals{
    String skin_color;
    void eat(){
        System.out.println("eats");
    }
    void breathe(){
        System.out.println("breathes");
    }

}
class Mammal extends Animals {
    int legs;

}
class Dogs extends Mammal{
    void bark(){
        System.out.println("barks");
    }


}
