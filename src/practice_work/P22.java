package practice_work;

import java.util.Scanner;

/*
 Write a program to input strings and display those
 which start with 'A' or 'a' using Scanner.
*/
public class P22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many strings? ");
        int n = sc.nextInt();
        sc.nextLine();



        for (int i = 0; i < n; i++) {
            System.out.print("Enter strings:");
            String s = sc.nextLine();

            if (s.startsWith("A") || s.startsWith("a")) {
                System.out.println(s);
            }
        }
    }
}
