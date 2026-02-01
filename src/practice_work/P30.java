package practice_work;

/*
 Write a Java application which displays
 current Date and Time using Thread class
*/

import java.util.Date;

class DateTimeThread extends Thread {

    public void run() {
        Date d = new Date();
        System.out.println("Current Date and Time: " + d);
    }
}
public class P30 {

    public static void main(String[] args) {

        DateTimeThread t = new DateTimeThread();
        t.start();
    }
}
