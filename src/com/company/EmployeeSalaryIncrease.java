package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeSalaryIncrease {
    public static void main(String[] args) {
        // Create a list of employees
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("John", 18000));
        employees.add(new Employee("Jane", 25000));
        employees.add(new Employee("Bob", 15000));
        employees.add(new Employee("Alice", 30000));

        // Filter employees with salary less than 20000 and increase their salary by 10%
        List<Employee> updatedEmployees = employees.stream()
                .filter(employee -> employee.getSalary() < 20000)
                .peek(employee -> employee.setSalary(employee.getSalary() * 1.2))
                .collect(Collectors.toList());

        // Print updated employees
        System.out.println("Updated employees:");
        updatedEmployees.forEach(System.out::println);

        // Print all employees to see the changes reflected
        System.out.println("\nAll employees:");
        employees.forEach(System.out::println);
    }
}
