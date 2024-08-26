package Lab02_Encapsulation.SortByNameAndAge_01;

public class Person_01 {

    private final static String TO_STRING_TEMPLATE = "%s %s is %d years old.";
    private String firstName;
    private String lastName;
    private int age;

    public Person_01(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
    public String getFirstName() {
        return this.firstName;
    }
    public int getAge() {
        return this.age;
    }

    @Override
    public String toString() {
        return String.format(TO_STRING_TEMPLATE,this.getFirstName(), this.lastName, this.getAge());
    }
}
