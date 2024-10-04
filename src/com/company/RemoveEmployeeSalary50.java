package com.company;

import java.util.ArrayList;
import java.util.List;

public class RemoveEmployeeSalary50 {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("John", 45000));
        employees.add(new Employee("Alice", 55000));
        employees.add(new Employee("Bob", 60000));

        System.out.println("Employees before removal:");
        employees.forEach(System.out::println);

        // Remove employees with salary > 50000
        employees.removeIf(employee -> employee.getSalary() > 50000);

        System.out.println("\nEmployees after removal:");
        employees.forEach(System.out::println);
    }

}
