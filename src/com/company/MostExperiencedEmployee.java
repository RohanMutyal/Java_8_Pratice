package com.company;

import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

class EmployeeM {
    private String name;
    private String department;
    private int yearsOfExperience;

    public EmployeeM(String name, String department, int yearsOfExperience) {
        this.name = name;
        this.department = department;
        this.yearsOfExperience = yearsOfExperience;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    @Override
    public String toString() {
        return "Employee{name='" + name + "', department='" + department + "', yearsOfExperience=" + yearsOfExperience + "}";
    }
}

public class MostExperiencedEmployee {
    public static void main(String[] args) {
        // Create a list of employees
        List<EmployeeM> employees = new ArrayList<>();
        employees.add(new EmployeeM("Alice", "Engineering", 5));
        employees.add(new EmployeeM("Bob", "Engineering", 10));
        employees.add(new EmployeeM("Charlie", "HR", 8));
        employees.add(new EmployeeM("David", "HR", 6));
        employees.add(new EmployeeM("Eve", "Sales", 12));
        employees.add(new EmployeeM("Frank", "Sales", 9));

        // Find the most experienced person in each department
        Map<String, Optional<EmployeeM>> mostExperiencedByDepartment = employees.stream()
                .collect(Collectors.groupingBy(
                        EmployeeM::getDepartment,
                        Collectors.maxBy(Comparator.comparingInt(EmployeeM::getYearsOfExperience))
                ));

        // Print the most experienced person in each department
        mostExperiencedByDepartment.forEach((department, employee) ->
                System.out.println(department + ": " + employee.orElse(null))
        );
    }
}




