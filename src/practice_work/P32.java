package practice_work;

import java.util.Scanner;

/*
 Write a Java program that creates Singly Linked List
 to perform create, insert, delete and display node
 using menu driven program.
*/

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class P32 {
    static Node head = null;

    // Create / Insert at beginning
    static void insert(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        System.out.println("Node inserted");
    }

    // Delete from beginning
    static void delete() {
        if (head == null) {
            System.out.println("List is empty");
        } else {
            head = head.next;
            System.out.println("Node deleted");
        }
    }

    // Display list
    static void display() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node temp = head;
        System.out.print("Linked List: ");
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice, value;

        do {
            System.out.println("\n--- Singly Linked List Menu ---");
            System.out.println("1. Insert Node");
            System.out.println("2. Delete Node");
            System.out.println("3. Display List");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value: ");
                    value = sc.nextInt();
                    insert(value);
                    break;

                case 2:
                    delete();
                    break;

                case 3:
                    display();
                    break;

                case 4:
                    System.out.println("Exiting program");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 4);

        sc.close();
    }
}
