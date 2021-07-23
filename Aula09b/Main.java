package com.company;

public class Main {
    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];

        p[0] = new Pessoa("João", "Masculino", 17);
        p[1] = new Pessoa("Maria", "Feminino", 27);

        l[0] = new Livro("O Ladrão de Raios", "Rick Riordan", 380, p[0]);
        l[1] = new Livro("HP LoveCraft Medo Clássico VOL I", "Howard Phillips Lovecraft", 400, p[1]);
        l[2] = new Livro("Aprendendo Java", "Gustavo Guanabara", 250, p[0]);

        l[0].abrir();
        l[0].folhear(100);
        l[0].voltarPag();
        System.out.println(l[0].detalhes());

        l[1].abrir();
        l[1].folhear(350);
        l[1].avancarPag();
        System.out.println(l[1].detalhes());

        l[2].abrir();
        l[2].avancarPag();
        System.out.println(l[2].detalhes());
    }
}