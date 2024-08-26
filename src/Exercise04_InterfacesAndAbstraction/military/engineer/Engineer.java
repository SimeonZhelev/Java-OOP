package Exercise04_InterfacesAndAbstraction.military.engineer;

import Exercise04_InterfacesAndAbstraction.military.repair.Repair;

import java.util.Collection;

public interface Engineer {
    void addRepair(Repair repair);

    Collection<Repair> getRepairs();
}
