package Exercise03_Inheritance.Animals_06.frogs;

import Exercise03_Inheritance.Animals_06.Animal;

public class Frog extends Animal {
    public Frog(String name, int age, String gender) {
        super(name, age, gender);
    }

    @Override
    public String produceSound() {
        return "Ribbit!";
    }
}
