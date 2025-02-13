package org.example;

public class Main {
    public static void main(String[] args) {
        HondaCivic civic = new HondaCivic();
        ToyotaEtios etios = new ToyotaEtios();

        Concessionaria concessionaria = new Concessionaria();
        concessionaria.adicionarCarro(civic);
        concessionaria.adicionarCarro(etios);

        concessionaria.imprimirCarros();
    }
}