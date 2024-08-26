package Exercise03_Inheritance.Animals_06.cats;

public class Kitten extends Cat{
    private static final String GENDER = "Female";
    public Kitten(String name, int age) {
        super(name, age, GENDER);
    }

    @Override
    public String produceSound() {
        return "Meow";
    }
}
