package com.company;

import java.util.Arrays;
import java.util.List;


class EmployeeF {
    private int id;
    private String name;
    private double salary;

    public EmployeeF(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }


    @Override
    public String toString() {
        return "Employee{name='" + name + "', salary=" + salary + '}';
    }
}
public class FilterEmpSalarySum {
    public static void main(String[] args) {

        List<EmployeeF> employees = Arrays.asList(
                new EmployeeF(5001,"John", 50000),
                new EmployeeF(5002,"Alice", 72000),
                new EmployeeF(50,"Bob", 70000),
                new EmployeeF(12,"Jane", 55000),
                new EmployeeF(508,"Michael", 75000)
        );

        double sumofSalary = employees.stream().filter(e -> e.getId() >5000).mapToDouble(EmployeeF::getSalary).sum();
        System.out.println("Total Employees Salary ID > 5000 = "+ sumofSalary);
    }
}
