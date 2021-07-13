public class OOPExampleShehriyar {
    
    public static void main(String args[]) {
        
        // Polymorphism
        Vehicle myCar = new Car(4, "Red", 1200, 220);
        Vehicle myTruck = new Truck(8, "Blue", 4000, 90);

        // Drive is an overridden method
        myCar.drive();
        myTruck.drive();

        System.out.println(myCar.toString());
        System.out.println(myTruck.toString());
    }

}

// Abstraction through Abstract Parent Class
abstract class Vehicle {

    int numOfWheels;
    String color;
    double fuelCapacity;

    public Vehicle(int numOfWheels, String color, double fuelCapacity) {
        this.numOfWheels = numOfWheels;
        this.color = color; 
        this.fuelCapacity = fuelCapacity;
    }

    // Drive method for vehicle with no implementation
    abstract void drive();

    @Override
    public String toString() {
        return "This is a vehicle with the following properties:\n\tWheels: " + numOfWheels + "\n\tColor: " + color + "\n\tFuel Capacity (ltr's): " + fuelCapacity;
    }

}

// Truck extending from Vehicle shows Interitance
class Truck extends Vehicle {

    private double maxWeight;

    public Truck(int numOfWheels, String color, double fuelCapacity, double maxWeight) {
        super(numOfWheels, color, fuelCapacity);
        this.maxWeight = maxWeight;
    }

    // Example of Encapsulation by making 
    // maxWeight private and allowing access 
    // to it through a getter method
    public double getMaxWeight() {
        return maxWeight;
    }

    // Method Overriding
    // Drive method for Truck
    @Override
    void drive() {
        System.out.println("Drive: Truck");
    }

    // Method Overriding
    @Override
    public String toString() {
        return "This is a Truck with the following properties:\n\tWheels: " + super.numOfWheels + "\n\tColor: " + super.color + "\n\tFuel Capacity (ltr's): " + super.fuelCapacity + "\n\tMax Weight (Kg): " + maxWeight;
    }
}

// Car extending from Vehicle shows Interitance
class Car extends Vehicle {

    private double maxSpeed;

    public Car(int numOfWheels, String color, double fuelCapacity, double maxSpeed) {
        super(numOfWheels, color, fuelCapacity);
        this.maxSpeed = maxSpeed;
    }

    // Example of Encapsulation by making 
    // maxSpeed private and allowing access 
    // to it through a getter method
    public double getMaxSpeed() {
        return maxSpeed;
    }

    // Method Overriding
    // Drive method for Car
    @Override
    void drive() {
        System.out.println("Drive: Car");
    }

    // Method Overriding
    @Override
    public String toString() {
        return "This is a Car with the following properties:\n\tWheels: " + super.numOfWheels + "\n\tColor: " + super.color + "\n\tFuel Capacity (ltr's): " + super.fuelCapacity + "\n\tMax Speed (Km/h): " + maxSpeed;
    }

}