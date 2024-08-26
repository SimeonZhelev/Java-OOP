package Exercise04_InterfacesAndAbstraction.military.spy.impl;

import Exercise04_InterfacesAndAbstraction.military.soldier.impl.SoldierImpl;
import Exercise04_InterfacesAndAbstraction.military.spy.Spy;

public class SpyImpl extends SoldierImpl implements Spy {

    private int codeNumber;
    public SpyImpl(int id, String firstName, String lastName, int codeNumber) {
        super(id, firstName, lastName);
        this.codeNumber = codeNumber;
    }

    @Override
    public int getCodeNumber() {
        return codeNumber;
    }
}
