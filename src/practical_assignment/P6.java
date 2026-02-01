package practical_assignment;

import java.util.Scanner;

/*
* Write a java application which accepts two strings. Merge both the strings
using alternate characters of each one. For example: If String1 is: "Very", and
String2 is: "Good". Then result should be: "VGeoroyd". in java.
* */
public class P6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String s1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String s2 = sc.nextLine();

        StringBuilder result = new StringBuilder();

        int i = 0;
        while (i < s1.length() || i < s2.length()) {

            if (i < s1.length()) {
                result.append(s1.charAt(i));
            }

            if (i < s2.length()) {
                result.append(s2.charAt(i));
            }

            i++;
        }

        System.out.println("Merged String: " + result);


    }
}