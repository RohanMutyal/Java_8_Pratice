package com.company;

import sun.security.mscapi.CKeyPairGenerator;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class ProgramPratice {
    public static void main(String[] args) {

        List<Integer> intList = Arrays.asList(5,7,3,4,6,9,5,2);

        intList.stream().map(e -> (e*3)  ).forEach(e ->System.out.println(e));

        HashMap<Integer,String> newmap = new HashMap<>();
        newmap.put(1,"Rohan");
        newmap.put(2,"Rohit");
        newmap.put(3,"Rohul");
        newmap.put(4,"Raman");


    }
}
