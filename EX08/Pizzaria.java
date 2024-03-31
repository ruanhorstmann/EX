package EX.EX08;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pizzaria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Menu de pizzas disponíveis
        Pizza pizza1 = new Pizza("Calabresa", 25.0f, criarIngredientes("Molho de tomate", "Calabresa", "Cebola", "Queijo"));
        Pizza pizza2 = new Pizza("Margherita", 28.0f, criarIngredientes("Molho de tomate", "Mussarela", "Manjericão"));
        Pizza pizza3 = new Pizza("Quatro Queijos", 30.0f, criarIngredientes("Molho de tomate", "Mussarela", "Provolone", "Parmesão", "Gorgonzola"));

        // Criando um pedido
        Pedido pedido = new Pedido();

        // Interagindo com o usuário para adicionar pizzas ao pedido
        boolean continuar = true;
        while (continuar) {
            System.out.println("Escolha uma pizza pelo número:");
            System.out.println("1. Calabresa");
            System.out.println("2. Margherita");
            System.out.println("3. Quatro Queijos");
            System.out.println("0. Concluir pedido");

            int escolha = scanner.nextInt();
            switch (escolha) {
                case 1:
                    pedido.adicionarPizza(pizza1);
                    break;
                case 2:
                    pedido.adicionarPizza(pizza2);
                    break;
                case 3:
                    pedido.adicionarPizza(pizza3);
                    break;
                case 0:
                    continuar = false;
                    break;
                default:
                    System.out.println("Opção inválida. Escolha novamente.");
            }
        }

        
        System.out.println("Informe o endereço de entrega:");
        scanner.nextLine(); 
        String endereco = scanner.nextLine();
        pedido.setEnderecoEntrega(endereco);

        
        pedido.imprimirDetalhes();

        
        System.out.println("Deseja cancelar o pedido? (S/N)");
        String resposta = scanner.nextLine();
        if (resposta.equalsIgnoreCase("S")) {
            pedido.cancelarPedido();
        }

        scanner.close();
    }

    
    private static List<String> criarIngredientes(String... ingredientes) {
        List<String> listaIngredientes = new ArrayList<>();
        for (String ingrediente : ingredientes) {
            listaIngredientes.add(ingrediente);
        }
        return listaIngredientes;
    }
}