package org.example;

public abstract class Carro {
    private final String modelo;

    public Carro(String modelo) {
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }

    @Override
    public String toString() {
        return "Carro: " + modelo;
    }
}
