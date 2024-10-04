package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ListOfEmployee {
    public static void main(String[] args) {

        List<Employee> list=new ArrayList<>();
        list.add(new Employee("Rohan",12000));
        list.add(new Employee("sumathi",12000));
        list.add(new Employee("Suresh",12000));
        list.add(new Employee("Sushant",12000));

        List<Employee>result=list.stream().filter(e->e.getName().toLowerCase().startsWith("su")).collect(Collectors.toList());
        result.forEach(e-> System.out.println(e.getName()));


    }
}
