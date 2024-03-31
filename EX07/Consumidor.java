package EX.EX07;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Consumidor {
    private static List<Produto> estoque = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean executando = true;
        while (executando) {
            System.out.println("1 - Adicionar Produto");
            System.out.println("2 - Atualizar Produto");
            System.out.println("3 - Remover Produto");
            System.out.println("4 - Relatório de Estoque");
            System.out.println("5 - Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcao) {
                case 1:
                    adicionarProduto();
                    break;
                case 2:
                    atualizarProduto();
                    break;
                case 3:
                    removerProduto();
                    break;
                case 4:
                    relatorioEstoque();
                    break;
                case 5:
                    executando = false;
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
        scanner.close();
    }

    private static void adicionarProduto() {
        System.out.println("Digite o nome do produto:");
        String nome = scanner.nextLine();
        System.out.println("Digite o código do produto:");
        int codigo = scanner.nextInt();
        System.out.println("Digite a quantidade em estoque:");
        int quantidade = scanner.nextInt();
        System.out.println("Digite o preço do produto:");
        float preco = scanner.nextFloat();

        Produto produto = new Produto(nome, codigo, quantidade, preco);
        estoque.add(produto);
        System.out.println("Produto adicionado com sucesso!");
    }

    private static void atualizarProduto() {
        System.out.println("Digite o código do produto que deseja atualizar:");
        int codigo = scanner.nextInt();
        scanner.nextLine(); 

        Produto produto = encontrarProdutoPorCodigo(codigo);
        if (produto != null) {
            System.out.println("Digite a nova quantidade em estoque:");
            int novaQuantidade = scanner.nextInt();
            produto.adicionarEstoque(novaQuantidade); // Adiciona a nova quantidade ao estoque atual
            System.out.println("Estoque atualizado com sucesso!");
        } else {
            System.out.println("Produto não encontrado.");
        }
    }

    private static void removerProduto() {
        System.out.println("Digite o código do produto que deseja remover:");
        int codigo = scanner.nextInt();
        scanner.nextLine(); 

        Produto produto = encontrarProdutoPorCodigo(codigo);
        if (produto != null) {
            estoque.remove(produto);
            System.out.println("Produto removido com sucesso!");
        } else {
            System.out.println("Produto não encontrado.");
        }
    }

    private static void relatorioEstoque() {
        if (estoque.isEmpty()) {
            System.out.println("Estoque vazio.");
        } else {
            System.out.println("Relatório de Estoque:");
            float valorTotal = 0;
            for (Produto produto : estoque) {
                float valorProduto = produto.calcularValorTotal();
                valorTotal += valorProduto;
                System.out.println(produto + ", Valor total: R$" + valorProduto);
            }
            System.out.println("Valor total em estoque: R$" + valorTotal);
        }
    }

    private static Produto encontrarProdutoPorCodigo(int codigo) {
        for (Produto produto : estoque) {
            if (produto != null && produto.getCodigo() == codigo) {
                return produto;
            }
        }
        return null;
    }
}