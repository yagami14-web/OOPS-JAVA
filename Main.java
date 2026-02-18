package lab4;

import java.util.Scanner;

class Employee {
    String name;
    int age;
    double salary = 200000;

    void insertData(String n, int a) {
        if (n.length() <= 20 && a > 5) {
            name = n;
            age = a;
            System.out.println("Data inserted successfully");
        } else {
            System.out.println("Invalid input");
        }
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Employee emp = new Employee();

        System.out.print("Enter name (max 20 characters): ");
        String name = sc.nextLine();

        System.out.print("Enter age (>5): ");
        int age = sc.nextInt();

        emp.insertData(name, age);
        emp.display();

        sc.close();
    }
}


