package Exercise04_InterfacesAndAbstraction.military.mission.impl;

import Exercise04_InterfacesAndAbstraction.military.enumm.State;
import Exercise04_InterfacesAndAbstraction.military.mission.Mission;

public class MissionImpl implements Mission {

    private String codeName;
    private State state;

    public MissionImpl(String codeName, String state) {
        this.codeName = codeName;
        this.setState(state);
    }

    @Override
    public String getCodeName() {
        return codeName;
    }

    @Override
    public State getState() {
        return state;
    }

    @Override
    public void completeMission() {
        this.state = State.finished;
    }

    public void setState(String state) {
        this.state = State.valueOf(state);
    }
}
