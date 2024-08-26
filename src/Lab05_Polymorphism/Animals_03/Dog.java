package Lab05_Polymorphism.Animals_03;

public class Dog extends Animal{

    private static final String sound = "DJAAF";
    protected Dog(String name, String favouriteFood) {
        super(name, favouriteFood);
    }

    @Override
    public String explainSelf() {
        return super.explainSelf() + System.lineSeparator() + sound;
    }
}
