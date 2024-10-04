package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeNameStartWith {
    public static void main(String[] args) {

        List<Employee>employeeList=new ArrayList<>();
        employeeList.add(new Employee("Rohan",50000));
        employeeList.add(new Employee("Prashant",20000));
        employeeList.add(new Employee("Pradnya",10000));
        employeeList.add(new Employee("Pravin",70000));
        employeeList.add(new Employee("Rohit",80000));
        employeeList.add(new Employee("Diksha",90000));
        employeeList.add(new Employee("Gitanjali",60000));

        List<Employee>employeeListStartWith= employeeList.stream().
                                             filter(e-> e.getName().toLowerCase().startsWith("pra")).
                                             collect(Collectors.toList());

        employeeListStartWith.forEach(e->System.out.println(e.getName()+"  "+e.getSalary()));

    }
}
