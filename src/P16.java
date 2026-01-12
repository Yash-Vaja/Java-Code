/*
Write a program to design three classes that accept
dimension of triangle and rectangle and calculate area of
rectangle and triangle.
*/
import java.util.Scanner;

// Rectangle class
class Rectangle {
    double length, breadth;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of rectangle: ");
        length = sc.nextDouble();
        System.out.print("Enter breadth of rectangle: ");
        breadth = sc.nextDouble();
    }

    void area() {
        double area = length * breadth;
        System.out.println("Area of Rectangle = " + area);
    }
}

// Triangle class
class Triangle {
    double base, height;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base of triangle: ");
        base = sc.nextDouble();
        System.out.print("Enter height of triangle: ");
        height = sc.nextDouble();
    }

    void area() {
        double area = 0.5 * base * height;
        System.out.println("Area of Triangle = " + area);
    }
}

// Main class
public class P16 {
    public static void main(String[] args) {

        Rectangle r = new Rectangle();
        r.input();
        r.area();

        System.out.println();

        Triangle t = new Triangle();
        t.input();
        t.area();
    }
}
