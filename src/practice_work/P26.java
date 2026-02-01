package practice_work;

/*
Write an application that executes three threads from one thread class.
One thread displays “JAVA” every 1 second. another display “PAPER”
every 2 seconds and last one displays “COLLEGE”every 3 seconds. Create
the thread by using Runnable Interface.
*/


class PrintMessage implements Runnable {

    String message;
    int time;

    PrintMessage(String message, int time) {
        this.message = message;
        this.time = time;
    }

    public void run() {
        try {
            while (true) {
                System.out.println(message);
                Thread.sleep(time);
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

public class P26 {
    public static void main(String[] args) {

        Thread t1 = new Thread(new PrintMessage("JAVA", 1000));
        Thread t2 = new Thread(new PrintMessage("PAPER", 2000));
        Thread t3 = new Thread(new PrintMessage("COLLEGE", 3000));

        t1.start();
        t2.start();
        t3.start();
    }
}
