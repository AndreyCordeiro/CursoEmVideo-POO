package com.company;

public class Caneta {
    String info;
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;

    void status() {
        System.out.println("Informações: " + this.info);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("A caneta de cor " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga + "%");
        System.out.println("Está tampada? " + this.tampada);
    }

    void rabiscar() {
        if (this.tampada == true) {
            System.out.println("Não posso rabiscar com a ponta tampada!\n");
        } else if (this.carga <= 0) {
            System.out.println("Não posso rabiscar sem tinta!");
        } else {
            System.out.println("Rabiscando...");
        }
    }

    void tampar() {
        this.tampada = true;
    }

    void destampar() {
        this.tampada = false;
    }
}
