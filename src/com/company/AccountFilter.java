package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class AccountFilter {
    public static void main(String[] args) {
        // Sample data
        List<String> names = new ArrayList<>();
        List<Integer> accountBalances = new ArrayList<>();

        names.add("Alice");
        accountBalances.add(75000);

        names.add("Bob");
        accountBalances.add(35000);

        names.add("Charlie");
        accountBalances.add(50000);

        names.add("David");
        accountBalances.add(90000);

        // Filter and print names with account balance greater than 50000
        //List<String> resultList =
                IntStream.range(0, names.size())
                .filter(i -> accountBalances.get(i) > 50000)
                .mapToObj(names::get) //.collect(Collectors.toList());
                .forEach(System.out::println);

       // resultList.forEach(e->System.out.println(e));
    }
}

