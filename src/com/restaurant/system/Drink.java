package com.restaurant.system;

public class Drink extends Product {
    private boolean alcoholic;

    public Drink(String name, double price, boolean isAlcoholic) {
        super(name, price);
        this.alcoholic = isAlcoholic;
    }

    public boolean isAlcoholic() {
        return alcoholic;
    }

    @Override
    public double calculateTax() {
/*        if (alcoholic) {
            return getPrice() * 0.19;
        } else {
            return getPrice() * 0.09;
        }*/
//        return alcoholic ? getPrice() * 0.19 : getPrice() * 0.09;
        double taxProcent = alcoholic ? 0.19 : 0.09;
        return getPrice() * taxProcent;
    }

    @Override
    public String toString() {
        return super.toString() + " is alcoholic = " + alcoholic;
    }
}
