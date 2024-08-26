package Exercise04_InterfacesAndAbstraction.military.general;

import Exercise04_InterfacesAndAbstraction.military.privvate.Private;

import java.util.Collection;

public interface LieutenantGeneral {

    Collection<Private> getPrivates();
    void addPrivate(Private priv);
}
