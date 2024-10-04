package com.company;

public class StringComparision {

    public static void main(String[] args) {
        // Create two String objects with the same content
        String str1 = new String("hello");
        String str2 = new String("hello");

        // Create two String references pointing to the same object
        String str3 = "world";
        String str4 = "world";

        // Compare str1 and str2 using == operator
        if (str1 == str2) {
            System.out.println("str1 and str2 are the same object (==)"+true);
        } else {
            System.out.println("str1 and str2 are different objects (==)"+false);
        }

        // Compare str1 and str2 using equals() method
        if (str1.equals(str2)) {
            System.out.println("str1 and str2 have the same value (equals)"+true);
        } else {
            System.out.println("str1 and str2 have different values (equals)"+false);
        }

        // Compare str3 and str4 using == operator
        if (str3 == str4) {
            System.out.println("str3 and str4 are the same object (==)"+true);
        } else {
            System.out.println("str3 and str4 are different objects (==)"+false);
        }

        // Compare str3 and str4 using equals() method
        if (str3.equals(str4)) {
            System.out.println("str3 and str4 have the same value (equals)"+true);
        } else {
            System.out.println("str3 and str4 have different values (equals)"+false);
        }
    }
}
