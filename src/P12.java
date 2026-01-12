/*
* Write a Java program to reverse a word
* */

import java.util.Scanner;

public class P12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String s  = sc.next();
        StringBuffer sb = new StringBuffer(s);
        System.out.println("Word: " + sb.reverse());
    }
}
