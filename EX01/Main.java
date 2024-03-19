package EX.EX01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha a operação:");
        System.out.println("1 - Adição");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");

        int opcao = scanner.nextInt();

        System.out.println("Digite o primeiro número:");
        int num1 = scanner.nextInt();
        System.out.println("Digite o segundo número:");
        int num2 = scanner.nextInt();

        int resultado = 0;

        switch (opcao) {
            case 1:
                resultado = Calculadora.adicao(num1, num2);
                break;
            case 2:
                resultado = Calculadora.subtracao(num1, num2);
                break;
            case 3:
                resultado = Calculadora.multiplicacao(num1, num2);
                break;
            case 4:
                resultado = Calculadora.divisao(num1, num2);
                break;
            default:
                System.out.println("Opção inválida!");
        }

        System.out.println("Resultado: " + resultado);

        scanner.close();
    }
}
