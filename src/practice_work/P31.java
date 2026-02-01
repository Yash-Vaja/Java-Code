package practice_work;


import java.util.Scanner;
import java.util.Arrays;

/*
 Write a Java application which accepts 10 students' names and ages.
 Sort names and age in descending order.
 Display the students using thread class at interval of one second.
*/

class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class DisplayStudents extends Thread {

     Student[] students;

    DisplayStudents( Student[] students) {
        this.students = students;
    }

    public void run() {
        try {
            for ( Student s : students) {
                System.out.println(s.name + " - " + s.age);
                Thread.sleep(1000);   // 1second delay
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}
public class P31 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
          Student[] students = new   Student[10];

        System.out.println("Enter name and age of 10 students:");

        for (int i = 0; i < 10; i++) {
            System.out.print((i+1)+" Name: ");
            String name = sc.nextLine();
            System.out.print((i+1)+" Age: ");
            int age = sc.nextInt();
            sc.nextLine();   // consume newline
            students[i] = new   Student(name, age);
        }

        // Sort in descending order of age
        Arrays.sort(students, (a, b) -> b.age - a.age);

          DisplayStudents t = new   DisplayStudents(students);
        t.start();

        sc.close();
    }
}
