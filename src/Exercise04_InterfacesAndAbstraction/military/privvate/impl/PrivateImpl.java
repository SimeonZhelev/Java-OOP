package Exercise04_InterfacesAndAbstraction.military.privvate.impl;

import Exercise04_InterfacesAndAbstraction.military.privvate.Private;
import Exercise04_InterfacesAndAbstraction.military.soldier.impl.SoldierImpl;

public class PrivateImpl extends SoldierImpl implements Private {
    private double salary;

    public PrivateImpl(int id, String firstName, String lastName, double salary) {
        super(id, firstName, lastName);
        this.salary = salary;
    }

    @Override
    public double getSalary() {
        return 0;
    }
}
