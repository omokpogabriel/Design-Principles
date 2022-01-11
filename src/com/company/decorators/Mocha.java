package com.company.decorators;

import com.company.beverages.Beverage;

public class Mocha extends Complimentors{

    @Override
    public double cost() {
        return beverage.cost() + 1.45;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }
}
