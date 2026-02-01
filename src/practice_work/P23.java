package practice_work;

import java.util.Scanner;

/*
Write a program to input two strings search similar characters from both
string and replace it with ‘*’.
*/
public class P23 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String s1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String s2 = sc.nextLine();

        char[] a = s1.toCharArray();
        char[] b = s2.toCharArray();

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    a[i] = '*';
                    b[j] = '*';
                }
            }
        }

        System.out.println("Modified first string: " + new String(a));
        System.out.println("Modified second string: " + new String(b));

        sc.close();
    }
}