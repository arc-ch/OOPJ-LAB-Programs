class Vehicle {
    int wheels;
    double speed;
    public Vehicle(int wheels, double speed) {
    this.wheels = wheels;
    this.speed = speed;
    }
    public void displayInformation() {
    System.out.println("Number of wheels: " + wheels);
    System.out.println("Speed: " + speed);
    }
    }
    class Car extends Vehicle {
    int passengers;
    public Car(int wheels, double speed, int passengers) {
    super(wheels, speed);
    this.passengers = passengers;
    }
    @Override
    public void displayInformation() {
    super.displayInformation();
    System.out.println("Number of passengers: " + passengers);
    }
    }
    class Truck extends Vehicle {
    double loadLimit;
    public Truck(int wheels, double speed, double loadLimit) {
    super(wheels, speed);
    this.loadLimit = loadLimit;
    }
    @Override
    public void displayInformation() {
    super.displayInformation();
    System.out.println("Load limit: " + loadLimit);
    }
    }
    public class lab5_q14 {
    public static void main(String[] args) {
    Car car = new Car(4, 150.5, 4);
    Truck truck = new Truck(8, 91.0, 50000.0);
    System.out.println("Car Information:");
    car.displayInformation();
    System.out.println("\nTruck Information:");
    truck.displayInformation();
    if (car.speed > truck.speed) {
    System.out.println("\nThe car is faster.");
    } else if (truck.speed > car.speed) {
    System.out.println("\nThe truck is faster.");
    } else {
    System.out.println("\nThe car and the truck have the same speed.");
    }
    }
    }