package Lab01_WorkingWithAbstraction.StudentSystem_03;

public class Student {
    private String name;
    private int age;
    private double grade;

    public Student(String name, int age, double grade) {
       this.setAge(age);
       this.setName(name);
       this.setGrade(grade);
    }
    private void setName(String name) {this.name = name;}
    private void setAge(int age) {this.age = age;}
    private void setGrade(double grade) {this.grade = grade;}
    public String getName() {return this.name;}
    public int getAge() {return this.age;}
    public double getGrade() {return this.grade;}
}