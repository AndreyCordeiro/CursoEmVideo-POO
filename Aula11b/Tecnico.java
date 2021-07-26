package com.company;

public class Tecnico extends Pessoa {
    private int registroProfissional;

    public void praticar() {
        System.out.println("O técnico " + this.getNome() + " está praticando!");
    }

    public int getRegistroProfissional() {
        return registroProfissional;
    }

    public void setRegistroProfissional(int registroProfissional) {
        this.registroProfissional = registroProfissional;
    }
}