package EX.EX04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar informações do jogador ao usuário
        System.out.println("Digite o nome do jogador:");
        String nomeJogador = scanner.nextLine();

        System.out.println("Digite a pontuação inicial do jogador:");
        int pontuacaoInicial = scanner.nextInt();

        System.out.println("Digite o nível inicial do jogador:");
        int nivelInicial = scanner.nextInt();

        // Criar um jogador com as informações fornecidas
        Jogador jogador = new Jogador(nomeJogador, pontuacaoInicial, nivelInicial);

        // Exibir informações do jogador
        System.out.println("\nInformações Iniciais do Jogador:");
        jogador.exibirInformacoes();

        // Interagir com o jogador: aumentar a pontuação
        System.out.println("\nDigite a quantidade de pontos a serem adicionados:");
        int pontosParaAdicionar = scanner.nextInt();
        jogador.aumentarPontuacao(pontosParaAdicionar);

        // Exibir informações atualizadas do jogador
        System.out.println("\nPontuação atualizada:");
        jogador.exibirInformacoes();

        scanner.close();
    }
}