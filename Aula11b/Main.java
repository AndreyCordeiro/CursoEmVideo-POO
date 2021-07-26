package com.company;

public class Main {

    public static void main(String[] args) {
        Visitante v1 = new Visitante();
        v1.setNome("Pedro");
        v1.setIdade(40);
        v1.setSexo("M");
        System.out.println(v1.toString());

        Aluno a1 = new Aluno();
        a1.setNome("Geovana");
        a1.setMatricula(123);
        a1.setIdade(18);
        a1.setSexo("F");
        System.out.println(a1.toString());
        a1.pagarMensalidade();

        Bolsista b1 = new Bolsista();
        b1.setNome("Marcos");
        b1.setMatricula(456);
        b1.setBolsa(12.5f);
        b1.setSexo("M");
        System.out.println(b1.toString());
        b1.pagarMensalidade();

        Tecnico t1 = new Tecnico();
        t1.setNome("Bruno");
        t1.setIdade(23);
        t1.setSexo("M");
        t1.setRegistroProfissional(1225161);
        System.out.println(t1.toString());
        t1.praticar();

        Professor p1 = new Professor();
        p1.setNome("Jean");
        p1.setIdade(27);
        p1.setSexo("M");
        p1.setEspecialidade("Matemática");
        p1.setSalario(3560);
        System.out.println(p1.toString());
        p1.receberAumento();
    }
}