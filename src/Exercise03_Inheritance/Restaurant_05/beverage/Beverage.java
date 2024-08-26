package Exercise03_Inheritance.Restaurant_05.beverage;

import Exercise03_Inheritance.Restaurant_05.Product;

import java.math.BigDecimal;

public class Beverage extends Product {

    private double milliliters;
    public Beverage(String name, BigDecimal price, double milliliters) {
        super(name, price);
        this.milliliters = milliliters;
    }

    public double getMilliliters() {
        return milliliters;
    }
}
