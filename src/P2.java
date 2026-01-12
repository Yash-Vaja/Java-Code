/*Write a Java program to accept a number and check the
        number is even or not. Prints 1 if the number is even or 0 if
        the number is odd.*/

import java.util.*;

public class P2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a =sc.nextInt();
        if (a % 2 == 0) {
            System.out.println(1);
        }else{
            System.out.println(0);
        }
    }
}
