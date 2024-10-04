package com.company;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

class Student1 {
    private String name;
    private int marks;

    public Student1(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }

    @Override
    public String toString() {
        return name + " (" + marks + ")";
    }
}

public class SecondHighestMarks {

    public static void main(String[] args) {
        List<Student1> students = Arrays.asList(
            new Student1("Alice", 85),
            new Student1("Bob", 92),
            new Student1("Charlie", 88),
            new Student1("David", 92),
            new Student1("Eve", 91)
        );

        Optional<Student1> secondHighest = students.stream()
            .sorted(Comparator.comparingInt(Student1::getMarks).reversed())
            .distinct()
            .skip(1)
            .findFirst();

        if (secondHighest.isPresent()) {
            System.out.println("The second highest marks are: " + secondHighest.get().getMarks());
        } else {
            System.out.println("There is no second highest marks.");
        }
    }
}
