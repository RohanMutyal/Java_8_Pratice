package com.company;

import javafx.print.Collation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateElement {
    public static void main(String []args){
//        List<Integer> list=new ArrayList<>();
//        list.add(1);
//        list.add(2);
//        list.add(2);
//        list.add(3);
//        list.add(4);

        List<Integer> list = Arrays.asList(1,2,3,2,4);

        List<Integer>result = list.stream().distinct().collect(Collectors.toList());
        System.out.println("Original List "+list);
       System.out.println("Removes Duplicate List "+result);
    }

}
