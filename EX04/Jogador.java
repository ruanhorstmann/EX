package EX.EX04;

import java.util.ArrayList;
import java.util.Scanner;

public class Jogador {
    private String nome;
    private int pontuacao;
    private int nivel;

    // Construtor
    public Jogador(String nome, int pontuacao, int nivel) {
        this.nome = nome;
        this.pontuacao = pontuacao;
        this.nivel = nivel;
    }

    // Método para aumentar a pontuação
    public void aumentarPontuacao(int pontos) {
        this.pontuacao += pontos;
        if (this.pontuacao > 10) {
            subirNivel();
        }
    }

    // Método para subir de nível
    private void subirNivel() {
        this.nivel++;
        System.out.println("O jogador " + nome + " subiu de nível para " + nivel);
    }

    // Método para exibir informações do jogador
    public void exibirInformacoes() {
        System.out.println("Nome do Jogador: " + nome);
        System.out.println("Pontuação: " + pontuacao);
        System.out.println("Nível: " + nivel);
    }
}