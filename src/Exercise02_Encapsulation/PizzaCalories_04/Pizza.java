package Exercise02_Encapsulation.PizzaCalories_04;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
    private String name;
    private Dough dough;
    private List<Topping> toppings;

    public Pizza(String name, int numberOfToppings) {
        this.setName(name);
        this.setToppings(numberOfToppings);
    }

    public void addTopping(Topping topping){
        this.toppings.add(topping);
    }

    public double getOverallCalories(){
        double toppingCalories = this.toppings.stream()
                .mapToDouble(Topping::calculateCalories)
                .sum();
        return this.dough.calculateCalories() + toppingCalories;
    }

    public String getName() {
        return name;
    }
    private void setName(String name) {
        if (name.trim().length() < 1 || name.trim().length() > 15){
            throw new IllegalArgumentException("Exercise02_Encapsulation.PizzaCalories_04.Pizza name should be between 1 and 15 symbols.");
        }
        this.name = name;
    }
    public void setDough(Dough dough) {
        this.dough = dough;
    }
    private void setToppings(int numberOfToppings) {
        if (numberOfToppings < 0 || numberOfToppings > 10){
            throw new IllegalArgumentException("NUmber of tooping should be in range [0..10].");
        }
        this.toppings = new ArrayList<>();
    }
}