package com.company;

public class Funcionario extends Pessoa {
    private String setor;
    private boolean trabalhando;

    private void mudarTrabalho() {
        this.trabalhando = !this.trabalhando;  // ( = ! ) Significa que irá receber o valor inverso.
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean getTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }
}