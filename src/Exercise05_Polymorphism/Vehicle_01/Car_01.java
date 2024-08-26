package Exercise05_Polymorphism.Vehicle_01;

public class Car_01 extends VehicleImpl_01 {
    public Car_01(double fuelQuantity, double fuelConsumption) {
        super(fuelQuantity, fuelConsumption + 0.9);
    }

}
