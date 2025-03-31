package com.restaurant.system;

public class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public double calculateTax() {
        return getPrice() * 0.09;
    }

    @Override
    public String toString() {
        return "Product [" + this.name + "] with price " + this.price + ", TVA=" + calculateTax();

    }
}
