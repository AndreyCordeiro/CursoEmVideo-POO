package com.company;

public class Main {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();

        c1.modelo = "BIC Cristal";
        c1.cor = "Vermelha";
        //c1.ponta = 0.5f;
        c1.carga = 85;
        //c1.tampada = true;
        c1.status();
        c1.rabiscar();
        c1.tampar();
    }
}
