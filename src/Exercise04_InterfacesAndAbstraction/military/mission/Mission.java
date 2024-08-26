package Exercise04_InterfacesAndAbstraction.military.mission;

import Exercise04_InterfacesAndAbstraction.military.enumm.State;

public interface Mission {
    String getCodeName();
    State getState();
    void completeMission();
}
