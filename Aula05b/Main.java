package com.company;

public class Main {
    public static void main(String[] args) {
        ContaBanco p1 = new ContaBanco();
        p1.setNumConta(12345);
        p1.abrirConta("CC");
        p1.setDono("Matheus");

        ContaBanco p2 = new ContaBanco();
        p2.setNumConta(678910);
        p2.abrirConta("CP");
        p2.setDono("Roberta");

        p1.depositar(700);
        p2.depositar(500);
        p2.sacar(300);
        p1.sacar(250);
        p2.depositar(150);

        p1.estadoAtual();
        p2.estadoAtual();
    }
}
