package restaurant;

import javax.naming.spi.ResolveResult;

public class LaunchRestaurant {
    public static void main(String[] args) {
//        Restaurant restaurant = new Restaurant("Ca acasa");
/*
        Restaurant.Menu menu = restaurant.createMenu();
        menu.afiseazaMenu();

        Restaurant.Menu menu1 = restaurant.new Menu(); //non-static inner class object creation

        Restaurant.CalculatorTaxe calculatorTaxe = new Restaurant.CalculatorTaxe(); //static inner class object creation
        calculatorTaxe.calculTaxe(15, 20);
           restaurant.callPolice();
        */


        Restaurant[] restaurantArray = new Restaurant[2];
        restaurantArray[0] = new Restaurant("Ca acasa");
        restaurantArray[1] = new Restaurant("La Maruca");

        Restaurant restaurant = new Restaurant("jhdgsj");
        Restaurant restaurant1 = new Restaurant("jgjh");

        Restaurant[] restaurants = {restaurant, restaurant1};
    }


}
