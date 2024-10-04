package com.company;

import java.util.concurrent.ConcurrentHashMap;
import java.util.Map;

class EmployeeP {
    private String name;
    private String address;
    private String pincode;

    public EmployeeP(String name, String address, String pincode) {
        this.name = name;
        this.address = address;
        this.pincode = pincode;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPincode() {
        return pincode;
    }

    @Override
    public String toString() {
        return "Employee{name='" + name + "', address='" + address + "', pincode='" + pincode + "'}";
    }
}

public class EmpPincodeStream {
    public static void main(String[] args) {
        // Create a ConcurrentHashMap of employees
        ConcurrentHashMap<Integer, EmployeeP> employees = new ConcurrentHashMap<>();
        employees.put(1, new EmployeeP("John", "123 Main St", "700123"));
        employees.put(2, new EmployeeP("Jane", "456 Maple Ave", "600456"));
        employees.put(3, new EmployeeP("Bob", "789 Oak Dr", "700789"));
        employees.put(4, new EmployeeP("Alice", "101 Pine Rd", "800101"));

        // Remove employees whose pincode starts with "700"
        employees.entrySet().removeIf(entry -> entry.getValue().getPincode().startsWith("700"));

        // Print remaining employees
        System.out.println("Remaining employees:");
        employees.forEach((id, employee) -> System.out.println(employee));
    }
}


