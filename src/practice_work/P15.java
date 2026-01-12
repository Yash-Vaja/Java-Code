package practice_work;/*
* Write a program to add two numbers using function
overloading.
* */
import java.util.Scanner;

public class P15 {

    static int add(int a , int b){
        return a + b;
    }

    static float add(float a , float b){
        return a + b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num 1: ");
        int a = sc.nextInt();
        System.out.print("Enter num 1: ");
        int b = sc.nextInt();

        System.out.println("Function 1: " + add(a,b));
        System.out.println("Function 2: " + add((float) a,(float) b));
    }
}
