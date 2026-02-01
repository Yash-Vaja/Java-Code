package practical_assignment;

import java.util.Scanner;
import java.util.Arrays;

/*
 Write a Java code which accepts names of 10 students,
 sorts them in ascending order and displays the names
 using thread class at interval of one second.
*/

class DisplayNames extends Thread {

    String[] names;

    DisplayNames(String[] names) {
        this.names = names;
    }

    public void run() {
        try {
            for (String name : names) {
                System.out.println(name);
                Thread.sleep(1000);   // 1 second delay
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

public class P9 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] names = new String[10];

        System.out.println("Enter names of 10 students:");

        for (int i = 0; i < 10; i++) {
            names[i] = sc.nextLine();
        }

        Arrays.sort(names);   // Ascending order

        DisplayNames t = new DisplayNames(names);
        t.start();

        sc.close();
    }
}
