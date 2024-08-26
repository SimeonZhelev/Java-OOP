package Exercise05_Polymorphism.Vehicle_01;

import java.text.DecimalFormat;

public abstract class VehicleImpl_01 implements Vehicle_01 {

    private double fuelQuantity;
    private double fuelConsumption;

    public VehicleImpl_01(double fuelQuantity, double fuelConsumption) {
        this.fuelQuantity = fuelQuantity;
        this.fuelConsumption = fuelConsumption;
    }

    public String drive(double distance) {
        DecimalFormat df = new DecimalFormat("#.##");
        double neededFuel = this.fuelConsumption * distance;

        String result = String.format("%s needs refueling",
                                        this.getClass().getSimpleName());

        if (this.fuelQuantity >= neededFuel){
            result = String.format("%s travelled %s km",
                                    this.getClass().getSimpleName(),
                                    df.format(distance));
            this.fuelQuantity -= neededFuel;
        }
        return result;
    }
    @Override
    public void refuel(double liters) {
        this.fuelQuantity += liters;
    }

    @Override
    public String toString() {
        return String.format("%s: %.2f",this.getClass().getSimpleName(),this.fuelQuantity);
    }
}