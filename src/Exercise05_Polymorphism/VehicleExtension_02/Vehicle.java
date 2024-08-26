package Exercise05_Polymorphism.VehicleExtension_02;

public interface Vehicle {

    String drive(double distance);
    void refuel(double liters);

    default void setEmpty(boolean empty){

    }

}
