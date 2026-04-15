package com.restaurant.system;

import enums.OrderStatus;

import java.util.Date;

public class Order {
    private String orderId;
    private Date orderDate;
    private Product[] products;
    private OrderStatus status;

    public Order(OrderStatus orderStatus) {
        this.status = orderStatus;
    }

    public String getOrderId() {
        return orderId;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Order(String orderId, Date createdDate, Product[] products) {
        this.orderId = orderId;
        this.orderDate = createdDate;
        this.products = products;
    }

    public void addProduct(Product product) {
        Product[] refreshedProducts = new Product[products.length + 1];
        int newSize = refreshedProducts.length;
        for (int i = 0; i < products.length; i++) {
            refreshedProducts[i] = products[i];
        }
        refreshedProducts[newSize - 1] = product;
        products = refreshedProducts;
    }

    public void addProduct(Product[] newProducts) {
        Product[] refreshedProducts = new Product[products.length + newProducts.length];// 2 + 3 = 5
        for (int i = 0; i < products.length; i++) {
            refreshedProducts[i] = products[i];
        }
        int initialSize = products.length;
        for (int i = 0; i < newProducts.length; i++) {
            refreshedProducts[i + initialSize] = newProducts[i];
        }
        this.products = refreshedProducts;
    }

    public double calculateTotalPrice() {
        double total = 0.0;
        boolean onlyNonAlcoholic = true;

        for (Product product : products) {
            total += product.getPrice() + product.calculateTax();
            if (product instanceof Drink && ((Drink) product).isAlcoholic()) {
                onlyNonAlcoholic = false;
            }
        }

        if (onlyNonAlcoholic) total *= 0.95;

        return total;
    }


    @Override
    public String toString() {
        String log = "Order with code[" + orderId + "] created on [" + orderDate + "] has products[  \n";
        for (Product product : products) {
            log = log.concat(product.toString());
            log = log.concat(", \n");
        }
        log = log.concat("];");
        return log;
    }
}
