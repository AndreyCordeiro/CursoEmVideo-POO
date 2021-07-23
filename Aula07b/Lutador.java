package com.company;

import jdk.swing.interop.SwingInterOpUtils;

public class Lutador {
    private String nome, nacionalidade, categoria;
    private int idade, vitorias, derrotas, empates;
    private float altura, peso;

    public void apresentar() {
        System.out.println("=-=-=-=-= APRESENTAÇÃO DOS LUTADORES! =-=-=-=-=");
        System.out.println("Vindo diretamente do(a) " + this.getNacionalidade() + "!");
        System.out.println("Medindo " + this.getAltura() + " e pesando exatos " + this.getPeso() + "Kg!");
        System.out.println("Com um total de " + this.getVitorias() + " vitórias e " + this.getDerrotas() + " derrotas!");
        System.out.println("E com um número de empates de " + this.getEmpates());
        System.out.println("Apresentamos " + this.getNome());
    }

    public void status() {
        System.out.println("=-=-=-=-= STATUS =-=-=-=-=");
        System.out.println(this.getNome() + " é peso " + this.getCategoria());
        System.out.println("Ganhou: " + this.getVitorias());
        System.out.println("Perdeu: " + this.getDerrotas());
        System.out.println("Empatou: " + this.getEmpates());
    }

    public void ganharLuta() {
        this.setVitorias((this.getVitorias() + 1));
    }

    public void perderLuta() {
        this.setDerrotas(this.getDerrotas() + 1);
    }

    public void empatarLuta() {
        this.setEmpates(this.getEmpates() + 1);
    }

    public Lutador(String nome, String nacionalidade, int idade, int vitorias, int derrotas, int empates, float altura, float peso) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
        this.altura = altura;
        this.setPeso(peso);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        if (this.peso < 52.2) {
            this.categoria = "Inválido!";
        } else if (this.peso <= 70.3) {
            this.categoria = "Peso leve";
        } else if (this.peso <= 83.9) {
            this.categoria = "Peso médio";
        } else if (this.peso <= 120.2) {
            this.categoria = "Peso pesado";
        } else {
            this.categoria = "Inválido!";
        }
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }
}