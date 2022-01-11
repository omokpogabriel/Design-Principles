package com.company.beverages;

public class DarkRoast extends Beverage {

    @Override
    public double cost() {
        return 3.6;
    }

    @Override
    public String getDescription() {
        return "Your order is DarkRoast";
    }
}
