package practice_work;/*
Write a Java program to print the ascii value of a given
character.
*/

import java.util.Scanner;

public class P7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s  = sc.nextLine();
        System.out.println("ASCII value of " + s.charAt(0) + " : " + (int) s.charAt(0));
    }
}
