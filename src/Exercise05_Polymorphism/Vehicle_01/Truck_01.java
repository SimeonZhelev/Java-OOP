package Exercise05_Polymorphism.Vehicle_01;

public class Truck_01 extends VehicleImpl_01 {
    public Truck_01(double fuelQuantity, double fuelConsumption) {
        super(fuelQuantity, fuelConsumption + 1.6);
    }
    @Override
    public void refuel(double liters) {
        super.refuel(liters * 0.95);
    }
}