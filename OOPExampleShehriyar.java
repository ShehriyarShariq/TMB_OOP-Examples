public class OOPExample {
    
    public static void main(String args[]) {

    }

}

abstract class Vehicle {

    int numOfWheels;
    String color;
    double fuelCapacity;

    abstract void drive();

}

class Truck extends Vehicle {

    double maxWeight;

    
}

class Car extends Vehicle {

    double maxSpeed;



}