package org.example;

public class CombustionVehicleFactory implements VehicleFactory {
    @Override
    public Car createCar() {
        return new CombustionCar();
    }

    @Override
    public Motorcycle createMotorcycle() {
        return new CombustionMotorcycle();
    }
}