package practice_work;/*
Write a program that creates two interfaces 1. practice_work.Direction 2.
Drive practice_work.Car. And creates two classes 1. practice_work.DirectionBoard 2.
practice_work.Car which inherits above interfaces.
 */

// Interface 1
interface Direction {
    void showDirection();
}

// Interface 2
interface DriveCar {
    void drive();
}

// Class implementing practice_work.Direction interface
class DirectionBoard implements Direction {
    public void showDirection() {
        System.out.println("practice_work.Direction Board: Go Straight, Turn Left, Turn Right");
    }
}

// Class implementing practice_work.DriveCar interface
class Car implements DriveCar {
    public void drive() {
        System.out.println("practice_work.Car is driving on the road");
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
