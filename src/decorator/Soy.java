package decorator;

import beverage.Beverage;

public class Soy extends CondimentDecorator {
    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " Soy";
    }

    @Override
    public double cost() {
        return 0.10 + beverage.cost();
    }
}
