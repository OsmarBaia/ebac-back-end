package org.example;

public class Main {
    public static void main(String[] args) {
        // fábrica de veículos elétricos
        VehicleFactory electricFactory = new ElectricVehicleFactory();
        Car electricCar = electricFactory.createCar();
        Motorcycle electricMotorcycle = electricFactory.createMotorcycle();

        electricCar.assemble();
        electricMotorcycle.assemble();

        // fábrica de veículos a combustão
        VehicleFactory combustionFactory = new CombustionVehicleFactory();
        Car combustionCar = combustionFactory.createCar();
        Motorcycle combustionMotorcycle = combustionFactory.createMotorcycle();

        combustionCar.assemble();
        combustionMotorcycle.assemble();
    }
}