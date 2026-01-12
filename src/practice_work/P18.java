package practice_work;/*Write a program to demonstrate partial implementation of
interface and extending interfaces.*/

// Interface 1
interface A {
    void methodA();
}

// Interface 2 extending Interface practice_work.A
interface B extends A {
    void methodB();
}

// Abstract class – partial implementation of interface practice_work.B
abstract class Demo implements B {
    public void methodA() {
        System.out.println("Method practice_work.A implemented in abstract class");
    }
    // methodB() is NOT implemented here → partial implementation
}

// Concrete class – complete implementation
class Test extends Demo {
    public void methodB() {
        System.out.println("Method practice_work.B implemented in concrete class");
    }
}

public class P18 {
    public static void main(String[] args) {

        Test t = new Test();
        t.methodA();
        t.methodB();
    }
}
