package Lab02_Encapsulation.SalaryIncrease_02;
public class Person_02 {
    private final static String TO_STRING_TEMPLATE = "%s %s gets %.1f leva";

    private String firstName;
    private String lastName;
    private int age;
    private double salary;

    public Person_02(String firstName, String lastName, int age, double salary) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.salary = salary;
    }
    public String getFirstName() {
            return this.firstName;
        }
    public String getLastName() { return this.lastName; }
    public double getSalary() { return this.salary; }
    public int getAge() {
            return this.age;
        }
    public void setSalary(double salary) { this.salary = salary; }
    public void increaseSalary(double percentage){
        if (this.getAge() < 30){
                this.setSalary(this.getSalary() + (this.getSalary() * percentage / 200));
        } else {
                this.setSalary(this.getSalary() + (this.getSalary() * percentage / 100));
        }
    }
    @Override
        public String toString() {
            return String.format(TO_STRING_TEMPLATE,this.getFirstName(), this.getLastName(), this.getSalary());
    }
}