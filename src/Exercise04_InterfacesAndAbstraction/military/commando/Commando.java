package Exercise04_InterfacesAndAbstraction.military.commando;

import Exercise04_InterfacesAndAbstraction.military.mission.Mission;

import java.util.Collection;

public interface Commando {

    void addMission(Mission mission);
    Collection<Mission> getMissions();


}
