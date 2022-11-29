package com.bridgelabz;

import java.util.ArrayList;
import java.util.Scanner;

public class Company {
    Employee employee;
    ArrayList<Employee> arrayList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    void show() {
        Employee employee = new Employee();
        String name;
        System.out.println("Enter name");
        name = scanner.next();
        long phoneNumber;
        System.out.println("Enter phone number");
        phoneNumber = scanner.nextLong();
        String city;
        System.out.println("Enter city");
        city = scanner.next();
        String state;
        System.out.println("Enter state");
        state = scanner.next();
        String department;
        System.out.println("Enter department");
        department = scanner.next();
        System.out.println(arrayList);
    }
    public static void main(String[] args) {
        ArrayList<Employee> arrayList = new ArrayList<>();
        System.out.println("Enter the employees in company1:");
        Company company1 = new Company();
        company1.show();
        System.out.println("Enter the employees in company2:");
        Company company2 = new Company();
        company2.show();
    }
}


