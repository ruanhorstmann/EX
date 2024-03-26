package EX.EX05;

import java.util.Scanner;

public class Condutor {
    public static void main(String[] args) {
        Scanner condutor = new Scanner(System.in);

        System.out.println("Informe a marca do veículo: ");
        String marca = condutor.nextLine();

        System.out.println("Informe o modelo do veículo: ");
        String modelo = condutor.nextLine();

        System.out.println("Informe o ano do veículo: ");
        int ano = 0;
        while (true) {
            try {
                ano = Integer.parseInt(condutor.nextLine());
                if (ano < 0) {
                    throw new IllegalArgumentException("Ano do veículo deve ser um número positivo.");
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Por favor, insira um ano válido (número).");
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println("Informe a velocidade atual do veículo (em km/h): ");
        float velocidadeInicial = 0.0f;
        while (true) {
            try {
                velocidadeInicial = Float.parseFloat(condutor.nextLine());
                if (velocidadeInicial < 0) {
                    throw new IllegalArgumentException("Velocidade inicial do veículo deve ser um número positivo.");
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Por favor, insira uma velocidade válida (número).");
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        Carro carro = new Carro(marca, modelo, ano, velocidadeInicial);

        System.out.println("\nInformações do veículo: ");
        carro.exibirInformacoes();

        System.out.println("\nAcelerando o veículo...");
        carro.acelerar();

        System.out.println("\nFreando o veículo...");
        carro.frear();

        condutor.close();
    }
}