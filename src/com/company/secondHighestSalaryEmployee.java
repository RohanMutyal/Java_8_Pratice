package com.company;

import java.util.Arrays;
import java.util.List;

public class secondHighestSalaryEmployee {
    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee("John", 50000),
                new Employee("Alice", 72000),
                new Employee("Bob", 70000),
                new Employee("Jane", 55000),
                new Employee("Michael", 75000)
        );

        double secondHighestSalary = employees.stream()
                .mapToDouble(Employee::getSalary)
                .distinct() // Remove duplicates
                .sorted()
                .skip(Math.max(0, employees.size() - 1)) // Skip the highest salary
                .findFirst()
                .orElse(Double.NaN); // If there's no second highest salary

        if (!Double.isNaN(secondHighestSalary)) {
            System.out.println("Second highest salary: " + secondHighestSalary);
        } else {
            System.out.println("No second highest salary found.");
        }
    }
}
