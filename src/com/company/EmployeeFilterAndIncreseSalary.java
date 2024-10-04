package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//[12:46 PM] Kumar, Rishav
//filter the salary of the employee whose salary is more than 50k and then increment their salary by 10%
public class EmployeeFilterAndIncreseSalary {
    public static void main(String[] args) {

        ArrayList<Employee>list=new ArrayList<>();
        list.add(new Employee("Rohan",52000));
        list.add(new Employee("Prasjangt",62000));
        list.add(new Employee("Rahul",42000));
        list.add(new Employee("Ramana",22000));

        List<Employee> result = list.stream()
                                .filter(employee -> employee.getSalary() > 50000)
                                .peek(employee -> employee.setSalary(employee.getSalary() * 1.1))
                                .collect(Collectors.toList());

        result.forEach(e->System.out.println(e.getName()+" "+e.getSalary()));
    }
}
