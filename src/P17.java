/*
Write a program that creates two interfaces 1. Direction 2.
Drive Car. And creates two classes 1. DirectionBoard 2.
Car which inherits above interfaces.
 */

// Interface 1
interface Direction {
    void showDirection();
}

// Interface 2
interface DriveCar {
    void drive();
}

// Class implementing Direction interface
class DirectionBoard implements Direction {
    public void showDirection() {
        System.out.println("Direction Board: Go Straight, Turn Left, Turn Right");
    }
}

// Class implementing DriveCar interface
class Car implements DriveCar {
    public void drive() {
        System.out.println("Car is driving on the road");
    }
}

public class P17 {
    public static void main(String[] args) {

        DirectionBoard db = new DirectionBoard();
        db.showDirection();

        Car c = new Car();
        c.drive();
    }
}
