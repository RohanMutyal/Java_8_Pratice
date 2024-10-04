package com.company;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ArraySortandDistinct {
    public static void main(String[] args) {

        List<Integer> intarray = Arrays.asList(3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5);

        List<Integer> result = intarray.stream().sorted().distinct().collect(Collectors.toList());

        System.out.println(result.toString());
        //result.forEach(arr -> System.out.print(arr+"  "));

    }
}

