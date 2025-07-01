package com.vaishalivetal.studentgradecalculator;
import java.util.ArrayList;
import java.util.Scanner;

class Student {
    int id;
    String name;
    int age;

    Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println("ID: " + id + " | Name: " + name + " | Age: " + age);
    }
}

public class StudentManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        while (true) {
            System.out.println("\n---- Student Management System ----");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Search Student by ID");
            System.out.println("4. Delete Student by ID");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            if (choice == 1) {
                System.out.print("Enter ID: ");
                int id = sc.nextInt();
                sc.nextLine();  // clear buffer
                System.out.print("Enter Name: ");
                String name = sc.nextLine();
                System.out.print("Enter Age: ");
                int age = sc.nextInt();
                students.add(new Student(id, name, age));
                System.out.println("Student added successfully.");

            } else if (choice == 2) {
                if (students.isEmpty()) {
                    System.out.println("No student records found.");
                } else {
                    System.out.println("All Students:");
                    for (Student s : students) {
                        s.display();
                    }
                }

            } else if (choice == 3) {
                System.out.print("Enter Student ID to search: ");
                int id = sc.nextInt();
                boolean found = false;
                for (Student s : students) {
                    if (s.id == id) {
                        s.display();
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    System.out.println("Student not found.");
                }

            } else if (choice == 4) {
                System.out.print("Enter Student ID to delete: ");
                int id = sc.nextInt();
                boolean deleted = false;
                for (int i = 0; i < students.size(); i++) {
                    if (students.get(i).id == id) {
                        students.remove(i);
                        System.out.println("Student deleted.");
                        deleted = true;
                        break;
                    }
                }
                if (!deleted) {
                    System.out.println("Student not found.");
                }

            } else if (choice == 5) {
                System.out.println("Exiting... Thank you!");
                break;

            } else {
                System.out.println("Invalid choice. Try again.");
            }
        }

        sc.close();
    }
}
