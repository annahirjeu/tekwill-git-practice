package com.restaurant.system;

import java.util.Date;

public class Application {

    public static void main(String[] args) {
        Drink drink = new Drink("D1", 15.6, false);
        Drink drink2 = new Drink("D2", 15.6, true);

        Food food = new Food("F1", 52.2, 15);
        Food food1 = new Food("F2", 52.2, 15);
        Food food2 = new Food("F3", 52.2, 15);
        Order order = new Order("ORD123456", new Date(), new Product[]{drink, drink2});
        System.out.println(order.toString());

        order.addProduct(food);
        System.out.println(order.toString());

        order.addProduct(new Product[]{food1, food2});
        System.out.println(order.toString());

    }
}
