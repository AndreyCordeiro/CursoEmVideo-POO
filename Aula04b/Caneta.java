package com.company;

public class Caneta {
    public String modelo;
    private String cor;
    private float ponta;
    private boolean tampada;

    public Caneta(String m, String c, float p) { //Método Construtor
        this.setModelo(m);
        this.setCor(c);
        this.setPonta(p);
        this.tampar(); //Tampada por padrão
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String m) {
        this.modelo = m;
    }

    public float getPonta() {
        return this.ponta;
    }

    public void setPonta(float p) {
        this.ponta = p;
    }

    public String getCor() {
        return this.cor;
    }

    public void setCor(String c) {
        this.cor = c;
    }

    public void tampar() {
        this.tampada = true;
    }

    public void destampar() {
        this.tampada = false;
    }

    public void status() {
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Ponta: " + this.getPonta());
        System.out.println("Cor: " + this.getCor());
        System.out.println("Tampada? " + this.tampada);
    }
}