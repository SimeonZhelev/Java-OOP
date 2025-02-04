package Lab05_Polymorphism.Animals_03;

public abstract class Animal {
    private String name;
    private  String favouriteFood;

    protected Animal(String name, String favouriteFood) {
        this.setName(name);
        this.setFavouriteFood(favouriteFood);
    }

    private void setName(String name) {
        this.name = name;
    }

    private void setFavouriteFood(String favouriteFood) {
        this.favouriteFood = favouriteFood;
    }
    public String explainSelf(){
        return String.format("I am %s and my favourite food is %s",
                this.getName(),
                this. getFavouriteFood());
    }

    public final String getName() {
        return this.name;
    }

    public final String getFavouriteFood() {
        return this.favouriteFood;
    }
}
