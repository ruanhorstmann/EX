package EX.EX03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner cliente = new Scanner(System.in);
        List<ContaBancaria> contas = new ArrayList<>(); // Lista para armazenar as contas

        while (true) {
            System.out.println("Informe a opção desejada: ");
            System.out.println("1 - Adicionar cliente");
            System.out.println("2 - Selecionar cliente");
            System.out.println("3 - Depositar");
            System.out.println("4 - Sacar");
            System.out.println("5 - Consultar saldo");
            System.out.println("0 - Sair");

            int opcao = cliente.nextInt();

            if (opcao == 0) {
                System.out.println("Saindo...");
                break;
            }

            switch (opcao) {
                case 1:
                    // Adicionar novo cliente
                    adicionarCliente(cliente, contas);
                    break;
                case 2:
                    // Selecionar cliente existente
                    selecionarCliente(cliente, contas);
                    break;
                case 3:
                    // Depositar
                    depositar(cliente, contas);
                    break;
                case 4:
                    // Sacar
                    sacar(cliente, contas);
                    break;
                case 5:
                    // Consultar saldo
                    consultarSaldo(contas);
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }

        cliente.close();
    }

    // Método para adicionar um novo cliente
    public static void adicionarCliente(Scanner cliente, List<ContaBancaria> contas) {
        System.out.println("Insira número da conta: ");
        int numeroConta = cliente.nextInt();

        System.out.println("Insira o nome do titular da conta: ");
        cliente.nextLine();
        String nomeTitular = cliente.nextLine();

        System.out.println("Informe o saldo inicial: ");
        float saldoInicial = cliente.nextFloat();

        contas.add(new ContaBancaria(numeroConta, nomeTitular, saldoInicial));
        System.out.println("Cliente adicionado com sucesso!");
    }

    // Método para selecionar um cliente existente
    public static ContaBancaria selecionarCliente(Scanner cliente, List<ContaBancaria> contas) {
        System.out.println("Insira número da conta do cliente: ");
        int numeroConta = cliente.nextInt();

        for (ContaBancaria conta : contas) {
            if (conta.getNumeroConta() == numeroConta) {
                System.out.println("Cliente selecionado: " + conta.getNomeTitular());
                return conta;
            }
        }

        System.out.println("Cliente não encontrado!");
        return null;
    }

    // Método para depositar em uma conta selecionada
    public static void depositar(Scanner cliente, List<ContaBancaria> contas) {
        ContaBancaria conta = selecionarCliente(cliente, contas);
        if (conta != null) {
            System.out.println("Informe o valor que deseja depositar: ");
            float valor = cliente.nextFloat();
            conta.depositar(valor);
        }
    }

    // Método para sacar de uma conta selecionada
    public static void sacar(Scanner cliente, List<ContaBancaria> contas) {
        ContaBancaria conta = selecionarCliente(cliente, contas);
        if (conta != null) {
            System.out.println("Informe o valor que deseja sacar: ");
            float valor = cliente.nextFloat();
            conta.sacar(valor);
        }
    }

    // Método para consultar o saldo de uma conta selecionada
    public static void consultarSaldo(List<ContaBancaria> contas) {
        ContaBancaria conta = selecionarCliente(new Scanner(System.in), contas);
        if (conta != null) {
            System.out.println("Saldo atual: " + conta.getSaldo());
        }
    }
}
