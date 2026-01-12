package practice_work;// Write a Java program to reverse a string

import java.util.*;

public class P4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        StringBuffer sb = new StringBuffer(s);
        System.out.println("reverse : " + sb.reverse() );
    }
}
