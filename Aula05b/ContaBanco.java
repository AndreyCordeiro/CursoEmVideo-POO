package com.company;

public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public void estadoAtual() {
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("            Status da Conta            ");
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo da Conta: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: R$" + this.getSaldo());
        System.out.println("Status da Conta: " + this.getStatus());
    }

    public void abrirConta(String t) {
        this.setTipo(t);
        this.setStatus(true);
        if (t == "CC") {
            this.setSaldo(50);
        } else if (t == "CP") {
            this.setSaldo(150);
        } else {
            System.out.println("");
        }
        System.out.println("Conta aberta com sucesso!");
    }

    public void fecharConta() {
        if (this.getSaldo() > 0) {
            System.out.println(this.getDono() + ", sua conta não pode ser fechada pois ainda tem dinheiro!");
        } else if (this.getSaldo() < 0) {
            System.out.println(this.getDono() + ", sua conta não pode ser fechada pois você ainda deve!");
        } else {
            this.setStatus(false);
            System.out.println("Conta de " + this.getDono() +"fechada com sucesso!");
        }
    }

    public void depositar(float v) {
        if (this.getStatus()) {
            this.setSaldo(this.getSaldo() + v); //Poderia ser: this.saldo = this.saldo + v
            System.out.println("Depósito realizado na conta de " + this.getDono());
        } else {
            System.out.println(this.getDono() + ", impossível depositar em uma conta fechada!");
        }
    }

    public void sacar(float v) {
        if (this.getStatus()) {
            if (this.getSaldo() >= v) {
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Saque realizado na conta de " + this.getDono());
            } else {
                System.out.println(this.getDono() + ", saldo insuficiente!");
            }
        } else {
            System.out.println(this.getDono() + ", impossível sacar de uma conta fechada!");
        }
    }

    public void pagarMensal() {
        int v = 0;

        if (getTipo() == "CC") {
            v = 12;
        } else if (getTipo() == "CP") {
            v = 20;
        }

        if (this.getStatus()) {
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Mensalidade na Conta de" + this.getDono() + " paga com sucesso!");
        } else {
            System.out.println("Não é possível cobrar mensalidade de uma conta fechada!");
        }
    }

    public void ContaBanco() {
        this.setSaldo(0);
        this.setStatus(false);
    }

    public void setNumConta(int n) {
        this.numConta = n;
    }

    public int getNumConta() {
        return this.numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }
}
