package com.company;
import java.util.*;
import java.util.stream.Collectors;

//Below is a Java 8 program that demonstrates how to get the highest salaried person from
// each department using streams and lambda expressions:


class EmployeeN {
    private String name;
    private String department;
    private double salary;

    public EmployeeN(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }
}

public class HighestSalaryEachDept {
    public static void main(String[] args) {
        List<EmployeeN> employees = Arrays.asList(
                new EmployeeN("John", "HR", 75000),
                new EmployeeN("Alice", "HR", 60000),
                new EmployeeN("Bob", "IT", 70000),
                new EmployeeN("David", "IT", 80000),
                new EmployeeN("Emily", "Finance", 90000),
                new EmployeeN("Frank", "Finance", 100000)
        );

        Map<String, Optional<EmployeeN>> highestSalariedEmployeesByDept = employees.stream()
                .collect(Collectors.groupingBy(EmployeeN::getDepartment,
                        Collectors.maxBy(Comparator.comparingDouble(EmployeeN::getSalary))));

        highestSalariedEmployeesByDept.forEach((department, employee) -> {
            System.out.println("Highest salaried employee in department " + department + ":");
            employee.ifPresent(System.out::println);
        });
    }
}
