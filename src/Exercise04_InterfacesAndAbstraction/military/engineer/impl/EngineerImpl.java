package Exercise04_InterfacesAndAbstraction.military.engineer.impl;

import Exercise04_InterfacesAndAbstraction.military.engineer.Engineer;
import Exercise04_InterfacesAndAbstraction.military.repair.Repair;
import Exercise04_InterfacesAndAbstraction.military.soldier.impl.SpecialisedSoldierImpl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class EngineerImpl extends SpecialisedSoldierImpl implements Engineer {

    private Collection<Repair> repairs;

    public EngineerImpl(int id, String firstName,
                        String lastName, double salary,
                        String corps, Collection<Repair> repairs) {
        super(id, firstName, lastName, salary, corps);
        this.setRepairs(repairs);
    }

    @Override
    public void addRepair(Repair repair) {
        this.repairs.add(repair);
    }

    @Override
    public Collection<Repair> getRepairs() {
        return Collections.unmodifiableCollection(this.repairs);
    }

    private void setRepairs(Collection<Repair> repairs) {
        if (null == repairs){
            this.repairs = new ArrayList<>();
        } else {
        this.repairs = repairs;
        }
    }
}
