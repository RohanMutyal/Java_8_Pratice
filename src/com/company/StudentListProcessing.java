package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Student {
    private String name;
    private int id;
    private int marks;

    public Student(String name, int id, int marks) {
        this.name = name;
        this.id = id;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getMarks() {
        return marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", marks=" + marks +
                '}';
    }
}

public class StudentListProcessing {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("John Smith", 1, 80),
                new Student("Alice Johnson", 2, 90),
                new Student("Emma Watson", 3, 85),
                new Student("Michael Bush", 4, 95),
                new Student("Sophia Smith", 5, 88)
        );

        List<Student> filteredStudents = students.stream()
                .filter(student -> student.getName().endsWith("sh"))
                .sorted((s1, s2) -> s1.getName().compareTo(s2.getName()))
                .collect(Collectors.toList());

        System.out.println("Filtered and sorted students whose name ends with 'sh': ");
        filteredStudents.forEach(student ->
                System.out.println("Name: " + student.getName() + ", ID: " + student.getId() + ", Marks: " + student.getMarks()));
    }
}
