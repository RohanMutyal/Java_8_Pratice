package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Product {
    private String name;
    private double actualAmount;
    private double marketPrice;

    public Product(String name, double actualAmount, double marketPrice) {
        this.name = name;
        this.actualAmount = actualAmount;
        this.marketPrice = marketPrice;
    }

    public String getName() {
        return name;
    }

    public double getActualAmount() {
        return actualAmount;
    }

    public double getMarketPrice() {
        return marketPrice;
    }

    public double getPriceDifference() {
        return actualAmount - marketPrice;
    }
}

public class ProductList {

    public static void main(String[] args) {


        // Sample product list
        List<Product> productList = new ArrayList<>();
        productList.add(new Product("Product A", 50.0, 45.0));
        productList.add(new Product("Product B", 30.0, 35.0));
        productList.add(new Product("Product C", 25.0, 20.0));

        // Calculate the price difference for each product using Java 8 Streams
        List<String> priceDifferences = productList.stream()
                .map(product -> product.getName() + ": " + product.getPriceDifference())
                .collect(Collectors.toList());

        // Print the result
        System.out.println("Price differences:");
        priceDifferences.forEach(System.out::println);
    }
}
