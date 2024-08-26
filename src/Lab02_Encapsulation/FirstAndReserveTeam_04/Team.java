package Lab02_Encapsulation.FirstAndReserveTeam_04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Team {

    private String name;

    private  List<Person_04> firstTeam;

    private  List<Person_04> reserveTeam;

    public Team (String name){
        this(name, new ArrayList<>(), new ArrayList<>());
    }

    private Team(String name, List<Person_04> firstTeam, List<Person_04> reverseTeam) {
        this.setName(name);
        this.firstTeam = firstTeam;
        this.reserveTeam = reverseTeam;
    }
    public String getName() {
        return name;
    }
    public List<Person_04> getFirstTeam() {
        return Collections.unmodifiableList(this.firstTeam);
    }
    public List<Person_04> getReserveTeam() {
        return Collections.unmodifiableList(this.reserveTeam);
    }
    public void setFirstTeam(List<Person_04> firstTeam) {
        this.firstTeam = firstTeam;
    }
    public void addPlayer(Person_04 person){
        if (person.getAge() < 40){
            this.firstTeam.add(person);
        } else {
            this.reserveTeam.add(person);
        }
    }
    private void setName(String name) {
        this.name = name;
    }
}