package com.company;

public class Main {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();

        c1.info = "Caneta 1";
        c1.modelo = "BIC";
        c1.cor = "Azul";
        c1.ponta = 0.4f;
        c1.carga = 30;
        c1.tampar();
        c1.status();
        c1.rabiscar();

        Caneta c2 = new Caneta();

        c2.info = "Caneta 2";
        c2.modelo = "BIC";
        c2.cor = "Preta";
        c2.ponta = 0.3f;
        c2.carga = 100;
        c2.destampar();
        c2.status();
        c2.rabiscar();
    }
}
