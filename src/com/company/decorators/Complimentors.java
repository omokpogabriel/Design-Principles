package com.company.decorators;

import com.company.beverages.Beverage;

public abstract class Complimentors extends Beverage {
    Beverage beverage;

    public abstract double cost();

    public abstract String getDescription();
}
