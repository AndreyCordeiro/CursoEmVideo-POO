package com.company;

public class Main {
    public static void main(String[] args) {
        Caneta c1 = new Caneta("BIC", "Preta", 0.3f);
        System.out.println("Informações da caneta 1");
        c1.status();

        Caneta c2 = new Caneta("Pencil", "Vermelha", 0.5f);
        System.out.println("\nInformações da caneta 2");
        c2.destampar();
        c2.status();
    }
}