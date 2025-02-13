package org.example;

// Fábrica abstrata
public interface VehicleFactory {
    Car createCar();
    Motorcycle createMotorcycle();
}