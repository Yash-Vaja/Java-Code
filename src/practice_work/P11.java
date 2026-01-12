package practice_work;/*
Write a Java program to get the larger value between first and
last element of an array (length 3) of integers. Go to the
editor.
Sample Output: Original Array: [20, 30, 40]
Larger value between first and last element: 40
*/

import java.util.Scanner;

public class P11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[3];
        int m = -1;
        System.out.println("Enter 3 integers:");
        for (int i = 0; i < 3; i++) {
            arr[i] = sc.nextInt();
            m = Math.max(m,arr[i]);
        }

        System.out.println("Larger value between first and last element: " + m);
    }
}
