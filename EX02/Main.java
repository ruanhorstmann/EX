package EX.EX02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Biblioteca biblioteca = new Biblioteca();

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Adicionar livro");
            System.out.println("2. Exibir livros");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o título do livro: ");
                    scanner.nextLine();
                    String titulo = scanner.nextLine();
                    System.out.print("Digite o autor do livro: ");
                    String autor = scanner.nextLine();
                    System.out.print("Digite o ano de publicação do livro: ");
                    int ano = scanner.nextInt();
                    Livro novoLivro = new Livro(titulo, autor, ano);
                    biblioteca.adicionarLivro(novoLivro);
                    System.out.println("Livro adicionado com sucesso!");
                    break;
                case 2:
                    biblioteca.exibirLivros();
                    break;
                case 3:
                    System.out.println("Saindo...");
                    System.exit(0);
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}