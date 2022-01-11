package com.company;

import com.company.beverages.Beverage;
import com.company.beverages.DarkRoast;
import com.company.decorators.Mocha;
import com.company.decorators.Whip;

public class Main {

    public static void main(String[] args) {

        Beverage bev = new DarkRoast();
        bev = new Mocha(bev);
        bev = new Whip(bev);
        System.out.println(bev.getDescription() );
        System.out.println(bev.cost() );
    }
}
