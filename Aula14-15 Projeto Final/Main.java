package com.company;

public class Main {
    public static void main(String[] args) {
        Video v[] = new Video[3];
        v[0] = new Video("Aula 1 de POO");
        v[1] = new Video("Aula 2 de POO");
        v[2] = new Video("Aula 3 de POO");

        Gafanhoto g[] = new Gafanhoto[2];
        g[0] = new Gafanhoto("Andrey", "M", 18, "andreysc");
        g[1] = new Gafanhoto("Adler", "M", 26, "Adlerrr");

        Visualizacao view[] = new Visualizacao[5];

        view[0] = new Visualizacao(g[0], v[0]);
        view[0].avaliar();
        System.out.println(view[0].toString());

        view[1] = new Visualizacao(g[1], v[1]);
        System.out.println(view[1].toString());

        view[2] = new Visualizacao(g[0], v[1]);
        view[2].avalair(87.0f);
        System.out.println(view[2].toString());
    }
}