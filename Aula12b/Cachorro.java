package com.company;

public class Cachorro extends Mamifero {

    public void enterrarOsso() {
        System.out.println("Enterrando Osso!");
    }

    public void abanarRabo() {
        System.out.println("Abanando rabo!");
    }

    @Override
    public void emitirSom() {
        System.out.println("Au au au!");
    }
}