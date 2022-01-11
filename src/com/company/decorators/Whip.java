package com.company.decorators;

import com.company.beverages.Beverage;

public class Whip extends Complimentors{

    @Override
    public double cost() {
        return beverage.cost() + 10;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }
}
