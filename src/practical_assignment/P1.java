package practical_assignment;

/*
 Write a program to accept 5 command line arguments and
 raise a custom exception if any argument is not from
 the list ("BCA","MCA","BBA","MBA","OTHER").
*/

import java.util.Scanner;

public class P1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = new String[5];

        for (int i=0;i<5;i++){
            System.out.print("Enter string " + (i + 1) + " : ");
            checkCourse(sc.next());
        }

        System.out.println("All course inputs are valid");
    }

    static void checkCourse(String s) {
        if (!(s.equalsIgnoreCase("BCA") ||
                s.equalsIgnoreCase("MCA") ||
                s.equalsIgnoreCase("BBA") ||
                s.equalsIgnoreCase("MBA") ||
                s.equalsIgnoreCase("OTHER"))) {

            throw new CourseException("Invalid Course: " + s);
        }
    }
}

/* Custom Exception */
class CourseException extends RuntimeException {
    CourseException(String message) {
        super(message);
    }
}
