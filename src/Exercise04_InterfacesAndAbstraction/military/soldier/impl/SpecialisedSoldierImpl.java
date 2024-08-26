package Exercise04_InterfacesAndAbstraction.military.soldier.impl;

import Exercise04_InterfacesAndAbstraction.military.enumm.Corp;
import Exercise04_InterfacesAndAbstraction.military.privvate.impl.PrivateImpl;
import Exercise04_InterfacesAndAbstraction.military.soldier.SpecialisedSoldier;

public abstract class SpecialisedSoldierImpl extends PrivateImpl implements SpecialisedSoldier {

    private Corp corps;

    public SpecialisedSoldierImpl(int id, String firstName, String lastName, double salary,String corps) {
        super(id, firstName, lastName, salary);
        this.setCorps(corps);
    }

    @Override
    public Corp getCorps() {
        return corps;
    }

    public void setCorps(String corps) {
        this.corps = Corp.valueOf(corps);
    }
}
