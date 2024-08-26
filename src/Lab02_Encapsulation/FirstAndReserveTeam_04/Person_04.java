package Lab02_Encapsulation.FirstAndReserveTeam_04;

public class Person_04 {
    private final static String TO_STRING_TEMPLATE = "%s %s gets %.1f leva";

    private String firstName;
    private String lastName;
    private int age;
    private double salary;

    public Person_04(String firstName, String lastName, int age, double salary) {
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setAge(age);
        this.setSalary(salary);
    }

    public String getFirstName() {
        return this.firstName;
    }
    public void setFirstName(String firstName) {
        if (firstName == null || firstName.trim().length() < 3) {
            throw new IllegalArgumentException("First name cannot be less than 3 symbols");
        }
        this.firstName = firstName;

    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        if (lastName == null || lastName.trim().length() < 3) {
            throw new IllegalArgumentException("Last name cannot be less than 3 symbols");
        }
        this.lastName = lastName;

    }
    public double getSalary() {
        return this.salary;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        if (age <= 0) {
            throw new IllegalArgumentException("Age cannot be zero or negative integer");
        }
        this.age = age;

    }
    public void setSalary(double salary) {
        if (salary < 460) {
            throw new IllegalArgumentException("Salary cannot be less than 460 leva");
        }
        this.salary = salary;

    }
    public void increaseSalary(double percentage) {
        if (this.getAge() < 30) {
            this.setSalary(this.getSalary() + (this.getSalary() * percentage / 200));
        } else {
            this.setSalary(this.getSalary() + (this.getSalary() * percentage / 100));
        }
    }
    @Override
    public String toString() {
        return String.format(TO_STRING_TEMPLATE, this.getFirstName(), this.getLastName(), this.getSalary());
    }
}