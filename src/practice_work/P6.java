package practice_work;/*Write a Java program to count the letters,spaces, numbers
        and other characters of an input string.*/

import java.util.*;

public class P6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        int letters = 0;
        int spaces = 0;
        int numbers = 0;
        int others = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (Character.isLetter(ch)) {
                letters++;
            } else if (Character.isDigit(ch)) {
                numbers++;
            } else if (ch == ' ') {
                spaces++;
            } else {
                others++;
            }
        }

        System.out.println("Letters = " + letters);
        System.out.println("Spaces = " + spaces);
        System.out.println("Numbers = " + numbers);
        System.out.println("Other characters = " + others);

    }
}
