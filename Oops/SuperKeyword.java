package Oops;

public class SuperKeyword {
    public static void main(String[] args) {
        Bike_ myBike = new Bike_();
        myBike.setColor("red");
        System.out.println("color of bike: " + myBike.getColor());
        System.out.println("seating capacity of bike: " + myBike.bikeSeatingCapacity(6));


    }
}
class Vehicle_{

    String color = "white";
    Vehicle_(){  //constructor of super class --> parent class
        System.out.println("vehicle constructor is called");
    }

    int seatingCapacity(int seating_capacity){
        return seating_capacity;
    }

}
class Bike_ extends Vehicle_{


    int bikeSeatingCapacity(int bike_seating_capacity){
        return  super.seatingCapacity(2); //usage of super keyword for methods
    }

    void setColor(String color){
        super.color = color; //usage of super keyword for variable
    }

    String getColor(){
        return this.color;
    }
    Bike_(){ //constructor of subclass --> child class
        super();  //usage of super keyword for constructor
        System.out.println("bike constructor is called");

    }


}