package Oops;

public class HybridInheritance {
    public static void main(String[] args) {
        Peacock p1 = new Peacock();
        p1.eat();
        p1.fly();
        p1.danceInRain();

        StarFish s1 = new StarFish();
        s1.eat();
        s1.swim();
        s1.starShaped();

    }
}
class Animal__{
    void eat(){
        System.out.println("eats");
    }
    void breaths()
    {
        System.out.println("breathes");
    }
}
class Fish_ extends Animal_ {
    void swim(){
        System.out.println("swims in water");
    }
}
class Bird_ extends Animal_ {
    void fly(){
        System.out.println("flies in sky");
    }
}
class Mammal__ extends Animal_ {
    void walk(){
        System.out.println("walks");
    }
}
class Peacock extends Bird_{
    void danceInRain(){
        System.out.println("dances in rain");
    }
}
class Parrot extends Bird_{
    void speaks(){
        System.out.println("speaks");
    }
}
class shark extends Fish_{
    void eatOtherFishes(){
        System.out.println("Eats other sea animals");
    }
}
class StarFish extends Fish_{
    void starShaped(){
        System.out.println("star shaped");
    }
}
class Cat extends Mammal__{
    void meow(){
        System.out.println("meows");
    }
}
class Dog_ extends Mammal__{
    void bark(){
        System.out.println("barks");
    }
}


