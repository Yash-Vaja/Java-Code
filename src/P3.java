//Write a Java program to print the sum (addition), multiply,
//        subtract, divide and remainder of two numbers arithmetic
//        operation will be of user choice.
import java.util.*;

public class P3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        int a, b;

        do {

            System.out.println("\nChoose operation:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Remainder");
            System.out.println("6. Exit");

            choice = sc.nextInt();
            if (choice == 6){


                System.out.println("Exiting...");
            break;
            }
            System.out.println("\nEnter first number:");
            a = sc.nextInt();

            System.out.println("Enter second number:");
            b = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Addition = " + (a + b));
                    break;

                case 2:
                    System.out.println("Subtraction = " + (a - b));
                    break;

                case 3:
                    System.out.println("Multiplication = " + (a * b));
                    break;

                case 4:
                    if (b != 0)
                        System.out.println("Division = " + (a / b));
                    else
                        System.out.println("Cannot divide by zero");
                    break;

                case 5:
                    System.out.println("Remainder = " + (a % b));
                    break;

                case 6:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 6);
    }
}
