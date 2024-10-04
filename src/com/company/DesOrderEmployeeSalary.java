package com.company;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class DesOrderEmployeeSalary {

    public static void main(String[] args) {
        // Creating a list of employees
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("John", 50000));
        employees.add(new Employee("Alice", 60000));
        employees.add(new Employee("Bob", 45000));
        employees.add(new Employee("Emma", 70000));

        // Sorting employees by salary in descending order using Java 8 streams
        employees.sort(Comparator.comparing(Employee::getSalary).reversed());

        // Printing the sorted list
        System.out.println("Employees sorted by salary in descending order:");
        employees.forEach(employee -> System.out.println(employee.getName() + ": $" + employee.getSalary()));
    }
}
