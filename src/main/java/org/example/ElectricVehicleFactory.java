package org.example;

public class ElectricVehicleFactory implements VehicleFactory {
    @Override
    public Car createCar() {
        return new ElectricCar();
    }

    @Override
    public Motorcycle createMotorcycle() {
        return new ElectricMotorcycle();
    }
}