package Exercise03_Inheritance.Restaurant_05.food.dessert;

import Exercise03_Inheritance.Restaurant_05.food.Food;

import java.math.BigDecimal;

public class Dessert extends Food {
    private double calories;
    public Dessert(String name, BigDecimal price, double grams, double calories) {
        super(name, price, grams);
        this.calories = calories;
    }

    public double getCalories() {
        return calories;
    }
}
