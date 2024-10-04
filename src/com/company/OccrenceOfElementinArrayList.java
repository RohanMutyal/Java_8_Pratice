package com.company;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class OccrenceOfElementinArrayList {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,2,4,4,2,3);

        Map<Integer, Integer> occurrenceMap = new HashMap<>();
        // Counting occurrences using Java 8 streams
        list.forEach(element -> occurrenceMap.put(element, occurrenceMap.getOrDefault(element, 0) + 1));

        System.out.println("Element : Occurrence Count");

        occurrenceMap.forEach((element, count) -> System.out.println(element + " : " + count));
    }
}
