package practical_assignment;

/*
 Write a program to demonstrate custom exception called
 NagetiveNumberArgumentException
*/

import java.util.Scanner;

class NagetiveNumberArgumentException extends Exception {
    NagetiveNumberArgumentException(String message) {
        super(message);
    }
}
public class P3 {
    static void checkNumber(int num) throws NagetiveNumberArgumentException {
        if (num < 0) {
            throw new NagetiveNumberArgumentException("Negative number is not allowed");
        } else {
            System.out.println("Valid number: " + num);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter a number: ");
            int number = sc.nextInt();
            checkNumber(number);
        } catch (NagetiveNumberArgumentException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println("Please provide a valid integer");
        }
    }
}
