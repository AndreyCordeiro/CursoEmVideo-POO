package com.company;

public class Livro implements Publicacao {
    private String titulo, autor;
    private int totPaginas, pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    public String detalhes() {
        return "Livro{" +
                "\ntitulo: " + titulo +
                "\nautor: " + autor +
                "\ntotPaginas: " + totPaginas +
                "\npagAtual: " + pagAtual +
                "\naberto: " + aberto +
                "\nleitor: " + leitor.getNome() + "}\n";
    }

    public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.aberto = false;
        this.pagAtual = 0;
        this.leitor = leitor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    @Override
    public void abrir() {
        this.aberto = true;
    }

    @Override
    public void fechar() {
        this.aberto = false;
    }

    @Override
    public void folhear(int p) {
        if (p > this.totPaginas) {
            this.pagAtual = 0;
            System.out.println("O livro possui apenas " + totPaginas + " páginas, então você não pode ir para a página " + p + "!");
        } else {
            this.pagAtual = p;
        }
    }

    @Override
    public void avancarPag() {
        if (this.aberto == false) {
            System.out.println("Não é possível avançar a página com o livro fechado!");
        } else {
            this.pagAtual++; // Significa + 1
        }
    }

    @Override
    public void voltarPag() {
        this.pagAtual--; // Significa - 1
    }
}