package EX.EX02;

import java.util.ArrayList;
import java.util.Scanner;

class Livro {
    private String titulo;
    private String autor;
    private int anoPublicacao;

    public Livro(String titulo, String autor, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    public void exibirInfo() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Ano de Publicação: " + anoPublicacao);
    }

    public String getTitulo() {
        return titulo;
    }

    // Se necessário, implemente getters para os outros atributos
}

class Biblioteca {
    private ArrayList<Livro> colecao;

    public Biblioteca() {
        colecao = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro) {
        colecao.add(livro);
    }

    public void exibirLivros() {
        System.out.println("Livros na Biblioteca:");
        for (Livro livro : colecao) {
            livro.exibirInfo();
            System.out.println(); // Adiciona uma linha em branco entre os livros
        }
    }
}