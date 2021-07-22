package com.company;

public class Caneta {
    public String info;
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    private boolean tampada;

    public void status() {
        System.out.println("Informações: " + this.info);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("A caneta de cor " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga + "%");
        System.out.println("Está tampada? " + this.tampada);
    }

    public void rabiscar() {
        if (this.tampada == true) {
            System.out.println("Não posso rabiscar com a ponta tampada!\n");
        } else if (this.carga <= 0) {
            System.out.println("Não posso rabiscar sem tinta!");
        } else {
            System.out.println("Rabiscando...");
        }
    }

    public void tampar() {
        this.tampada = true;
    }

    public void destampar() {
        this.tampada = false;
    }
}
