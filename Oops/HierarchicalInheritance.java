package Oops;

public class HierarchicalInheritance {
    public static void main(String[] args) {
     Bird b1 = new Bird();
     b1.fly();
     b1.eat();
     b1.breaths();
    }

}
class Animal_ {
    void eat(){
        System.out.println("eats");
    }
    void breaths()
    {
        System.out.println("breathes");
    }
}
class Fish extends Animal_{
    void swim(){
        System.out.println("swims in water");
    }
}
class Bird extends Animal_{
    void fly(){
        System.out.println("flies in sky");
    }
}
class Mammal_ extends Animal_{
    void walk(){
        System.out.println("walks");
    }
}

