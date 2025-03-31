package com.restaurant.system;

public class Food extends Product {
    private int preparationTime;

    public Food(String name, double price, int preparationTime) {
        super(name, price);
        this.preparationTime = preparationTime;
    }

    public int getPreparationTime() {
        return preparationTime;
    }

    @Override
    public String toString() {
//        return "Product [" + this.getName() + "] with price " + this.getPrice() + " and preparationTime is " + preparationTime + " minutes";
        return super.toString() + " and preparation time " + preparationTime + " minutes";
    }
}
