package Lab01_WorkingWithAbstraction.StudentSystem_03;

import java.util.HashMap;
import java.util.Map;

public class StudentSystem {
    private Map<String, Student> repo;

    public StudentSystem() {

    }

    private Map<String, Student> getRepo() {
        if (this.repo == null){
            this.repo = new HashMap<>();
        }
        return repo;
    }
    public void parseCommand(String[]args) {

        switch (args[0]){

            case "Create":
                var student = this.create(args);
                this.getRepo().putIfAbsent(student.getName(), student);
                break;
            case "Show":
                var name = args[1];
                student = getRepo().get(name);
                if (student != null){
                    final var show = this.show(student);

                    System.out.println(show);
                }
                break;
        }
    }
    private Student create(String[] args){
        var name = args[1];
        var age = Integer.parseInt(args[2]);
        var grade =Double.parseDouble(args[3]);
        return new Student(name, age, grade);
    }
    private String show (Student student){
        String view = String.format("%s is %s years old.",student.getName(),student.getAge());

        if (student.getGrade() >= 5.00) {
            view += " Excellent student.";
        } else if (student.getGrade() < 5.00 && student.getGrade() >= 3.50) {
            view += " Average student.";
        } else {
            view += " Very nice person.";
        }
        return view;
    }
}