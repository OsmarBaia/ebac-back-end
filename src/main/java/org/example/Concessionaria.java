package org.example;

import java.util.ArrayList;
import java.util.List;

public class Concessionaria {
    private List<Carro> carros = new ArrayList<>();

    public <T extends Carro> void adicionarCarro(T carro) {
        carros.add(carro);
    }

    public void imprimirCarros() {
        for (Carro carro : carros) {
            System.out.println(carro);
        }
    }
}