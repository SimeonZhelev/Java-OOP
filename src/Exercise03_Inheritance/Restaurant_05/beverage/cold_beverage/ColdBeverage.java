package Exercise03_Inheritance.Restaurant_05.beverage.cold_beverage;

import Exercise03_Inheritance.Restaurant_05.beverage.Beverage;

import java.math.BigDecimal;

public class ColdBeverage extends Beverage {
    public ColdBeverage(String name, BigDecimal price, double milliliters) {
        super(name, price, milliliters);
    }
}
