package java_object_oriented_programming.section03_object_oriented_programming_concepts.lesson19_overriding;

class Vehicle {
    public void run() {
        System.out.println("Vehicle is running");
    }
}

class Car extends Vehicle {
    public void run() {
        System.out.println("Car is running");
    }
}

public class OverridingDemo {

    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle();
        Car car = new Car();

        vehicle.run();
        car.run();

        System.out.println("**********************");

        Vehicle vCar = new Car();
        vCar.run();

    }

}
