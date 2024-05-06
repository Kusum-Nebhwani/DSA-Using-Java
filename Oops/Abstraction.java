package Oops;

public class Abstraction {
    public static void main(String[] args) {
        Car c = new Car();
         c.brakes();
         c.run();
         c.seatbelt();
        System.out.println(c.changeColor());



         Bike b = new Bike();
         b.brakes();
         b.run();
         b.twoWheeler();
        System.out.println(b.changeColor());


        Ford f1 = new Ford();
         //vehicle ---> car ---> ford


    }
}
abstract class Vehicle{
    String color ;
    Vehicle(){
        System.out.println("vehicle constructor called");
    }
    void run(){
        System.out.println("all vehicles runs");
    }
    abstract void brakes();


}
class Car extends Vehicle{

    Car(){
        System.out.println("car constructor called");
    }
    String changeColor(){
        color = "white";
        return color;
    }
    void brakes(){
        System.out.println("car consists of brakes");
    }
    void seatbelt(){
        System.out.println("car has seatbelts");
    }
}


class Ford extends Car{
    Ford(){
        System.out.println("ford constructor called");
    }
}

class Bike extends Vehicle{
   String changeColor(){
       color = "red";
       return color;
    }
    void brakes() {
        System.out.println("bike has brakes");
    }
    void twoWheeler(){
        System.out.println("bike is two wheelers");
    }
}

