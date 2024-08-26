package Lab05_Polymorphism.Animals_03;

public class Cat extends Animal{

    private static final String sound = "MEEOW";
    protected Cat(String name, String favouriteFood) {
        super(name, favouriteFood);
    }

    @Override
    public String explainSelf() {
        return super.explainSelf() + System.lineSeparator() + sound;
    }
}
