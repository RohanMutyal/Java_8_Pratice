package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class EmployeeFilter {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("John", 25000));
        employees.add(new Employee("Alice", 18000));
        employees.add(new Employee("Bob", 30000));
        employees.add(new Employee("Carol", 22000));

        // Filtering employees with salary greater than 20000
        List<Employee> highSalaryEmployees = employees.stream()
                .filter(e -> e.getSalary() > 20000)
                .collect(Collectors.toList());


        // Printing the all employees
        System.out.println("Names of employees: Approach 1 ");
        employees.forEach(e -> System.out.println(e.getName()));
        System.out.println("Names of employees: Approach 2 ");
        employees.stream()
                .map(Employee::getName)
                .forEach(System.out::println);

        // Printing the filtered employees
        System.out.println("Employees with salary greater than 20000:");
        highSalaryEmployees.forEach(e -> System.out.println(e.getName() + " - " + e.getSalary()));
    }
}
