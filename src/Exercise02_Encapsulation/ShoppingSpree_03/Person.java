package Exercise02_Encapsulation.ShoppingSpree_03;

import java.util.ArrayList;
import java.util.List;

public class Person {

    private String name;
    private double money;
    private List<Product> products;

    public Person(String name, double money) {
        this.setName(name);
        this.setMoney(money);
        this.products = new ArrayList<>();
    }

    public void buyProduct(Product product){
        if (this.money < product.getCost()){
            throw new IllegalArgumentException(
                    String.format("%s cannot afford %s%n",this.name, product.getName()));
        }
        System.out.printf("%s bought %s\n",this.name, product.getName());
        this.products.add(product);
        this.money -= product.getCost();
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        if (null == name || name.trim().isEmpty()){
            throw new IllegalArgumentException("Name cannot be empty");
        }
        this.name = name;
    }

    private void setMoney(double money) {
        if (money < 0){
            throw new IllegalArgumentException("Money cannot be negative");
        }
        this.money = money;
    }
}