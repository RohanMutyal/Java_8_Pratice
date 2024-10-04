package com.company;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

class Person {
    private String name;
    private int age;
    private String occupation;

    public Person(String name, int age, String occupation) {
        this.name = name;
        this.age = age;
        this.occupation = occupation;
    }

    // Implement equals() and hashCode() methods to define equality based on name, age, and occupation
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && name.equals(person.name) && occupation.equals(person.occupation);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + age;
        result = 31 * result + occupation.hashCode();
        return result;
    }



    // Getters and setters
    // Implement if needed

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }
}



public class UniquePersonsList {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Victoria", 25, "Firefighter"));
        persons.add(new Person("Grace", 27, "Footballer"));
        persons.add(new Person("Samantha", 25, "Stock Broker"));
        persons.add(new Person("Jane", 27, "Footballer"));
        persons.add(new Person("Samantha", 25, "Stock Broker"));

        // Remove duplicates
        List<Person> uniquePersons = persons.stream().distinct().collect(Collectors.toList());


        // Print unique persons
        System.out.println("Unique Persons:");
        for (Person person : uniquePersons) {
            System.out.println(person.getName() + ", " + person.getAge() + ", " + person.getOccupation());
        }
    }
}
