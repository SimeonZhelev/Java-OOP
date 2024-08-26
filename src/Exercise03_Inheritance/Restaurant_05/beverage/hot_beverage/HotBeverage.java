package Exercise03_Inheritance.Restaurant_05.beverage.hot_beverage;

import Exercise03_Inheritance.Restaurant_05.beverage.Beverage;

import java.math.BigDecimal;

public class HotBeverage extends Beverage {
    public HotBeverage(String name, BigDecimal price, double milliliters) {
        super(name, price, milliliters);
    }
}
