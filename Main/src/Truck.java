public class Truck extends Vehicle {
    private final double milesDriven;
    private final double fuelConsumed;
    private final double cargoWeight;

    public Truck(String make, String model, int year, double milesDriven, double fuelConsumed, double cargoWeight) {
        super(make, model, year);
        this.milesDriven = milesDriven;
        this.fuelConsumed = fuelConsumed;
        this.cargoWeight = cargoWeight;
        Main.vehicles.add(this);
    }

    public double getMilesDriven() {
        return milesDriven;
    }

    public double getFuelConsumed() {
        return fuelConsumed;
    }

    public double getCargoWeight() {
        return cargoWeight;
    }

    @Override
    public double calculateFuelEfficiency() {
        return milesDriven / (fuelConsumed + (this.cargoWeight * 0.5));
    }
}