package main;

import beverage.Beverage;
import beverage.Espresso;
import beverage.HouseBlend;
import decorator.Mocha;
import decorator.Soy;
import decorator.Whip;

public class StarbuzzCoffee {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        // HouseBlend coffee with double Mocha
       Beverage beverage1 = new HouseBlend();
       beverage1 = new Mocha(beverage1);
       beverage1 = new Mocha(beverage1);
       System.out.println(beverage1.getDescription() + " $" + beverage1.cost());

        // HouseBlend coffee with soy and whip
        Beverage beverage2 = new HouseBlend();
        beverage2 = new Soy(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription() +  " $" + beverage2.cost());
    }
}