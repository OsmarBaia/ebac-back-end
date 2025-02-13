package org.example;

public class Main {
    public static void main(String[] args) {
        Tabela tabelaAnnotation = Cliente.class.getAnnotation(Tabela.class);

        if (tabelaAnnotation != null) {
            String nomeDaTabela = tabelaAnnotation.value();
            System.out.println("Nome da tabela: " + nomeDaTabela);
        } else {
            System.out.println("A annotation Tabela não foi encontrada.");
        }
    }
}