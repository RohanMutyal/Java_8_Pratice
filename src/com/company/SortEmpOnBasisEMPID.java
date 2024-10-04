package com.company;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Employee1 {
    private int id;
    private String name;

    public Employee1(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
public class SortEmpOnBasisEMPID {
    public static void main(String[] args) {

        List<Employee1> employees = new ArrayList<>();
        employees.add(new Employee1(103, "John"));
        employees.add(new Employee1(101, "Alice"));
        employees.add(new Employee1(102, "Bob"));

        System.out.println("Employees before sorting:");
        employees.forEach(System.out::println);

        // Sorting employees based on employee ID
        employees.sort(Comparator.comparing(Employee1::getId));

        System.out.println("\nEmployees after sorting based on ID:");
        employees.forEach(System.out::println);
    }

}
