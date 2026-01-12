package practice_work;

import java.util.Scanner;

public class P13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        do {
            System.out.println("\nChoose an option:");
            System.out.println("1. UPPERCASE");
            System.out.println("2. lowercase");
            System.out.println("3. Sentence Case");
            System.out.println("4. Toggle CASE");
            System.out.println("5. Exit");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Result: " + str.toUpperCase());
                    break;

                case 2:
                    System.out.println("Result: " + str.toLowerCase());
                    break;

                case 3:
                    String sentence = "";
                    boolean firstChar = true;

                    for (int i = 0; i < str.length(); i++) {
                        char ch = str.charAt(i);

                        if (firstChar && Character.isLetter(ch)) {
                            sentence += Character.toUpperCase(ch);
                            firstChar = false;
                        } else {
                            sentence += Character.toLowerCase(ch);
                        }
                    }
                    System.out.println("Result: " + sentence);
                    break;

                case 4:
                    String toggle = "";

                    for (int i = 0; i < str.length(); i++) {
                        char ch = str.charAt(i);

                        if (Character.isUpperCase(ch)) {
                            toggle += Character.toLowerCase(ch);
                        } else if (Character.isLowerCase(ch)) {
                            toggle += Character.toUpperCase(ch);
                        } else {
                            toggle += ch;
                        }
                    }
                    System.out.println("Result: " + toggle);
                    break;

                case 5:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 5);
    }
}
