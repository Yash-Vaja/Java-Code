package practice_work;

/*
 Write a program to demonstrate thread priorities
*/

class PriorityThread extends Thread {

    public void run() {
        System.out.println(
                "Thread Name: " + getName() +
                        " | Priority: " + getPriority()
        );
    }
}

public class P28 {
    public static void main(String[] args) {

        PriorityThread t1 = new PriorityThread();
        PriorityThread t2 = new PriorityThread();
        PriorityThread t3 = new PriorityThread();

        t1.setName("Low Priority Thread");
        t2.setName("Normal Priority Thread");
        t3.setName("High Priority Thread");

        t1.setPriority(Thread.MIN_PRIORITY);     // 1
        t2.setPriority(Thread.NORM_PRIORITY);    // 5
        t3.setPriority(Thread.MAX_PRIORITY);     // 10

        t1.start();
        t2.start();
        t3.start();
    }
}
