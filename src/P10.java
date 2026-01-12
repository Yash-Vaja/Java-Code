/*
 Write a program to input Employee Details and display it on
proper format. (Employee id, Employee name, Salary,
Department)
*/

import java.util.Scanner;

public class P10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee ID: ");
        int empId = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Employee Name: ");
        String empName = sc.nextLine();

        System.out.print("Enter Salary: ");
        double salary = sc.nextDouble();
        sc.nextLine(); // consume newline

        System.out.print("Enter Department: ");
        String department = sc.nextLine();

        System.out.println("\n----- Employee Details -----");
        System.out.println("Employee ID   : " + empId);
        System.out.println("Employee Name : " + empName);
        System.out.println("Salary        : " + salary);
        System.out.println("Department    : " + department);
    }
}
